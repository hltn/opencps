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
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 */

package org.opencps.processmgt.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.portlet.PortletModeException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.WindowStateException;

import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.dossiermgt.bean.ProcessOrderBean;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.processmgt.model.ProcessOrder;
import org.opencps.processmgt.model.ProcessStep;
import org.opencps.processmgt.model.StepAllowance;
import org.opencps.processmgt.search.ProcessOrderDisplayTerms;
import org.opencps.processmgt.service.ProcessStepLocalServiceUtil;
import org.opencps.processmgt.service.StepAllowanceLocalServiceUtil;
import org.opencps.processmgt.util.comparator.ProcessOrderModifiedDateComparator;
import org.opencps.util.PortletUtil;
//import org.opencps.processmgt.util.comparator.BuocXuLyComparator;
//import org.opencps.processmgt.util.comparator.ChuHoSoComparator;
//import org.opencps.processmgt.util.comparator.MaTiepNhanComparator;
//import org.opencps.processmgt.util.comparator.NguoiPhuTrachComparator;
//import org.opencps.processmgt.util.comparator.ThuTucComparator;
import org.opencps.util.WebKeys;

import com.fasterxml.jackson.core.JsonFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * @author binhth
 */
/**
 * @author khoavd
 */
public class ProcessOrderUtils {

	public static final String TOP_TABS_PROCESSORDER_TODO =
		"top_tabs_processorder_todo";
	public static final String TOP_TABS_PROCESSORDER_DONE =
		"top_tabs_processorder_done";

	public static OrderByComparator getProcessOrderByComparator(
		String orderByCol, String orderByType) {

		boolean orderByAsc = false;

		if (orderByType
			.equals("asc")) {
			orderByAsc = true;
		}

		OrderByComparator orderByComparator = null;
		
		if(orderByCol.equals(ProcessOrderDisplayTerms.MODIFIEDDATE)) {
			orderByComparator = new ProcessOrderModifiedDateComparator(orderByAsc);
		}
		
		// if(orderByCol.equals(ProcessOrderDisplayTerms.MA_TIEP_NHAN)) {
		// orderByComparator = new MaTiepNhanComparator(orderByAsc);
		// } else if(orderByCol.equals(ProcessOrderDisplayTerms.CHU_HO_SO)) {
		// orderByComparator = new ChuHoSoComparator(orderByAsc);
		// } else if(orderByCol.equals(ProcessOrderDisplayTerms.THU_TUC)) {
		// orderByComparator = new ThuTucComparator(orderByAsc);
		// } else if(orderByCol.equals(ProcessOrderDisplayTerms.BUOC_XU_LY)) {
		// orderByComparator = new BuocXuLyComparator(orderByAsc);
		// } else
		// if(orderByCol.equals(ProcessOrderDisplayTerms.NGUOI_PHU_TRACH)) {
		// orderByComparator = new NguoiPhuTrachComparator(orderByAsc);
		// }

		return orderByComparator;
	}

	// custom display process order
	public static class CustomDisPlay {

		private long id;
		private String maTiepNhan;
		private String chuHoSo;
		private String thuTuc;
		private String buocXuLy;
		private String nguoiPhuTrach;
		private String hanXuLy;
		private String thaoTac;
		private String ngayThucHien;
		private String trangThaiHoSo;

		public CustomDisPlay() {

		}

		public CustomDisPlay(
			long id, String maTiepNhan, String chuHoSo, String thuTuc,
			String buocXuLy, String nguoiPhuTrach, String hanXuLy,
			String thaoTac, String ngayThucHien, String trangThaiHoSo) {

			super();
			this.id = id;
			this.maTiepNhan = maTiepNhan;
			this.chuHoSo = chuHoSo;
			this.thuTuc = thuTuc;
			this.buocXuLy = buocXuLy;
			this.nguoiPhuTrach = nguoiPhuTrach;
			this.hanXuLy = hanXuLy;
			this.thaoTac = thaoTac;
			this.ngayThucHien = ngayThucHien;
			this.trangThaiHoSo = trangThaiHoSo;
		}

		public String getMaTiepNhan() {

			return maTiepNhan;
		}

		public void setMaTiepNhan(String maTiepNhan) {

			this.maTiepNhan = maTiepNhan;
		}

		public String getChuHoSo() {

			return chuHoSo;
		}

		public void setChuHoSo(String chuHoSo) {

			this.chuHoSo = chuHoSo;
		}

		public String getThuTuc() {

			return thuTuc;
		}

		public void setThuTuc(String thuTuc) {

			this.thuTuc = thuTuc;
		}

		public String getBuocXuLy() {

			return buocXuLy;
		}

		public void setBuocXuLy(String buocXuLy) {

			this.buocXuLy = buocXuLy;
		}

		public String getNguoiPhuTrach() {

			return nguoiPhuTrach;
		}

		public void setNguoiPhuTrach(String nguoiPhuTrach) {

			this.nguoiPhuTrach = nguoiPhuTrach;
		}

		public String getHanXuLy() {

			return hanXuLy;
		}

		public void setHanXuLy(String hanXuLy) {

			this.hanXuLy = hanXuLy;
		}

		public String getThaoTac() {

			return thaoTac;
		}

		public void setThaoTac(String thaoTac) {

			this.thaoTac = thaoTac;
		}

		public String getNgayThucHien() {

			return ngayThucHien;
		}

		public void setNgayThucHien(String ngayThucHien) {

			this.ngayThucHien = ngayThucHien;
		}

		public String getTrangThaiHoSo() {

			return trangThaiHoSo;
		}

		public void setTrangThaiHoSo(String trangThaiHoSo) {

			this.trangThaiHoSo = trangThaiHoSo;
		}

		public long getId() {

			return id;
		}

		public void setId(long id) {

			this.id = id;
		}

	}

	/**
	 * @param roleIds
	 * @return
	 */
	public static List<ProcessStep> getProcessSteps(
		long groupId, long[] roleIds) {

		List<ProcessStep> results = null;

		try {
			List<StepAllowance> listStepAllowance =
				StepAllowanceLocalServiceUtil
					.findByRoleIds(roleIds);

			long[] processStepIds = new long[listStepAllowance
				.size()];

			int index = 0;

			for (StepAllowance stepAllowance : listStepAllowance) {

				processStepIds[index++] = stepAllowance
					.getStepAllowanceId();

			}

			results = ProcessStepLocalServiceUtil
				.findByProcessStepIds(groupId, processStepIds);

		}

		catch (Exception e) {
			return new ArrayList<ProcessStep>();
		}
		return results;
	}

	/**
	 * @param roleIds
	 * @return
	 */
	/**
	 * @param roleIds
	 * @return
	 * @throws WindowStateException
	 * @throws PortletModeException
	 */
	public static String generateMenuBuocXuLy(
		RenderRequest renderRequest, long[] roleIds, String active,
		boolean counter, String renderURL)
		throws WindowStateException, PortletModeException {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
			.getAttribute(WebKeys.THEME_DISPLAY);

		long groupId = themeDisplay
			.getScopeGroupId();

		// now read your parameters, e.g. like this:
		// long someParameter = ParamUtil.getLong(request, "someParameter");

		StringBuilder sbHtml = new StringBuilder();

		sbHtml
			.append("<ul class=\"menu-opencps\">");

		for (ProcessStep ett : getProcessSteps(groupId, roleIds)) {
			String mnClass = (Validator
				.isNotNull(active) && active
					.equalsIgnoreCase(String
						.valueOf(ett
							.getProcessStepId())) ? "active-menu" : "");

			sbHtml
				.append("<li class=\"menu-opencps-li " + mnClass +
					"\" onclick=\"openCPS_menu_submit('" + renderURL + "','" +
					ett
						.getProcessStepId() +
					"')\" >");

			sbHtml
				.append("<a>");

			if (counter)
				sbHtml
					.append("<span id=\"" + "badge_" + ett
						.getProcessStepId() + "\" class=\"badge\">0</span>");

			sbHtml
				.append(HtmlUtil
					.escape(ett
						.getStepName()));

			sbHtml
				.append("</a>");

			sbHtml
				.append("</li>");

		}

		sbHtml
			.append("</ul>");

		return sbHtml
			.toString();
	}

	public static List<CustomDisPlay> searchProcessOrder(List list) {

		List<CustomDisPlay> customDisPlays =
			new ArrayList<ProcessOrderUtils.CustomDisPlay>();

		Iterator<Object[]> itr = list
			.iterator();
		while (itr
			.hasNext()) {

			Object[] object = (Object[]) itr
				.next();
			ProcessOrder processOrder = (ProcessOrder) object[0];
			String tenThuTuc = (String) object[1];
			Dossier dossier = (Dossier) object[2];
			String stepName = (String) object[3];
			String actionName = (String) object[4];
			long id = processOrder
				.getProcessOrderId();
			String maTiepNhan = StringPool.BLANK + dossier
				.getReceptionNo();
			String chuHoSo = StringPool.BLANK + dossier
				.getSubjectName();
			String thuTuc = StringPool.BLANK + tenThuTuc;
			String buocXuLy = StringPool.BLANK + stepName;
			String nguoiPhuTrach = StringPool.BLANK;
			try {
				nguoiPhuTrach = UserLocalServiceUtil
					.fetchUser(processOrder
						.getAssignToUserId()).getFullName();
			}
			catch (SystemException e) {
				// TODO Auto-generated catch block
				e
					.printStackTrace();
			}
			long diff = 0;
			if (Validator
				.isNotNull(dossier
					.getFinishDatetime())) {
				diff = dossier
					.getFinishDatetime().getTime() - new Date()
						.getTime();
			}

			String hanXuLy = StringPool.BLANK + TimeUnit.MILLISECONDS
				.toDays(diff);
			String thaoTac = StringPool.BLANK + actionName;
			String ngayThucHien = StringPool.BLANK + processOrder
				.getActionDatetime();
			String trangThaiHoSo = StringPool.BLANK + dossier
				.getDossierStatus();
			CustomDisPlay customDisPlay = new CustomDisPlay(
				id, maTiepNhan, chuHoSo, thuTuc, buocXuLy, nguoiPhuTrach,
				hanXuLy, thaoTac, ngayThucHien, trangThaiHoSo);
			customDisPlays
				.add(customDisPlay);
		}

		return customDisPlays;

	}

	public static String generateTreeView(String collectionCode, String itemCode,
			String myLabel, int level, String type,
			boolean isCode ,RenderRequest renderRequest)		
					throws SystemException, PortalException {
		
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
				.getAttribute(WebKeys.THEME_DISPLAY);

			long groupId = themeDisplay
				.getScopeGroupId();
			
			//get chirentDataSource
			
			DictCollection dictCollection = DictCollectionLocalServiceUtil.getDictCollection(groupId, collectionCode);
			
			long parentId = 0;
			
			if(!itemCode.equalsIgnoreCase("0")){
				
				DictItem ett = DictItemLocalServiceUtil
						.getDictItemInuseByItemCode(dictCollection.getDictCollectionId(), itemCode);
				
				parentId = ett.getDictItemId();
				
			}
			
			List<DictItem> result = DictItemLocalServiceUtil
				.getDictItemsInUseByDictCollectionIdAndParentItemId(
						dictCollection.getDictCollectionId(), parentId);
			
			JSONArray jsonArrayRoot = JSONFactoryUtil.createJSONArray();
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			
			JSONObject jsonObjectRoot = JSONFactoryUtil
					.createJSONObject();
			JSONObject jsonObject = null;
			
			for (DictItem dictItem : result) {
				jsonObject = JSONFactoryUtil
						.createJSONObject();
				
				jsonObject.put("label",
						dictItem.getItemName(Locale.getDefault()));
				
				jsonObject.put("type", type);
				
				if(isCode){
					jsonObject.put("id", dictItem.getItemCode());
				}else{
					jsonObject.put("id", StringUtil.valueOf(dictItem.getDictItemId()));
				}
				
				if(level > 0){
				
					jsonObject.put("leaf", false);
					
					jsonObject = doChildTreeJson(jsonObject, type, isCode,
							dictCollection.getDictCollectionId(), dictItem.getDictItemId(), level);
				
				}else{
					
					jsonObject.put("leaf", true);
				
				}

				jsonArray.put(jsonObject);
			}
			
			jsonObjectRoot.put("children", jsonArray);
			
			jsonObjectRoot.put("expanded", true);
			
			jsonObjectRoot.put("label", myLabel);
			
			jsonArrayRoot.put(jsonObjectRoot);
			
			return jsonArrayRoot.toString();
		}
	
	public static String generateTreeView(List<ProcessOrderBean> dataSource, String myLabel , String type)		
					throws SystemException, PortalException {
		
			JSONArray jsonArrayRoot = JSONFactoryUtil.createJSONArray();
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			
			JSONObject jsonObjectRoot = JSONFactoryUtil
					.createJSONObject();
			JSONObject jsonObject = null;
			
			for (ProcessOrderBean item : dataSource) {
				jsonObject = JSONFactoryUtil
						.createJSONObject();
				
				if(item.getServiceInfoId() > 0){

					jsonObject.put("id", String.valueOf(item.getServiceInfoId()));
					
					jsonObject.put("label", item.getServiceName());
				
				}else if(item.getProcessStepId() > 0){

					jsonObject.put("id", String.valueOf(item.getProcessStepId()));
					
					jsonObject.put("label", item.getStepName());
				
				}
				
				jsonObject.put("type", type);
				
				jsonObject.put("leaf", true);
				
				jsonArray.put(jsonObject);
			}
			
			jsonObjectRoot.put("children", jsonArray);
			
			jsonObjectRoot.put("expanded", true);
			
			jsonObjectRoot.put("label", myLabel);
			
			jsonArrayRoot.put(jsonObjectRoot);
			
			return jsonArrayRoot.toString();
		}
	
	private static JSONObject doChildTreeJson(JSONObject jsonObject,String type, boolean isCode,
			long dictCollectionId, long dictItemId, int level) throws SystemException{
		List<DictItem> resultlv1 = null;
		resultlv1 = DictItemLocalServiceUtil
				.getDictItemsInUseByDictCollectionIdAndParentItemId(
						dictCollectionId, dictItemId);
		
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		for (DictItem dictItem2 : resultlv1) {
			JSONObject jsonObjectlv1 = JSONFactoryUtil
					.createJSONObject();
			
			jsonObjectlv1.put("label",
					dictItem2.getItemName(Locale.getDefault()));
			
			jsonObjectlv1.put("type", type);
			
			if(isCode){
				jsonObjectlv1.put("id", dictItem2.getItemCode());
			}else{
				jsonObjectlv1.put("id", StringUtil.valueOf(dictItem2.getDictItemId()));
			}
			
			jsonObjectlv1.put("expanded", true);
			
			switch (level) {
				case 1:
					jsonObjectlv1.put("leaf", true);
				break;
				case 2:
					jsonObjectlv1.put("leaf", false);
					List<DictItem> resultlv2 = null;
					resultlv2 = DictItemLocalServiceUtil
							.getDictItemsInUseByDictCollectionIdAndParentItemId(
									dictCollectionId, dictItem2.getDictItemId());
					JSONArray jsonArraylv2 = JSONFactoryUtil.createJSONArray();
					for (DictItem dictItem3 : resultlv2) {
						JSONObject jsonObjectlv2 = JSONFactoryUtil
								.createJSONObject();
						
						jsonObjectlv2.put("label",
								dictItem3.getItemName(Locale.getDefault()));
						
						jsonObjectlv2.put("type", type);
						
						if(isCode){
							jsonObjectlv2.put("id", dictItem3.getItemCode());
						}else{
							jsonObjectlv2.put("id", StringUtil.valueOf(dictItem3.getDictItemId()));
						}
						
						jsonObjectlv2.put("leaf", true);
						
						jsonObjectlv2.put("expanded", true);

						jsonArraylv2.put(jsonObjectlv2);
					}
					jsonObjectlv1.put("children", jsonArraylv2);
					break;
					
				default:
					jsonObjectlv1.put("leaf", true);
					break;
			}

			jsonArray.put(jsonObjectlv1);
		}
		
		jsonObject.put("expanded", true);
		
		jsonObject.put("children", jsonArray);
		
		return jsonObject;
	}

}
