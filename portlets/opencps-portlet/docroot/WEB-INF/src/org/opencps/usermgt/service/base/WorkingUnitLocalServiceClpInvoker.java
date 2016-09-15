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

package org.opencps.usermgt.service.base;

import org.opencps.usermgt.service.WorkingUnitLocalServiceUtil;

import java.util.Arrays;

/**
 * @author khoavd
 * @generated
 */
public class WorkingUnitLocalServiceClpInvoker {
	public WorkingUnitLocalServiceClpInvoker() {
		_methodName0 = "addWorkingUnit";

		_methodParameterTypes0 = new String[] {
				"org.opencps.usermgt.model.WorkingUnit"
			};

		_methodName1 = "createWorkingUnit";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteWorkingUnit";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteWorkingUnit";

		_methodParameterTypes3 = new String[] {
				"org.opencps.usermgt.model.WorkingUnit"
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

		_methodName10 = "fetchWorkingUnit";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getWorkingUnit";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getWorkingUnits";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getWorkingUnitsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateWorkingUnit";

		_methodParameterTypes15 = new String[] {
				"org.opencps.usermgt.model.WorkingUnit"
			};

		_methodName16 = "addJobPosWorkingUnit";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addJobPosWorkingUnit";

		_methodParameterTypes17 = new String[] {
				"long", "org.opencps.usermgt.model.WorkingUnit"
			};

		_methodName18 = "addJobPosWorkingUnits";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addJobPosWorkingUnits";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearJobPosWorkingUnits";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteJobPosWorkingUnit";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteJobPosWorkingUnit";

		_methodParameterTypes22 = new String[] {
				"long", "org.opencps.usermgt.model.WorkingUnit"
			};

		_methodName23 = "deleteJobPosWorkingUnits";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteJobPosWorkingUnits";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getJobPosWorkingUnits";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getJobPosWorkingUnits";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getJobPosWorkingUnits";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getJobPosWorkingUnitsCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasJobPosWorkingUnit";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasJobPosWorkingUnits";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setJobPosWorkingUnits";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName64 = "getBeanIdentifier";

		_methodParameterTypes64 = new String[] {  };

		_methodName65 = "setBeanIdentifier";

		_methodParameterTypes65 = new String[] { "java.lang.String" };

		_methodName70 = "addWorkingUnit";

		_methodParameterTypes70 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "boolean", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName71 = "updateWorkingUnit";

		_methodParameterTypes71 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "boolean", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName72 = "deleteWorkingUnitByWorkingUnitId";

		_methodParameterTypes72 = new String[] { "long" };

		_methodName73 = "countAll";

		_methodParameterTypes73 = new String[] {  };

		_methodName74 = "getMaxSibling";

		_methodParameterTypes74 = new String[] { "long" };

		_methodName76 = "getWorkingUnit";

		_methodParameterTypes76 = new String[] { "long", "boolean", "long" };

		_methodName77 = "getWorkingUnit";

		_methodParameterTypes77 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName78 = "getWorkingUnit";

		_methodParameterTypes78 = new String[] { "long", "boolean" };

		_methodName79 = "getWorkingUnit";

		_methodParameterTypes79 = new String[] {
				"long", "boolean", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName80 = "countByG_E";

		_methodParameterTypes80 = new String[] { "long", "boolean" };

		_methodName81 = "getWorkingUnits";

		_methodParameterTypes81 = new String[] { "long", "long" };

		_methodName82 = "mapMultipleJobPosWorkingUnitToOneWorkingUnit";

		_methodParameterTypes82 = new String[] { "long", "long[][]" };

		_methodName83 = "getFirstWorkingUnitByJobPosId";

		_methodParameterTypes83 = new String[] { "long" };

		_methodName84 = "getWorkingUnits";

		_methodParameterTypes84 = new String[] { "long" };

		_methodName85 = "getWorkingUnit";

		_methodParameterTypes85 = new String[] { "long", "java.lang.String" };

		_methodName86 = "getWorkingUnitByEmail";

		_methodParameterTypes86 = new String[] { "java.lang.String" };

		_methodName87 = "fetchByMappingOrganisationId";

		_methodParameterTypes87 = new String[] { "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.addWorkingUnit((org.opencps.usermgt.model.WorkingUnit)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.createWorkingUnit(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.deleteWorkingUnit(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.deleteWorkingUnit((org.opencps.usermgt.model.WorkingUnit)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.fetchWorkingUnit(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnit(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnits(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnitsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.updateWorkingUnit((org.opencps.usermgt.model.WorkingUnit)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			WorkingUnitLocalServiceUtil.addJobPosWorkingUnit(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			WorkingUnitLocalServiceUtil.addJobPosWorkingUnit(((Long)arguments[0]).longValue(),
				(org.opencps.usermgt.model.WorkingUnit)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			WorkingUnitLocalServiceUtil.addJobPosWorkingUnits(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			WorkingUnitLocalServiceUtil.addJobPosWorkingUnits(((Long)arguments[0]).longValue(),
				(java.util.List<org.opencps.usermgt.model.WorkingUnit>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			WorkingUnitLocalServiceUtil.clearJobPosWorkingUnits(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			WorkingUnitLocalServiceUtil.deleteJobPosWorkingUnit(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			WorkingUnitLocalServiceUtil.deleteJobPosWorkingUnit(((Long)arguments[0]).longValue(),
				(org.opencps.usermgt.model.WorkingUnit)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			WorkingUnitLocalServiceUtil.deleteJobPosWorkingUnits(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			WorkingUnitLocalServiceUtil.deleteJobPosWorkingUnits(((Long)arguments[0]).longValue(),
				(java.util.List<org.opencps.usermgt.model.WorkingUnit>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getJobPosWorkingUnits(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getJobPosWorkingUnits(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getJobPosWorkingUnits(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getJobPosWorkingUnitsCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.hasJobPosWorkingUnit(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.hasJobPosWorkingUnits(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			WorkingUnitLocalServiceUtil.setJobPosWorkingUnits(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			WorkingUnitLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.addWorkingUnit(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3],
				((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				(java.lang.String)arguments[12],
				((Boolean)arguments[13]).booleanValue(),
				((Long)arguments[14]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[15]);
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.updateWorkingUnit(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4],
				((Long)arguments[5]).longValue(),
				(java.lang.String)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				(java.lang.String)arguments[12],
				(java.lang.String)arguments[13],
				((Boolean)arguments[14]).booleanValue(),
				((Long)arguments[15]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[16]);
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			WorkingUnitLocalServiceUtil.deleteWorkingUnitByWorkingUnitId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName73.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.countAll();
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getMaxSibling(((Long)arguments[0]).longValue());
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnit(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnit(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName78.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnit(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnit(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.countByG_E(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnits(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			WorkingUnitLocalServiceUtil.mapMultipleJobPosWorkingUnitToOneWorkingUnit(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getFirstWorkingUnitByJobPosId(((Long)arguments[0]).longValue());
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnits(((Long)arguments[0]).longValue());
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnit(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.getWorkingUnitByEmail((java.lang.String)arguments[0]);
		}

		if (_methodName87.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
			return WorkingUnitLocalServiceUtil.fetchByMappingOrganisationId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
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
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
	private String _methodName78;
	private String[] _methodParameterTypes78;
	private String _methodName79;
	private String[] _methodParameterTypes79;
	private String _methodName80;
	private String[] _methodParameterTypes80;
	private String _methodName81;
	private String[] _methodParameterTypes81;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName83;
	private String[] _methodParameterTypes83;
	private String _methodName84;
	private String[] _methodParameterTypes84;
	private String _methodName85;
	private String[] _methodParameterTypes85;
	private String _methodName86;
	private String[] _methodParameterTypes86;
	private String _methodName87;
	private String[] _methodParameterTypes87;
}