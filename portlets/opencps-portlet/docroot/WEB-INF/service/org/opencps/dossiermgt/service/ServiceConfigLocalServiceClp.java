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

package org.opencps.dossiermgt.service;

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author trungnt
 * @generated
 */
public class ServiceConfigLocalServiceClp implements ServiceConfigLocalService {
	public ServiceConfigLocalServiceClp(
		InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addServiceConfig";

		_methodParameterTypes0 = new String[] {
				"org.opencps.dossiermgt.model.ServiceConfig"
			};

		_methodName1 = "createServiceConfig";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteServiceConfig";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteServiceConfig";

		_methodParameterTypes3 = new String[] {
				"org.opencps.dossiermgt.model.ServiceConfig"
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

		_methodName10 = "fetchServiceConfig";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getServiceConfig";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getServiceConfigs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getServiceConfigsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateServiceConfig";

		_methodParameterTypes15 = new String[] {
				"org.opencps.dossiermgt.model.ServiceConfig"
			};

		_methodName16 = "getBeanIdentifier";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "setBeanIdentifier";

		_methodParameterTypes17 = new String[] { "java.lang.String" };

		_methodName19 = "addServiceConfig";

		_methodParameterTypes19 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long",
				"java.lang.String", "java.lang.String", "int",
				"java.lang.String", "long", "java.lang.String", "boolean",
				"boolean", "boolean", "boolean", "boolean", "java.lang.String",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName20 = "countAll";

		_methodParameterTypes20 = new String[] {  };

		_methodName21 = "countByDossierTemplateId";

		_methodParameterTypes21 = new String[] { "long" };

		_methodName22 = "countServiceConfig";

		_methodParameterTypes22 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName23 = "countServiceConfigAdvance";

		_methodParameterTypes23 = new String[] {
				"long", "java.lang.String", "int", "int", "int", "int", "int",
				"java.lang.String", "java.lang.String"
			};

		_methodName24 = "countServiceConfigByServiceMode";

		_methodParameterTypes24 = new String[] { "long", "int[][]" };

		_methodName25 = "countServiceConFigsByG_M";

		_methodParameterTypes25 = new String[] { "long", "int" };

		_methodName26 = "deleteServiceConfigById";

		_methodParameterTypes26 = new String[] { "long" };

		_methodName27 = "searchServiceConfigAdvance";

		_methodParameterTypes27 = new String[] {
				"long", "java.lang.String", "int", "int", "int", "int", "int",
				"java.lang.String", "java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getServiceConfigRecent";

		_methodParameterTypes28 = new String[] {
				"long", "long", "int", "int", "int", "int", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName29 = "getAll";

		_methodParameterTypes29 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName30 = "getServiceConfigByG_S";

		_methodParameterTypes30 = new String[] { "long", "long" };

		_methodName31 = "getServiceConfigByG_S_A";

		_methodParameterTypes31 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName32 = "getServiceConfigByG_S_G";

		_methodParameterTypes32 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName33 = "getServiceConfigs";

		_methodParameterTypes33 = new String[] { "long" };

		_methodName34 = "getServiceConFigsByG_M";

		_methodParameterTypes34 = new String[] { "long", "int", "int", "int" };

		_methodName35 = "searchServiceConfig";

		_methodParameterTypes35 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "int"
			};

		_methodName36 = "searchServiceConfigByServiceMode";

		_methodParameterTypes36 = new String[] {
				"long", "int[][]", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName37 = "updateServiceConfig";

		_methodParameterTypes37 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String", "long",
				"java.lang.String", "java.lang.String", "int",
				"java.lang.String", "long", "java.lang.String", "boolean",
				"boolean", "boolean", "boolean", "boolean", "java.lang.String",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName38 = "getServiceConfigsByS_G";

		_methodParameterTypes38 = new String[] { "long", "long" };
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig addServiceConfig(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(serviceConfig) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig createServiceConfig(
		long serviceConfigId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] { serviceConfigId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig deleteServiceConfig(
		long serviceConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { serviceConfigId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig deleteServiceConfig(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(serviceConfig) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.DynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					ClpSerializer.translateInput(projection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig fetchServiceConfig(
		long serviceConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { serviceConfigId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig getServiceConfig(
		long serviceConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11, new Object[] { serviceConfigId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getServiceConfigs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.opencps.dossiermgt.model.ServiceConfig>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getServiceConfigsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig updateServiceConfig(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { ClpSerializer.translateInput(serviceConfig) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName17,
				_methodParameterTypes17,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig addServiceConfig(
		long serviceInfoId, java.lang.String serviceAdministrationIndex,
		java.lang.String serviceDomainIndex, long dossierTemplateId,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		int serviceLevel, java.lang.String domainCode, long userId,
		java.lang.String serviceInstruction, boolean servicePortal,
		boolean serviceOnegate, boolean serviceBackoffice,
		boolean serviceCitizen, boolean serviceBusinees,
		java.lang.String govAgencyIndex, java.lang.String serviceUrl,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] {
						serviceInfoId,
						
					ClpSerializer.translateInput(serviceAdministrationIndex),
						
					ClpSerializer.translateInput(serviceDomainIndex),
						
					dossierTemplateId,
						
					ClpSerializer.translateInput(govAgencyCode),
						
					ClpSerializer.translateInput(govAgencyName),
						
					serviceLevel,
						
					ClpSerializer.translateInput(domainCode),
						
					userId,
						
					ClpSerializer.translateInput(serviceInstruction),
						
					servicePortal,
						
					serviceOnegate,
						
					serviceBackoffice,
						
					serviceCitizen,
						
					serviceBusinees,
						
					ClpSerializer.translateInput(govAgencyIndex),
						
					ClpSerializer.translateInput(serviceUrl),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countByDossierTemplateId(long dossierTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21, new Object[] { dossierTemplateId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countServiceConfig(long groupId, java.lang.String keywords,
		java.lang.String govAgencyCode, java.lang.String domainCode) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName22,
					_methodParameterTypes22,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(keywords),
						
					ClpSerializer.translateInput(govAgencyCode),
						
					ClpSerializer.translateInput(domainCode)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countServiceConfigAdvance(long groupId,
		java.lang.String keyword, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		java.lang.String serviceDomainIndex, java.lang.String govAgencyIndex) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(keyword),
						
					servicePortal,
						
					serviceOnegate,
						
					serviceBackoffice,
						
					serviceCitizen,
						
					serviceBusinees,
						
					ClpSerializer.translateInput(serviceDomainIndex),
						
					ClpSerializer.translateInput(govAgencyIndex)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countServiceConfigByServiceMode(long groupId, int[] serviceModes) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(serviceModes)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countServiceConFigsByG_M(long groupId, int serviceMode)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
					new Object[] { groupId, serviceMode });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public void deleteServiceConfigById(long serviceConfigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		try {
			_invokableLocalService.invokeMethod(_methodName26,
				_methodParameterTypes26, new Object[] { serviceConfigId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.dossiermgt.NoSuchServiceConfigException) {
				throw (org.opencps.dossiermgt.NoSuchServiceConfigException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.util.List searchServiceConfigAdvance(long groupId,
		java.lang.String keyword, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		java.lang.String serviceDomainIndex, java.lang.String govAgencyIndex,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(keyword),
						
					servicePortal,
						
					serviceOnegate,
						
					serviceBackoffice,
						
					serviceCitizen,
						
					serviceBusinees,
						
					ClpSerializer.translateInput(serviceDomainIndex),
						
					ClpSerializer.translateInput(govAgencyIndex),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List getServiceConfigRecent(long groupId, long userId,
		int servicePortal, int serviceOnegate, int serviceBackoffice,
		int serviceCitizen, int serviceBusinees, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName28,
					_methodParameterTypes28,
					new Object[] {
						groupId,
						
					userId,
						
					servicePortal,
						
					serviceOnegate,
						
					serviceBackoffice,
						
					serviceCitizen,
						
					serviceBusinees,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29,
					new Object[] {
						start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.opencps.dossiermgt.model.ServiceConfig>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig getServiceConfigByG_S(
		long groupId, long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName30,
					_methodParameterTypes30,
					new Object[] { groupId, serviceInfoId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.dossiermgt.NoSuchServiceConfigException) {
				throw (org.opencps.dossiermgt.NoSuchServiceConfigException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig getServiceConfigByG_S_A(
		long groupId, long serviceInfoId,
		java.lang.String serviceAdministrationIndex)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName31,
					_methodParameterTypes31,
					new Object[] {
						groupId,
						
					serviceInfoId,
						
					ClpSerializer.translateInput(serviceAdministrationIndex)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.dossiermgt.NoSuchServiceConfigException) {
				throw (org.opencps.dossiermgt.NoSuchServiceConfigException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig getServiceConfigByG_S_G(
		long groupId, long serviceInfoId, java.lang.String govAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName32,
					_methodParameterTypes32,
					new Object[] {
						groupId,
						
					serviceInfoId,
						
					ClpSerializer.translateInput(govAgencyCode)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.dossiermgt.NoSuchServiceConfigException) {
				throw (org.opencps.dossiermgt.NoSuchServiceConfigException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getServiceConfigs(
		long dossierTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName33,
					_methodParameterTypes33, new Object[] { dossierTemplateId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.opencps.dossiermgt.model.ServiceConfig>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getServiceConFigsByG_M(
		long groupId, int serviceMode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName34,
					_methodParameterTypes34,
					new Object[] { groupId, serviceMode, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.opencps.dossiermgt.model.ServiceConfig>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.ServiceConfig> searchServiceConfig(
		long groupId, java.lang.String keywords,
		java.lang.String govAgencyCode, java.lang.String domainCode, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName35,
					_methodParameterTypes35,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(keywords),
						
					ClpSerializer.translateInput(govAgencyCode),
						
					ClpSerializer.translateInput(domainCode),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.opencps.dossiermgt.model.ServiceConfig>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.ServiceConfig> searchServiceConfigByServiceMode(
		long groupId, int[] serviceModes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName36,
					_methodParameterTypes36,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(serviceModes),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.opencps.dossiermgt.model.ServiceConfig>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig updateServiceConfig(
		long serviceConfigId, long serviceInfoId,
		java.lang.String serviceAdministrationIndex,
		java.lang.String serviceDomainIndex, long dossierTemplateId,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		int serviceLevel, java.lang.String domainCode, long userId,
		java.lang.String serviceInstruction, boolean servicePortal,
		boolean serviceOnegate, boolean serviceBackoffice,
		boolean serviceCitizen, boolean serviceBusinees,
		java.lang.String govAgencyIndex, java.lang.String serviceUrl,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName37,
					_methodParameterTypes37,
					new Object[] {
						serviceConfigId,
						
					serviceInfoId,
						
					ClpSerializer.translateInput(serviceAdministrationIndex),
						
					ClpSerializer.translateInput(serviceDomainIndex),
						
					dossierTemplateId,
						
					ClpSerializer.translateInput(govAgencyCode),
						
					ClpSerializer.translateInput(govAgencyName),
						
					serviceLevel,
						
					ClpSerializer.translateInput(domainCode),
						
					userId,
						
					ClpSerializer.translateInput(serviceInstruction),
						
					servicePortal,
						
					serviceOnegate,
						
					serviceBackoffice,
						
					serviceCitizen,
						
					serviceBusinees,
						
					ClpSerializer.translateInput(govAgencyIndex),
						
					ClpSerializer.translateInput(serviceUrl),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.ServiceConfig)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getServiceConfigsByS_G(
		long serviceInfoId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName38,
					_methodParameterTypes38,
					new Object[] { serviceInfoId, groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.opencps.dossiermgt.model.ServiceConfig>)ClpSerializer.translateOutput(returnObj);
	}

	private InvokableLocalService _invokableLocalService;
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
}