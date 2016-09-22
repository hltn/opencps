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

import org.opencps.processmgt.service.ProcessStepDossierPartLocalServiceUtil;

import java.util.Arrays;

/**
 * @author khoavd
 * @generated
 */
public class ProcessStepDossierPartLocalServiceClpInvoker {
	public ProcessStepDossierPartLocalServiceClpInvoker() {
		_methodName0 = "addProcessStepDossierPart";

		_methodParameterTypes0 = new String[] {
				"org.opencps.processmgt.model.ProcessStepDossierPart"
			};

		_methodName1 = "createProcessStepDossierPart";

		_methodParameterTypes1 = new String[] {
				"org.opencps.processmgt.service.persistence.ProcessStepDossierPartPK"
			};

		_methodName2 = "deleteProcessStepDossierPart";

		_methodParameterTypes2 = new String[] {
				"org.opencps.processmgt.service.persistence.ProcessStepDossierPartPK"
			};

		_methodName3 = "deleteProcessStepDossierPart";

		_methodParameterTypes3 = new String[] {
				"org.opencps.processmgt.model.ProcessStepDossierPart"
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

		_methodName10 = "fetchProcessStepDossierPart";

		_methodParameterTypes10 = new String[] {
				"org.opencps.processmgt.service.persistence.ProcessStepDossierPartPK"
			};

		_methodName11 = "getProcessStepDossierPart";

		_methodParameterTypes11 = new String[] {
				"org.opencps.processmgt.service.persistence.ProcessStepDossierPartPK"
			};

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getProcessStepDossierParts";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getProcessStepDossierPartsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateProcessStepDossierPart";

		_methodParameterTypes15 = new String[] {
				"org.opencps.processmgt.model.ProcessStepDossierPart"
			};

		_methodName96 = "getBeanIdentifier";

		_methodParameterTypes96 = new String[] {  };

		_methodName97 = "setBeanIdentifier";

		_methodParameterTypes97 = new String[] { "java.lang.String" };

		_methodName102 = "removeStepDossier";

		_methodParameterTypes102 = new String[] { "java.util.List" };

		_methodName103 = "getByStep";

		_methodParameterTypes103 = new String[] { "long" };

		_methodName104 = "addPSDP";

		_methodParameterTypes104 = new String[] { "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.addProcessStepDossierPart((org.opencps.processmgt.model.ProcessStepDossierPart)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.createProcessStepDossierPart((org.opencps.processmgt.service.persistence.ProcessStepDossierPartPK)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.deleteProcessStepDossierPart((org.opencps.processmgt.service.persistence.ProcessStepDossierPartPK)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.deleteProcessStepDossierPart((org.opencps.processmgt.model.ProcessStepDossierPart)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.fetchProcessStepDossierPart((org.opencps.processmgt.service.persistence.ProcessStepDossierPartPK)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.getProcessStepDossierPart((org.opencps.processmgt.service.persistence.ProcessStepDossierPartPK)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.getProcessStepDossierParts(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.getProcessStepDossierPartsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.updateProcessStepDossierPart((org.opencps.processmgt.model.ProcessStepDossierPart)arguments[0]);
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			ProcessStepDossierPartLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			ProcessStepDossierPartLocalServiceUtil.removeStepDossier((java.util.List<org.opencps.processmgt.model.ProcessStepDossierPart>)arguments[0]);

			return null;
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.getByStep(((Long)arguments[0]).longValue());
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return ProcessStepDossierPartLocalServiceUtil.addPSDP(((Long)arguments[0]).longValue(),
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
}