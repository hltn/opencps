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


<%@ include file="../init.jsp"%>

<%
	PortletURL searchURL = renderResponse.createRenderURL();
	
	String administrationCode = ParamUtil.getString(request, ServiceDisplayTerms.SERVICE_ADMINISTRATION);
	
	String domainCode = ParamUtil.getString(request, ServiceDisplayTerms.SERVICE_DOMAINCODE);
	
	request.setAttribute(ServiceDisplayTerms.SERVICE_ADMINISTRATION, administrationCode);
	
	request.setAttribute(ServiceDisplayTerms.SERVICE_DOMAINCODE, domainCode);
	
	DictCollection collectionDomain = null;
	DictItem curDictItem = null;
	try {
		collectionDomain = DictCollectionLocalServiceUtil.getDictCollection(scopeGroupId, WebKeys.SERVICE_DOMAIN);
	} catch (Exception e) {
		
	}
	
	List<DictItem> dictItems = new ArrayList<DictItem>();
	
	if(Validator.isNotNull(collectionDomain)) {
		dictItems = DictItemLocalServiceUtil.getDictItemsByDictCollectionId(collectionDomain.getDictCollectionId());
	}
%>
<aui:nav-bar cssClass="opencps-toolbar custom-toolbar">
	<aui:nav-bar-search cssClass="pull-right">
		<div class="form-search">
			<aui:form action="<%= searchURL %>" method="post" name="fm">
				<div class="toolbar_search_input">
					<aui:row>
						<aui:col width="25" cssClass="search-col">
							<datamgt:ddr
								cssClass="search-input select-box"
								depthLevel="1" 
								dictCollectionCode="SERVICE_ADMINISTRATION"
								itemNames="<%= ServiceDisplayTerms.SERVICE_ADMINISTRATION %>"
								itemsEmptyOption="true"
								selectedItems="<%= administrationCode %>"	
							>
							</datamgt:ddr>

						</aui:col>
						<aui:col width="25" cssClass="search-col">
							<%-- <datamgt:ddr 
								cssClass="search-input select-box"
								depthLevel="1" 
								dictCollectionCode="SERVICE_DOMAIN"
								itemNames="<%= ServiceDisplayTerms.SERVICE_DOMAINCODE %>"
								itemsEmptyOption="true"	
								selectedItems="<%= domainCode %>"
							>
							</datamgt:ddr> --%>
							
							<aui:select name="<%=ServiceDisplayTerms.SERVICE_DOMAINCODE %>" label="">
								<aui:option value="">
									<liferay-ui:message key="<%=ServiceDisplayTerms.SERVICE_DOMAINCODE %>"/>
								</aui:option>
								<%
									if(dictItems != null){
										for(DictItem dictItem : dictItems){
											if((curDictItem != null && dictItem.getDictItemId() == curDictItem.getDictItemId())||
													(curDictItem != null && dictItem.getTreeIndex().contains(curDictItem.getDictItemId() + StringPool.PERIOD))){
												continue;
											}
											
											int level = StringUtil.count(dictItem.getTreeIndex(), StringPool.PERIOD);
											String index = "|";
											for(int i = 0; i < level; i++){
												index += "_";
											}
											%>
												<aui:option value="<%=dictItem.getDictItemId() %>"><%=index + dictItem.getItemName(locale) %></aui:option>
											<%
										}
									}
								%>
							</aui:select>

						</aui:col>
						<aui:col width="45" cssClass="search-col">
							<liferay-ui:input-search 
								id="keywords1"
								name="keywords"
								title='<%= LanguageUtil.get(locale, "keywords") %>'
								placeholder='<%= LanguageUtil.get(locale, "name") %>' 
								cssClass="search-input input-keyword"
							/>
						</aui:col>
					</aui:row>
				</div>
			</aui:form>
		</div>
	</aui:nav-bar-search>
</aui:nav-bar>

<%!
	private Log _log = LogFactoryUtil.getLog("html.portlets.servicemgt.directory.toolbar.jsp");
%>