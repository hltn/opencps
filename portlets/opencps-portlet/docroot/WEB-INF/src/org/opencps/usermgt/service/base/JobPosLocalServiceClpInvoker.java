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

import org.opencps.usermgt.service.JobPosLocalServiceUtil;

import java.util.Arrays;

/**
 * @author khoavd
 * @generated
 */
public class JobPosLocalServiceClpInvoker {
	public JobPosLocalServiceClpInvoker() {
		_methodName0 = "addJobPos";

		_methodParameterTypes0 = new String[] { "org.opencps.usermgt.model.JobPos" };

		_methodName1 = "createJobPos";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteJobPos";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteJobPos";

		_methodParameterTypes3 = new String[] { "org.opencps.usermgt.model.JobPos" };

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

		_methodName10 = "fetchJobPos";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getJobPos";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getJobPoses";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getJobPosesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateJobPos";

		_methodParameterTypes15 = new String[] {
				"org.opencps.usermgt.model.JobPos"
			};

		_methodName16 = "addEmployeeJobPos";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addEmployeeJobPos";

		_methodParameterTypes17 = new String[] {
				"long", "org.opencps.usermgt.model.JobPos"
			};

		_methodName18 = "addEmployeeJobPoses";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addEmployeeJobPoses";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearEmployeeJobPoses";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteEmployeeJobPos";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteEmployeeJobPos";

		_methodParameterTypes22 = new String[] {
				"long", "org.opencps.usermgt.model.JobPos"
			};

		_methodName23 = "deleteEmployeeJobPoses";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteEmployeeJobPoses";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getEmployeeJobPoses";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getEmployeeJobPoses";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getEmployeeJobPoses";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getEmployeeJobPosesCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasEmployeeJobPos";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasEmployeeJobPoses";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setEmployeeJobPoses";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName32 = "addWorkingUnitJobPos";

		_methodParameterTypes32 = new String[] { "long", "long" };

		_methodName33 = "addWorkingUnitJobPos";

		_methodParameterTypes33 = new String[] {
				"long", "org.opencps.usermgt.model.JobPos"
			};

		_methodName34 = "addWorkingUnitJobPoses";

		_methodParameterTypes34 = new String[] { "long", "long[][]" };

		_methodName35 = "addWorkingUnitJobPoses";

		_methodParameterTypes35 = new String[] { "long", "java.util.List" };

		_methodName36 = "clearWorkingUnitJobPoses";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "deleteWorkingUnitJobPos";

		_methodParameterTypes37 = new String[] { "long", "long" };

		_methodName38 = "deleteWorkingUnitJobPos";

		_methodParameterTypes38 = new String[] {
				"long", "org.opencps.usermgt.model.JobPos"
			};

		_methodName39 = "deleteWorkingUnitJobPoses";

		_methodParameterTypes39 = new String[] { "long", "long[][]" };

		_methodName40 = "deleteWorkingUnitJobPoses";

		_methodParameterTypes40 = new String[] { "long", "java.util.List" };

		_methodName41 = "getWorkingUnitJobPoses";

		_methodParameterTypes41 = new String[] { "long" };

		_methodName42 = "getWorkingUnitJobPoses";

		_methodParameterTypes42 = new String[] { "long", "int", "int" };

		_methodName43 = "getWorkingUnitJobPoses";

		_methodParameterTypes43 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName44 = "getWorkingUnitJobPosesCount";

		_methodParameterTypes44 = new String[] { "long" };

		_methodName45 = "hasWorkingUnitJobPos";

		_methodParameterTypes45 = new String[] { "long", "long" };

		_methodName46 = "hasWorkingUnitJobPoses";

		_methodParameterTypes46 = new String[] { "long" };

		_methodName47 = "setWorkingUnitJobPoses";

		_methodParameterTypes47 = new String[] { "long", "long[][]" };

		_methodName80 = "getBeanIdentifier";

		_methodParameterTypes80 = new String[] {  };

		_methodName81 = "setBeanIdentifier";

		_methodParameterTypes81 = new String[] { "java.lang.String" };

		_methodName86 = "addJobPos";

		_methodParameterTypes86 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long", "int",
				"long[][]", "com.liferay.portal.service.ServiceContext"
			};

		_methodName87 = "updateJobPos";

		_methodParameterTypes87 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String", "long",
				"int", "long[][]", "com.liferay.portal.service.ServiceContext"
			};

		_methodName88 = "deleteJobPosById";

		_methodParameterTypes88 = new String[] { "long" };

		_methodName89 = "countAll";

		_methodParameterTypes89 = new String[] {  };

		_methodName90 = "getJobPoss";

		_methodParameterTypes90 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName91 = "getJobPoss";

		_methodParameterTypes91 = new String[] { "long" };

		_methodName92 = "getJobPoss";

		_methodParameterTypes92 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName93 = "getJobPoss";

		_methodParameterTypes93 = new String[] { "long", "long" };

		_methodName94 = "getJobPossG_W";

		_methodParameterTypes94 = new String[] {
				"long", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName95 = "countJobPosG_W";

		_methodParameterTypes95 = new String[] { "long", "long" };

		_methodName96 = "getJobPoss";

		_methodParameterTypes96 = new String[] { "long", "long", "long" };

		_methodName97 = "getJobPosByTitle";

		_methodParameterTypes97 = new String[] { "long", "java.lang.String" };

		_methodName98 = "getJobPosByG_T_W";

		_methodParameterTypes98 = new String[] {
				"long", "java.lang.String", "long"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return JobPosLocalServiceUtil.addJobPos((org.opencps.usermgt.model.JobPos)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return JobPosLocalServiceUtil.createJobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return JobPosLocalServiceUtil.deleteJobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return JobPosLocalServiceUtil.deleteJobPos((org.opencps.usermgt.model.JobPos)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return JobPosLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return JobPosLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return JobPosLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return JobPosLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return JobPosLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return JobPosLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return JobPosLocalServiceUtil.fetchJobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return JobPosLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPoses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPosesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return JobPosLocalServiceUtil.updateJobPos((org.opencps.usermgt.model.JobPos)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			JobPosLocalServiceUtil.addEmployeeJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			JobPosLocalServiceUtil.addEmployeeJobPos(((Long)arguments[0]).longValue(),
				(org.opencps.usermgt.model.JobPos)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			JobPosLocalServiceUtil.addEmployeeJobPoses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			JobPosLocalServiceUtil.addEmployeeJobPoses(((Long)arguments[0]).longValue(),
				(java.util.List<org.opencps.usermgt.model.JobPos>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			JobPosLocalServiceUtil.clearEmployeeJobPoses(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			JobPosLocalServiceUtil.deleteEmployeeJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			JobPosLocalServiceUtil.deleteEmployeeJobPos(((Long)arguments[0]).longValue(),
				(org.opencps.usermgt.model.JobPos)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			JobPosLocalServiceUtil.deleteEmployeeJobPoses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			JobPosLocalServiceUtil.deleteEmployeeJobPoses(((Long)arguments[0]).longValue(),
				(java.util.List<org.opencps.usermgt.model.JobPos>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return JobPosLocalServiceUtil.getEmployeeJobPoses(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return JobPosLocalServiceUtil.getEmployeeJobPoses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return JobPosLocalServiceUtil.getEmployeeJobPoses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return JobPosLocalServiceUtil.getEmployeeJobPosesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return JobPosLocalServiceUtil.hasEmployeeJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return JobPosLocalServiceUtil.hasEmployeeJobPoses(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			JobPosLocalServiceUtil.setEmployeeJobPoses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			JobPosLocalServiceUtil.addWorkingUnitJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			JobPosLocalServiceUtil.addWorkingUnitJobPos(((Long)arguments[0]).longValue(),
				(org.opencps.usermgt.model.JobPos)arguments[1]);

			return null;
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			JobPosLocalServiceUtil.addWorkingUnitJobPoses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			JobPosLocalServiceUtil.addWorkingUnitJobPoses(((Long)arguments[0]).longValue(),
				(java.util.List<org.opencps.usermgt.model.JobPos>)arguments[1]);

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			JobPosLocalServiceUtil.clearWorkingUnitJobPoses(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			JobPosLocalServiceUtil.deleteWorkingUnitJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			JobPosLocalServiceUtil.deleteWorkingUnitJobPos(((Long)arguments[0]).longValue(),
				(org.opencps.usermgt.model.JobPos)arguments[1]);

			return null;
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			JobPosLocalServiceUtil.deleteWorkingUnitJobPoses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			JobPosLocalServiceUtil.deleteWorkingUnitJobPoses(((Long)arguments[0]).longValue(),
				(java.util.List<org.opencps.usermgt.model.JobPos>)arguments[1]);

			return null;
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return JobPosLocalServiceUtil.getWorkingUnitJobPoses(((Long)arguments[0]).longValue());
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return JobPosLocalServiceUtil.getWorkingUnitJobPoses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return JobPosLocalServiceUtil.getWorkingUnitJobPoses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return JobPosLocalServiceUtil.getWorkingUnitJobPosesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return JobPosLocalServiceUtil.hasWorkingUnitJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return JobPosLocalServiceUtil.hasWorkingUnitJobPoses(((Long)arguments[0]).longValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			JobPosLocalServiceUtil.setWorkingUnitJobPoses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return JobPosLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			JobPosLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return JobPosLocalServiceUtil.addJobPos(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				((Integer)arguments[4]).intValue(), (long[])arguments[5],
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName87.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
			return JobPosLocalServiceUtil.updateJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				((Long)arguments[4]).longValue(),
				((Integer)arguments[5]).intValue(), (long[])arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName88.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
			JobPosLocalServiceUtil.deleteJobPosById(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName89.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
			return JobPosLocalServiceUtil.countAll();
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPoss(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPoss(((Long)arguments[0]).longValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPoss(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPoss(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPossG_W(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return JobPosLocalServiceUtil.countJobPosG_W(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPoss(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPosByTitle(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			return JobPosLocalServiceUtil.getJobPosByG_T_W(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
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
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName80;
	private String[] _methodParameterTypes80;
	private String _methodName81;
	private String[] _methodParameterTypes81;
	private String _methodName86;
	private String[] _methodParameterTypes86;
	private String _methodName87;
	private String[] _methodParameterTypes87;
	private String _methodName88;
	private String[] _methodParameterTypes88;
	private String _methodName89;
	private String[] _methodParameterTypes89;
	private String _methodName90;
	private String[] _methodParameterTypes90;
	private String _methodName91;
	private String[] _methodParameterTypes91;
	private String _methodName92;
	private String[] _methodParameterTypes92;
	private String _methodName93;
	private String[] _methodParameterTypes93;
	private String _methodName94;
	private String[] _methodParameterTypes94;
	private String _methodName95;
	private String[] _methodParameterTypes95;
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName98;
	private String[] _methodParameterTypes98;
}