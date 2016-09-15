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

package org.opencps.processmgt.service.base;

import org.opencps.processmgt.service.ProcessWorkflowLocalServiceUtil;

import java.util.Arrays;

/**
 * @author khoavd
 * @generated
 */
public class ProcessWorkflowLocalServiceClpInvoker {
	public ProcessWorkflowLocalServiceClpInvoker() {
		_methodName0 = "addProcessWorkflow";

		_methodParameterTypes0 = new String[] {
				"org.opencps.processmgt.model.ProcessWorkflow"
			};

		_methodName1 = "createProcessWorkflow";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteProcessWorkflow";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteProcessWorkflow";

		_methodParameterTypes3 = new String[] {
				"org.opencps.processmgt.model.ProcessWorkflow"
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

		_methodName10 = "fetchProcessWorkflow";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getProcessWorkflow";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getProcessWorkflows";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getProcessWorkflowsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateProcessWorkflow";

		_methodParameterTypes15 = new String[] {
				"org.opencps.processmgt.model.ProcessWorkflow"
			};

		_methodName96 = "getBeanIdentifier";

		_methodParameterTypes96 = new String[] {  };

		_methodName97 = "setBeanIdentifier";

		_methodParameterTypes97 = new String[] { "java.lang.String" };

		_methodName102 = "getProcessWorkflowByEvent";

		_methodParameterTypes102 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName103 = "getFirstProcessWorkflow";

		_methodParameterTypes103 = new String[] { "long" };

		_methodName104 = "updateWorkflow";

		_methodParameterTypes104 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"boolean", "long", "boolean", "java.lang.String", "boolean",
				"java.lang.String", "boolean", "java.lang.String", "boolean",
				"java.lang.String", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName105 = "deleteWorkflow";

		_methodParameterTypes105 = new String[] { "long" };

		_methodName106 = "addWorkflow";

		_methodParameterTypes106 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"boolean", "long", "boolean", "java.lang.String", "boolean",
				"java.lang.String", "boolean", "java.lang.String", "boolean",
				"java.lang.String", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName107 = "searchWorkflow";

		_methodParameterTypes107 = new String[] { "long", "int", "int" };

		_methodName108 = "getWorkFlowByProcess";

		_methodParameterTypes108 = new String[] { "long" };

		_methodName109 = "countWorkflow";

		_methodParameterTypes109 = new String[] { "long" };

		_methodName110 = "getPreProcessWorkflow";

		_methodParameterTypes110 = new String[] { "long", "long" };

		_methodName111 = "getPostProcessWorkflow";

		_methodParameterTypes111 = new String[] { "long", "long" };

		_methodName112 = "findInScheduler";

		_methodParameterTypes112 = new String[] { "long", "long" };

		_methodName113 = "getByActionCode";

		_methodParameterTypes113 = new String[] { "java.lang.String" };

		_methodName114 = "getByS_PreP_AN";

		_methodParameterTypes114 = new String[] {
				"long", "long", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.addProcessWorkflow((org.opencps.processmgt.model.ProcessWorkflow)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.createProcessWorkflow(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.deleteProcessWorkflow(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.deleteProcessWorkflow((org.opencps.processmgt.model.ProcessWorkflow)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.fetchProcessWorkflow(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getProcessWorkflow(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getProcessWorkflows(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getProcessWorkflowsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.updateProcessWorkflow((org.opencps.processmgt.model.ProcessWorkflow)arguments[0]);
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			ProcessWorkflowLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getProcessWorkflowByEvent(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getFirstProcessWorkflow(((Long)arguments[0]).longValue());
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.updateWorkflow(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				((Boolean)arguments[5]).booleanValue(),
				((Long)arguments[6]).longValue(),
				((Boolean)arguments[7]).booleanValue(),
				(java.lang.String)arguments[8],
				((Boolean)arguments[9]).booleanValue(),
				(java.lang.String)arguments[10],
				((Boolean)arguments[11]).booleanValue(),
				(java.lang.String)arguments[12],
				((Boolean)arguments[13]).booleanValue(),
				(java.lang.String)arguments[14],
				((Boolean)arguments[15]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[16]);
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			ProcessWorkflowLocalServiceUtil.deleteWorkflow(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.addWorkflow(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				((Boolean)arguments[5]).booleanValue(),
				((Long)arguments[6]).longValue(),
				((Boolean)arguments[7]).booleanValue(),
				(java.lang.String)arguments[8],
				((Boolean)arguments[9]).booleanValue(),
				(java.lang.String)arguments[10],
				((Boolean)arguments[11]).booleanValue(),
				(java.lang.String)arguments[12],
				((Boolean)arguments[13]).booleanValue(),
				(java.lang.String)arguments[14],
				((Boolean)arguments[15]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[16]);
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.searchWorkflow(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getWorkFlowByProcess(((Long)arguments[0]).longValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.countWorkflow(((Long)arguments[0]).longValue());
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getPreProcessWorkflow(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getPostProcessWorkflow(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.findInScheduler(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getByActionCode((java.lang.String)arguments[0]);
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return ProcessWorkflowLocalServiceUtil.getByS_PreP_AN(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.lang.String)arguments[2]);
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
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName102;
	private String[] _methodParameterTypes102;
	private String _methodName103;
	private String[] _methodParameterTypes103;
	private String _methodName104;
	private String[] _methodParameterTypes104;
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
}