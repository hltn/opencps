/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.dossiermgt.service.base;

import org.opencps.dossiermgt.service.DossierLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungnt
 * @generated
 */
public class DossierLocalServiceClpInvoker {
	public DossierLocalServiceClpInvoker() {
		_methodName0 = "addDossier";

		_methodParameterTypes0 = new String[] {
				"org.opencps.dossiermgt.model.Dossier"
			};

		_methodName1 = "createDossier";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteDossier";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteDossier";

		_methodParameterTypes3 = new String[] {
				"org.opencps.dossiermgt.model.Dossier"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchDossier";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getDossier";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getDossiers";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getDossiersCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateDossier";

		_methodParameterTypes15 = new String[] {
				"org.opencps.dossiermgt.model.Dossier"
			};

		_methodName110 = "getBeanIdentifier";

		_methodParameterTypes110 = new String[] {  };

		_methodName111 = "setBeanIdentifier";

		_methodParameterTypes111 = new String[] { "java.lang.String" };

		_methodName116 = "addDossier";

		_methodParameterTypes116 = new String[] {
				"long", "long", "long", "java.lang.String", "long", "long",
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "int", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "java.lang.String", "long",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName117 = "countByGroupId";

		_methodParameterTypes117 = new String[] { "long" };

		_methodName118 = "countDossierByDS_RD_SN_U";

		_methodParameterTypes118 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String"
			};

		_methodName119 = "countDossierByKeywordDomainAndStatus";

		_methodParameterTypes119 = new String[] {
				"long", "java.lang.String", "java.lang.String", "java.util.List",
				"java.lang.String"
			};

		_methodName120 = "countDossierByP_PS_U";

		_methodParameterTypes120 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName121 = "countDossierByP_S_U";

		_methodParameterTypes121 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName122 = "countDossierByP_SN_U";

		_methodParameterTypes122 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName123 = "countDossierByStatus";

		_methodParameterTypes123 = new String[] { "long", "java.lang.String" };

		_methodName124 = "countDossierByUser";

		_methodParameterTypes124 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName125 = "countDossierByUserAssignProcessOrder";

		_methodParameterTypes125 = new String[] { "java.lang.String" };

		_methodName126 = "countDossierForRemoteService";

		_methodParameterTypes126 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "java.lang.String"
			};

		_methodName127 = "deleteDossierByDossierId";

		_methodParameterTypes127 = new String[] { "long" };

		_methodName128 = "deleteDossierByDossierId";

		_methodParameterTypes128 = new String[] {
				"long", "com.liferay.portlet.documentlibrary.model.DLFolder"
			};

		_methodName129 = "deleteDossierByDossierId";

		_methodParameterTypes129 = new String[] { "long", "long" };

		_methodName130 = "getByoid";

		_methodParameterTypes130 = new String[] { "java.lang.String" };

		_methodName132 = "getDossierByDelayStatus";

		_methodParameterTypes132 = new String[] { "int" };

		_methodName133 = "getDossierByDelayStatusAndNotDossierStatus";

		_methodParameterTypes133 = new String[] { "int", "java.lang.String" };

		_methodName134 = "getDossierByGroupId";

		_methodParameterTypes134 = new String[] { "long" };

		_methodName135 = "getDossierByReceptionNo";

		_methodParameterTypes135 = new String[] { "java.lang.String" };

		_methodName136 = "getDossierByStatus";

		_methodParameterTypes136 = new String[] {
				"long", "java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName137 = "getDossierByStatus";

		_methodParameterTypes137 = new String[] { "long", "java.lang.String" };

		_methodName138 = "getDossierByUser";

		_methodParameterTypes138 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName140 = "searchDossierByDS_RD_SN_U";

		_methodParameterTypes140 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "int", "int"
			};

		_methodName141 = "searchDossierByKeywordDomainAndStatus";

		_methodParameterTypes141 = new String[] {
				"long", "java.lang.String", "java.lang.String", "java.util.List",
				"java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName142 = "searchDossierByP_PS_U";

		_methodParameterTypes142 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName143 = "searchDossierByP_S_U";

		_methodParameterTypes143 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName144 = "searchDossierByP_SN_U";

		_methodParameterTypes144 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName145 = "searchDossierByUserAssignProcessOrder";

		_methodParameterTypes145 = new String[] { "java.lang.String", "int", "int" };

		_methodName146 = "searchDossierForRemoteService";

		_methodParameterTypes146 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "java.lang.String", "int", "int"
			};

		_methodName147 = "syncDossier";

		_methodParameterTypes147 = new String[] {
				"org.opencps.dossiermgt.model.Dossier",
				"java.util.LinkedHashMap", "java.util.LinkedHashMap",
				"java.util.LinkedHashMap", "java.util.LinkedHashMap",
				"java.util.LinkedHashMap",
				"org.opencps.dossiermgt.model.DossierTemplate",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName148 = "syncDossierStatus";

		_methodParameterTypes148 = new String[] {
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.util.Date", "java.util.Date",
				"java.util.Date", "int", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.util.LinkedHashMap", "java.util.LinkedHashMap",
				"java.util.LinkedHashMap", "java.util.LinkedHashMap",
				"java.util.LinkedHashMap",
				"org.opencps.paymentmgt.model.PaymentFile",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName149 = "syncReSubmitDossier";

		_methodParameterTypes149 = new String[] {
				"org.opencps.dossiermgt.model.Dossier",
				"java.util.LinkedHashMap", "java.util.LinkedHashMap",
				"java.util.LinkedHashMap", "java.util.LinkedHashMap",
				"java.util.LinkedHashMap",
				"org.opencps.dossiermgt.model.DossierTemplate",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName150 = "updateDossier";

		_methodParameterTypes150 = new String[] {
				"long", "long", "long", "long", "java.lang.String", "long",
				"long", "java.lang.String", "long", "java.lang.String",
				"java.lang.String", "int", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName151 = "updateDossierStatus";

		_methodParameterTypes151 = new String[] {
				"long", "long", "long", "long", "long", "java.lang.String",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName152 = "updateDossierStatus";

		_methodParameterTypes152 = new String[] {
				"long", "long", "long", "java.lang.String", "int", "long", "int",
				"java.util.Locale"
			};

		_methodName153 = "updateDossierStatus";

		_methodParameterTypes153 = new String[] {
				"long", "long", "long", "java.lang.String", "int", "long", "int",
				"java.util.Locale", "int", "long", "java.lang.String"
			};

		_methodName154 = "updateDossierStatus";

		_methodParameterTypes154 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.util.Date", "int", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName155 = "updateDossierStatus";

		_methodParameterTypes155 = new String[] {
				"long", "long", "java.lang.String", "int", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "int"
			};

		_methodName156 = "updateSyncStatus";

		_methodParameterTypes156 = new String[] {
				"java.lang.String", "java.util.List", "int"
			};

		_methodName157 = "getDossiersByServiceInfo";

		_methodParameterTypes157 = new String[] { "long" };

		_methodName158 = "getDossierByG_DS_U";

		_methodParameterTypes158 = new String[] {
				"long", "java.lang.String", "long", "int", "int"
			};

		_methodName159 = "countDossierByG_DS_U";

		_methodParameterTypes159 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName160 = "countDossierByUserNewRequest";

		_methodParameterTypes160 = new String[] { "long", "long" };

		_methodName161 = "getDossierByUserNewRequest";

		_methodParameterTypes161 = new String[] {
				"long", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return DossierLocalServiceUtil.addDossier((org.opencps.dossiermgt.model.Dossier)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return DossierLocalServiceUtil.createDossier(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return DossierLocalServiceUtil.deleteDossier(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return DossierLocalServiceUtil.deleteDossier((org.opencps.dossiermgt.model.Dossier)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return DossierLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return DossierLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return DossierLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return DossierLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return DossierLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return DossierLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return DossierLocalServiceUtil.fetchDossier(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return DossierLocalServiceUtil.getDossier(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return DossierLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return DossierLocalServiceUtil.getDossiers(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return DossierLocalServiceUtil.getDossiersCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return DossierLocalServiceUtil.updateDossier((org.opencps.dossiermgt.model.Dossier)arguments[0]);
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return DossierLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			DossierLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			return DossierLocalServiceUtil.addDossier(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3],
				((Long)arguments[4]).longValue(),
				((Long)arguments[5]).longValue(),
				(java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				((Integer)arguments[10]).intValue(),
				(java.lang.String)arguments[11],
				(java.lang.String)arguments[12],
				(java.lang.String)arguments[13],
				(java.lang.String)arguments[14],
				(java.lang.String)arguments[15],
				(java.lang.String)arguments[16],
				(java.lang.String)arguments[17],
				(java.lang.String)arguments[18],
				(java.lang.String)arguments[19],
				(java.lang.String)arguments[20],
				(java.lang.String)arguments[21],
				(java.lang.String)arguments[22],
				(java.lang.String)arguments[23],
				(java.lang.String)arguments[24],
				((Integer)arguments[25]).intValue(),
				(java.lang.String)arguments[26],
				((Long)arguments[27]).longValue(),
				(java.lang.String)arguments[28],
				(com.liferay.portal.service.ServiceContext)arguments[29]);
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			return DossierLocalServiceUtil.countByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByDS_RD_SN_U((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4]);
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByKeywordDomainAndStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.util.List<java.lang.String>)arguments[3],
				(java.lang.String)arguments[4]);
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByP_PS_U((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByP_S_U((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByP_SN_U((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4]);
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByUserAssignProcessOrder((java.lang.String)arguments[0]);
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierForRemoteService((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5],
				((Integer)arguments[6]).intValue(),
				(java.lang.String)arguments[7]);
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			DossierLocalServiceUtil.deleteDossierByDossierId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			DossierLocalServiceUtil.deleteDossierByDossierId(((Long)arguments[0]).longValue(),
				(com.liferay.portlet.documentlibrary.model.DLFolder)arguments[1]);

			return null;
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			DossierLocalServiceUtil.deleteDossierByDossierId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			return DossierLocalServiceUtil.getByoid((java.lang.String)arguments[0]);
		}

		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
			return DossierLocalServiceUtil.getDossierByDelayStatus(((Integer)arguments[0]).intValue());
		}

		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
			return DossierLocalServiceUtil.getDossierByDelayStatusAndNotDossierStatus(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			return DossierLocalServiceUtil.getDossierByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName135.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
			return DossierLocalServiceUtil.getDossierByReceptionNo((java.lang.String)arguments[0]);
		}

		if (_methodName136.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
			return DossierLocalServiceUtil.getDossierByStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName137.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
			return DossierLocalServiceUtil.getDossierByStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName138.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes138, parameterTypes)) {
			return DossierLocalServiceUtil.getDossierByUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[7]);
		}

		if (_methodName140.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
			return DossierLocalServiceUtil.searchDossierByDS_RD_SN_U((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName141.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes141, parameterTypes)) {
			return DossierLocalServiceUtil.searchDossierByKeywordDomainAndStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.util.List<java.lang.String>)arguments[3],
				(java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[7]);
		}

		if (_methodName142.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes142, parameterTypes)) {
			return DossierLocalServiceUtil.searchDossierByP_PS_U((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName143.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes143, parameterTypes)) {
			return DossierLocalServiceUtil.searchDossierByP_S_U((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName144.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes144, parameterTypes)) {
			return DossierLocalServiceUtil.searchDossierByP_SN_U((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName145.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes145, parameterTypes)) {
			return DossierLocalServiceUtil.searchDossierByUserAssignProcessOrder((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName146.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes146, parameterTypes)) {
			return DossierLocalServiceUtil.searchDossierForRemoteService((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5],
				((Integer)arguments[6]).intValue(),
				(java.lang.String)arguments[7],
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue());
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			return DossierLocalServiceUtil.syncDossier((org.opencps.dossiermgt.model.Dossier)arguments[0],
				(java.util.LinkedHashMap<org.opencps.dossiermgt.model.DossierFile, org.opencps.dossiermgt.model.DossierPart>)arguments[1],
				(java.util.LinkedHashMap<java.lang.String, org.opencps.dossiermgt.model.FileGroup>)arguments[2],
				(java.util.LinkedHashMap<java.lang.Long, org.opencps.dossiermgt.model.DossierPart>)arguments[3],
				(java.util.LinkedHashMap<java.lang.String, com.liferay.portlet.documentlibrary.model.DLFileEntry>)arguments[4],
				(java.util.LinkedHashMap<java.lang.String, byte[]>)arguments[5],
				(org.opencps.dossiermgt.model.DossierTemplate)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName148.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes148, parameterTypes)) {
			return DossierLocalServiceUtil.syncDossierStatus((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6],
				((Integer)arguments[7]).intValue(),
				((Long)arguments[8]).longValue(),
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				(java.lang.String)arguments[12],
				(java.util.LinkedHashMap<org.opencps.dossiermgt.model.DossierFile, org.opencps.dossiermgt.model.DossierPart>)arguments[13],
				(java.util.LinkedHashMap<java.lang.String, org.opencps.dossiermgt.model.FileGroup>)arguments[14],
				(java.util.LinkedHashMap<java.lang.Long, org.opencps.dossiermgt.model.DossierPart>)arguments[15],
				(java.util.LinkedHashMap<java.lang.String, com.liferay.portlet.documentlibrary.model.DLFileEntry>)arguments[16],
				(java.util.LinkedHashMap<java.lang.String, byte[]>)arguments[17],
				(org.opencps.paymentmgt.model.PaymentFile)arguments[18],
				(com.liferay.portal.service.ServiceContext)arguments[19]);
		}

		if (_methodName149.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes149, parameterTypes)) {
			return DossierLocalServiceUtil.syncReSubmitDossier((org.opencps.dossiermgt.model.Dossier)arguments[0],
				(java.util.LinkedHashMap<org.opencps.dossiermgt.model.DossierFile, org.opencps.dossiermgt.model.DossierPart>)arguments[1],
				(java.util.LinkedHashMap<java.lang.String, org.opencps.dossiermgt.model.FileGroup>)arguments[2],
				(java.util.LinkedHashMap<java.lang.Long, org.opencps.dossiermgt.model.DossierPart>)arguments[3],
				(java.util.LinkedHashMap<java.lang.String, com.liferay.portlet.documentlibrary.model.DLFileEntry>)arguments[4],
				(java.util.LinkedHashMap<java.lang.String, byte[]>)arguments[5],
				(org.opencps.dossiermgt.model.DossierTemplate)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName150.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes150, parameterTypes)) {
			return DossierLocalServiceUtil.updateDossier(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				(java.lang.String)arguments[4],
				((Long)arguments[5]).longValue(),
				((Long)arguments[6]).longValue(),
				(java.lang.String)arguments[7],
				((Long)arguments[8]).longValue(),
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				((Integer)arguments[11]).intValue(),
				(java.lang.String)arguments[12],
				(java.lang.String)arguments[13],
				(java.lang.String)arguments[14],
				(java.lang.String)arguments[15],
				(java.lang.String)arguments[16],
				(java.lang.String)arguments[17],
				(java.lang.String)arguments[18],
				(java.lang.String)arguments[19],
				(java.lang.String)arguments[20],
				(java.lang.String)arguments[21],
				(java.lang.String)arguments[22],
				(java.lang.String)arguments[23],
				(java.lang.String)arguments[24],
				(java.lang.String)arguments[25],
				((Long)arguments[26]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[27]);
		}

		if (_methodName151.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes151, parameterTypes)) {
			DossierLocalServiceUtil.updateDossierStatus(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.util.Date)arguments[6],
				(java.util.Date)arguments[7], (java.util.Date)arguments[8],
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10], (java.lang.String)arguments[11]);

			return null;
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return DossierLocalServiceUtil.updateDossierStatus(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Long)arguments[5]).longValue(),
				((Integer)arguments[6]).intValue(),
				(java.util.Locale)arguments[7]);
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return DossierLocalServiceUtil.updateDossierStatus(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Long)arguments[5]).longValue(),
				((Integer)arguments[6]).intValue(),
				(java.util.Locale)arguments[7],
				((Integer)arguments[8]).intValue(),
				((Long)arguments[9]).longValue(),
				(java.lang.String)arguments[10]);
		}

		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return DossierLocalServiceUtil.updateDossierStatus(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.util.Date)arguments[7],
				((Integer)arguments[8]).intValue(),
				((Long)arguments[9]).longValue(),
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				(java.lang.String)arguments[12], (java.lang.String)arguments[13]);
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			DossierLocalServiceUtil.updateDossierStatus(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				((Integer)arguments[9]).intValue(),
				((Integer)arguments[10]).intValue());

			return null;
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			DossierLocalServiceUtil.updateSyncStatus((java.lang.String)arguments[0],
				(java.util.List<java.lang.Long>)arguments[1],
				((Integer)arguments[2]).intValue());

			return null;
		}

		if (_methodName157.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes157, parameterTypes)) {
			return DossierLocalServiceUtil.getDossiersByServiceInfo(((Long)arguments[0]).longValue());
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return DossierLocalServiceUtil.getDossierByG_DS_U(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByG_DS_U(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return DossierLocalServiceUtil.countDossierByUserNewRequest(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return DossierLocalServiceUtil.getDossierByUserNewRequest(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName132;
	private String[] _methodParameterTypes132;
	private String _methodName133;
	private String[] _methodParameterTypes133;
	private String _methodName134;
	private String[] _methodParameterTypes134;
	private String _methodName135;
	private String[] _methodParameterTypes135;
	private String _methodName136;
	private String[] _methodParameterTypes136;
	private String _methodName137;
	private String[] _methodParameterTypes137;
	private String _methodName138;
	private String[] _methodParameterTypes138;
	private String _methodName140;
	private String[] _methodParameterTypes140;
	private String _methodName141;
	private String[] _methodParameterTypes141;
	private String _methodName142;
	private String[] _methodParameterTypes142;
	private String _methodName143;
	private String[] _methodParameterTypes143;
	private String _methodName144;
	private String[] _methodParameterTypes144;
	private String _methodName145;
	private String[] _methodParameterTypes145;
	private String _methodName146;
	private String[] _methodParameterTypes146;
	private String _methodName147;
	private String[] _methodParameterTypes147;
	private String _methodName148;
	private String[] _methodParameterTypes148;
	private String _methodName149;
	private String[] _methodParameterTypes149;
	private String _methodName150;
	private String[] _methodParameterTypes150;
	private String _methodName151;
	private String[] _methodParameterTypes151;
	private String _methodName152;
	private String[] _methodParameterTypes152;
	private String _methodName153;
	private String[] _methodParameterTypes153;
	private String _methodName154;
	private String[] _methodParameterTypes154;
	private String _methodName155;
	private String[] _methodParameterTypes155;
	private String _methodName156;
	private String[] _methodParameterTypes156;
	private String _methodName157;
	private String[] _methodParameterTypes157;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName160;
	private String[] _methodParameterTypes160;
	private String _methodName161;
	private String[] _methodParameterTypes161;
}