
<%@page import="org.opencps.processmgt.util.ProcessOrderUtils"%>
<%@page import="org.opencps.servicemgt.util.ServiceUtil"%>
<%@page import="org.opencps.backend.util.DossierNoGenerator"%>
<%
/**
 * OpenCPS is the open source Core Public Services software
 * Copyright (C) 2016-present OpenCPS community
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
%>

<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="org.opencps.datamgt.model.DictItem"%>
<%@page import="org.opencps.datamgt.service.DictItemLocalServiceUtil"%>
<%@page import="org.opencps.dossiermgt.bean.DossierBean"%>
<%@page import="org.opencps.dossiermgt.model.Dossier"%>
<%@page import="org.opencps.dossiermgt.NoSuchDossierException"%>
<%@page import="org.opencps.dossiermgt.NoSuchDossierTemplateException"%>
<%@page import="org.opencps.dossiermgt.RequiredDossierPartException"%>
<%@page import="org.opencps.dossiermgt.search.DossierDisplayTerms"%>
<%@page import="org.opencps.dossiermgt.search.DossierSearch"%>
<%@page import="org.opencps.dossiermgt.search.DossierSearchTerms"%>
<%@page import="org.opencps.dossiermgt.service.DossierLocalServiceUtil"%>
<%@page import="org.opencps.dossiermgt.util.DossierMgtUtil"%>
<%@page import="org.opencps.servicemgt.model.ServiceInfo"%>
<%@page import="org.opencps.servicemgt.service.ServiceInfoLocalServiceUtil"%>
<%@page import="org.opencps.util.DateTimeUtil"%>
<%@page import="org.opencps.util.PortletUtil"%>
<%@page import="org.opencps.util.MessageKeys"%>
<%@page import="org.opencps.util.DictItemUtil"%>


<%@ include file="../../init.jsp"%>


<liferay-ui:success  key="<%=MessageKeys.DEFAULT_SUCCESS_KEY %>" message="<%=MessageKeys.DEFAULT_SUCCESS_KEY %>"/>

<liferay-ui:error 
	exception="<%= NoSuchDossierException.class %>" 
	message="<%=NoSuchDossierException.class.getName() %>"
/>
<liferay-ui:error 
	exception="<%= NoSuchDossierTemplateException.class %>" 
	message="<%=NoSuchDossierTemplateException.class.getName() %>"
/>
<liferay-ui:error 
	exception="<%= RequiredDossierPartException.class %>" 
	message="<%=RequiredDossierPartException.class.getName() %>"
/>

<%
	String dossierStatus = ParamUtil.getString(request, DossierDisplayTerms.DOSSIER_STATUS, StringPool.BLANK);
	int itemsToDisplay_cfg = GetterUtil.getInteger(portletPreferences.getValue("itemsToDisplay", "2"));
	
	long serviceDomainId = ParamUtil.getLong(request, "serviceDomainId");

	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", templatePath + "frontofficedossierlist.jsp");
	iteratorURL.setParameter("tabs1", DossierMgtUtil.TOP_TABS_DOSSIER);
	iteratorURL.setParameter(DossierDisplayTerms.DOSSIER_STATUS, String.valueOf(dossierStatus));
	iteratorURL.setParameter("serviceDomainId", String.valueOf(serviceDomainId));
	
	List<Dossier> dossiers =  new ArrayList<Dossier>();
	
	int totalCount = 0;
	
	try{
		
		dossiers = DossierLocalServiceUtil.getDossierByUserNewRequest(scopeGroupId, themeDisplay.getUserId(), 0, itemsToDisplay_cfg, 
			null);
		totalCount = dossiers.size();
	
	}catch(Exception e){
		_log.error(e);
		
	}
%>


<aui:row>
	<aui:col width="25">
	
	<div style="margin-bottom: 25px;" class="opencps-searchcontainer-wrapper default-box-shadow radius8">
		
		<div id="serviceDomainIdTree" class="openCPSTree"></div>
		
		<%=ProcessOrderUtils.generateTreeView("serviceDomainId", "SERVICE_DOMAIN", "0", 
				LanguageUtil.get(locale, "filter-by-service-domain") , 0,"serviceDomainIdTree", "radio", String.valueOf(serviceDomainId),
				false,renderRequest, iteratorURL)%>
		
	</div>
	<div class="opencps-searchcontainer-wrapper default-box-shadow radius8">
		
		<div id="dossierStatusTree" class="openCPSTree"></div>
	
		<%=ProcessOrderUtils.generateTreeView(DossierDisplayTerms.DOSSIER_STATUS, "DOSSIER_STATUS", "0", 
				LanguageUtil.get(locale, "dossier-status") , 0,"dossierStatusTree", "radio", String.valueOf(dossierStatus),
				true,renderRequest, iteratorURL)%>
	
	</div>
	
	<liferay-portlet:actionURL  var="menuCounterUrl" name="menuCounterAction"/>
<aui:script >
	var serviceDomainId = '<%=String.valueOf(serviceDomainId) %>';
	var dossierStatus = '<%=String.valueOf(dossierStatus) %>';
	
	AUI().ready(function(A){
		doCounterMenuCPS('<%=menuCounterUrl.toString() %>', "dossierStatusTree", dossierStatus);
		doCounterMenuCPS(null, "serviceDomainIdTree", serviceDomainId);
	});
	Liferay.provide(window, 'doCounterMenuCPS', function(url, myTree ,active) {
		var A = AUI();
		
		if(url == null){
			var myTreeObj = A.one("#"+myTree);
			var allLI = myTreeObj.all( "li" );
			allLI.each(function (taskNode) {
				if(taskNode.getAttribute("id") === active){
					taskNode.addClass("current");
				}else{
					taskNode.removeClass("current");
				}
             });
		}else{
			A.io.request(
					url,
				{
				    dataType : 'json',
				    data:{    	
				    	<portlet:namespace/>serviceDomainId : serviceDomainId
				    },   
				    on: {
				        success: function(event, id, obj) {
							var instance = this;
							var res = instance.get('responseData');
							
							if(res){
								
								var data = res.badge;
		                    	for(j in data){
		                    		var sub_key = data[j].code;
		                            var sub_val = data[j].counter;
		                            
		                            if( A.one('#'+sub_key) != "undefined" &&
		                            		A.one('#'+sub_key) != null){
		                            	
		                            	var elementOBJ = A.one('#'+sub_key);
		                            	
		                            	if( elementOBJ.getAttribute("id") === active){
		                            		elementOBJ.addClass("current");
		                				}else{
		                					elementOBJ.removeClass("current");
		                				}
		                            	elementOBJ.appendChild("<span class='badge pull-right'>"+sub_val+"</span>");
		                            }
		                        }
							}
							
							
						}
					}
				}
			);
		}
		
	},['aui-base','liferay-portlet-url','aui-io']);
</aui:script>

	<style>
	.aui .icon-minus::before {
    position: relative;
    left: 0;
    top: 0px;
    height: 0;
    content: '' !important;
    width: 0;
    border-left: 7px solid transparent;
    border-top: 7px solid transparent;
    border-bottom: 7px #1ba1e2 solid;
}		
.aui .icon-plus::before {
	position: relative;
	left: 0;
	top: 0px;
	height: 0;
	content: '' !important;	
	width: 0;
	border-left: 7px solid transparent;
	border-top: 7px solid transparent;
	border-bottom: 7px #1ba1e2 solid;
	-webkit-transform: rotate(-45deg);
	transform: rotate(-45deg);
	border-bottom-color: #999999;
	left: -4px;
}		
ul.tree-root-container > li:first-child > div.tree-node-content > span {
  font-size: 18px;
  text-transform: uppercase;
}
.openCPSTree > ul {margin:0}
.openCPSTree ul li {border-bottom: 1px solid #ccc;padding: 10px 0;position: relative;}
.openCPSTree > ul > li {padding-bottom: 0; border-bottom: 0}
.openCPSTree > ul > li > div {border-bottom: 1px solid #ccc;padding: 0 40px 10px 20px;display: inherit;position: relative;}
.openCPSTree ul li > div.tree-expanded:before {
    content: "\f054";
    position: absolute;
    font-family: FontAwesome;
    right: 20px;
}
.openCPSTree > ul > li:before {content: ""}
.openCPSTree > ul > li ul {margin: 0}
.openCPSTree > ul > li ul li {padding-left: 25px;padding-right: 15px;}
.openCPSTree li.current {
  font-family: "Roboto-Bold";
  background: rgb(0, 144, 255) none repeat scroll 0% 0%;
  color: rgb(255, 255, 255);
}
.openCPSTree li.current > div > i.icon-ok-sign {opacity: 1; color: #444}
.openCPSTree li .badge {font-weight: normal}
.openCPSTree li.current .badge{
  background-color: #444;
}
.openCPSTree li .badge{
  background-color: #0090FF;
}
.tree-node-leaf {
	    margin-left: 15px;
	    display: inline-block;
}	
	</style>
	
	</aui:col>
	<aui:col width="75" >

			<liferay-util:include page='<%=templatePath + "toolbar.jsp" %>' servletContext="<%=application %>" />
		<div class="opencps-searchcontainer-wrapper default-box-shadow radius8">
			<div class="opcs-serviceinfo-list-label">
				<div class="title_box">
			           <p class="file_manage_title ds"><liferay-ui:message key="title-danh-sach-ho-so" /></p>
			           <p class="count"></p>
			    </div>
			</div>
			
			<liferay-ui:search-container searchContainer="<%= new DossierSearch(renderRequest, SearchContainer.DEFAULT_DELTA, iteratorURL) %>">
			
				<liferay-ui:search-container-results>
					<%
						DossierSearchTerms searchTerms = (DossierSearchTerms)searchContainer.getSearchTerms();
						
						searchTerms.setDossierStatus(dossierStatus);
						
						DictItem domainItem = null;
					
						
						try{
							if(serviceDomainId > 0){
								domainItem = DictItemLocalServiceUtil.getDictItem(serviceDomainId);
							}
			
							if(domainItem != null){
								searchTerms.setServiceDomainIndex(domainItem.getTreeIndex());
							}
							
							%>
								<%@include file="/html/portlets/dossiermgt/frontoffice/dosier_search_results.jspf" %>
							<%
						}catch(Exception e){
							_log.error(e);
						}
					
						total = totalCount;
						results = dossiers;
						
						pageContext.setAttribute("results", results);
						pageContext.setAttribute("total", total);
					%>
				</liferay-ui:search-container-results>	
					<liferay-ui:search-container-row 
						className="org.opencps.dossiermgt.bean.DossierBean" 
						modelVar="dossierBean" 
						keyProperty="dossierId"
					>
					
					<%
						Dossier dossier = dossierBean.getDossier();
						String cssStatusColor = "status-color-" + dossier.getDossierStatus();
					%>
					
					<liferay-util:buffer var="info">
						
						<c:choose>
							<c:when test='<%=Validator.isNotNull(displayDossierNo) && displayDossierNo %>'>
								<div class="row-fluid">
									<div class='<%= "text-align-right span1 " + cssStatusColor%>'>
										<i class='<%="fa fa-circle sx10 " + dossier.getDossierStatus()%>'></i>
									</div>
									<div class="span2 bold-label">
										<liferay-ui:message key="dossier-no"/>
									</div>
									
									<div class="span9"><%= PortletUtil.intToString(dossier.getDossierId(), 15) %></div>
								</div>
								
								<div class="row-fluid">
									<div class="span1"></div>
									
									<div class="span2 bold-label">
										<liferay-ui:message key="reception-no"/>
									</div>
									
									<div class="span9"><%=dossier.getReceptionNo() %></div>
								</div>
							</c:when>
							
							<c:otherwise>
								<div class="row-fluid">
									<div class='<%= "text-align-right span1 " + cssStatusColor%>'>
										<i class='<%="fa fa-circle sx10 " + dossier.getDossierStatus()%>'></i>
									</div>
									<div class="span2 bold-label">
										<liferay-ui:message key="reception-no"/>
									</div>
									<div class="span9"><%=dossier.getReceptionNo() %></div>
								</div>
							</c:otherwise>
						</c:choose>
						
						<div class="row-fluid">
							<div class="span1"></div>
							
							<div class="span2 bold-label">
								<liferay-ui:message key="service-name"/>
							</div>
							
							<div class="span9"><%=dossierBean.getServiceName() %></div>
						</div>
						
						<div class="row-fluid">
							<div class="span1"></div>
							
							<div class="span2 bold-label"><liferay-ui:message key="gov-agency-name"/></div>
							
							<div class="span9"><%=dossier.getGovAgencyName() %></div>
						</div>
						
					</liferay-util:buffer>
					
					<liferay-util:buffer var="status">
						<div class="row-fluid">
							<div class="span5 bold-label"><liferay-ui:message key="create-date"/></div>
							<div class="span7">
								<%=
									Validator.isNotNull(dossier.getCreateDate()) ? 
									DateTimeUtil.convertDateToString(dossier.getCreateDate(), DateTimeUtil._VN_DATE_TIME_FORMAT) : 
									StringPool.DASH 
								%>
							</div>
						</div>
						
						<div class="row-fluid">
							<div class="span5 bold-label">
								 <liferay-ui:message key="receive-datetime"/>
							</div>
							
							<div class="span7">
								<%=
									Validator.isNotNull(dossier.getReceiveDatetime()) ? 
									DateTimeUtil.convertDateToString(dossier.getReceiveDatetime(), DateTimeUtil._VN_DATE_TIME_FORMAT): 
									StringPool.DASH 
								%>
							</div>
						</div>
						
						<div class="row-fluid">
						
							<div class="span5 bold-label">
								<liferay-ui:message key="finish-date"/>
							</div>
							<div class="span7">
								<%=
									Validator.isNotNull(dossier.getFinishDatetime()) ? 
									DateTimeUtil.convertDateToString(dossier.getFinishDatetime(), DateTimeUtil._VN_DATE_TIME_FORMAT): 
									StringPool.DASH 
								%>
							</div>
						</div>
						
						<div class="row-fluid">
							
							<div class="span5 bold-label">
								<liferay-ui:message key="dossier-status"/>
							</div>
							
							<div class='<%="span7 " + cssStatusColor %>'>
								<%-- <%=PortletUtil.getDossierStatusLabel(dossier.getDossierStatus(), locale) %> --%>
								<%= PortletUtil.getDossierStatusLabel(dossier.getDossierStatus(), locale) %>
							</div>
						</div>
					</liferay-util:buffer>
						
						<%
							row.setClassName("opencps-searchcontainer-row");
							row.addText(info);
							row.addText(status);
							row.addJSP("center", SearchEntry.DEFAULT_VALIGN,"/html/portlets/dossiermgt/frontoffice/dossier_actions.jsp", 
										config.getServletContext(), request, response);
							
						%>	
					</liferay-ui:search-container-row> 
				
				<liferay-ui:search-iterator type="opencs_page_iterator"/>
				
			</liferay-ui:search-container>
		</div>
	</aui:col>
</aui:row>

<%!
	private Log _log = LogFactoryUtil.getLog("html.portlets.dossiermgt.frontoffice.display.default.jsp");
%>