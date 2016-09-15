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
public class DossierFileLocalServiceClp implements DossierFileLocalService {
	public DossierFileLocalServiceClp(
		InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addDossierFile";

		_methodParameterTypes0 = new String[] {
				"org.opencps.dossiermgt.model.DossierFile"
			};

		_methodName1 = "createDossierFile";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteDossierFile";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteDossierFile";

		_methodParameterTypes3 = new String[] {
				"org.opencps.dossiermgt.model.DossierFile"
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

		_methodName10 = "fetchDossierFile";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getDossierFile";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getDossierFiles";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getDossierFilesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateDossierFile";

		_methodParameterTypes15 = new String[] {
				"org.opencps.dossiermgt.model.DossierFile"
			};

		_methodName16 = "getBeanIdentifier";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "setBeanIdentifier";

		_methodParameterTypes17 = new String[] { "java.lang.String" };

		_methodName19 = "addDossierFile";

		_methodParameterTypes19 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"long", "long", "long", "long", "java.lang.String",
				"java.lang.String", "long", "int", "int", "java.lang.String",
				"java.util.Date", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName20 = "addDossierFile";

		_methodParameterTypes20 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.io.InputStream", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName21 = "addDossierFile";

		_methodParameterTypes21 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"byte[][]", "com.liferay.portal.service.ServiceContext"
			};

		_methodName22 = "addDossierFile";

		_methodParameterTypes22 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"long", "long", "long", "long", "java.lang.String",
				"java.lang.String", "long", "int", "int", "java.lang.String",
				"java.util.Date", "int", "int", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.io.InputStream", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName23 = "addDossierFile";

		_methodParameterTypes23 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"long", "long", "long", "long", "java.lang.String",
				"java.lang.String", "int", "int", "java.lang.String",
				"java.util.Date", "int", "int", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "byte[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName24 = "addSignDossierFile";

		_methodParameterTypes24 = new String[] {
				"long", "boolean", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.io.InputStream", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName25 = "countDossierFile";

		_methodParameterTypes25 = new String[] { "long", "long" };

		_methodName26 = "countDossierFile";

		_methodParameterTypes26 = new String[] { "long", "long", "long" };

		_methodName27 = "countDossierFile";

		_methodParameterTypes27 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"int"
			};

		_methodName28 = "countDossierFileAdvance";

		_methodParameterTypes28 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"int", "int", "int"
			};

		_methodName29 = "countDossierFile";

		_methodParameterTypes29 = new String[] {
				"long", "java.lang.String", "long", "long", "boolean"
			};

		_methodName30 = "removeDossierFile";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "deleteDossierFile";

		_methodParameterTypes31 = new String[] { "long", "long" };

		_methodName32 = "getDossierFileByD_DP";

		_methodParameterTypes32 = new String[] { "long", "long" };

		_methodName33 = "findByF_D_S_R";

		_methodParameterTypes33 = new String[] { "long", "long", "int", "int" };

		_methodName34 = "getDossierFileByD_GF";

		_methodParameterTypes34 = new String[] { "long", "long" };

		_methodName35 = "getDossierFileByDossierId";

		_methodParameterTypes35 = new String[] { "long" };

		_methodName36 = "getDossierFileByD_S_R";

		_methodParameterTypes36 = new String[] { "long", "int", "int" };

		_methodName37 = "getDossierFileInUse";

		_methodParameterTypes37 = new String[] { "long", "long" };

		_methodName38 = "getDossierFileInUseByGroupFileId";

		_methodParameterTypes38 = new String[] { "long", "long", "long" };

		_methodName39 = "searchDossierFile";

		_methodParameterTypes39 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName40 = "searchDossierFile";

		_methodParameterTypes40 = new String[] {
				"long", "java.lang.String", "long", "long", "boolean", "int",
				"int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName41 = "searchDossierFileAdvance";

		_methodParameterTypes41 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"int", "int", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName42 = "updateDossierFile";

		_methodParameterTypes42 = new String[] {
				"long", "long", "long", "long", "java.lang.String"
			};

		_methodName43 = "updateDossierFile";

		_methodParameterTypes43 = new String[] {
				"long", "long", "long", "long", "java.lang.String", "long",
				"long", "long", "java.lang.String", "java.lang.String", "long",
				"int", "int", "java.lang.String", "java.util.Date", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName44 = "updateDossierFile";

		_methodParameterTypes44 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.io.InputStream", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName45 = "fetchByTemplateFileNoDossierId_First";

		_methodParameterTypes45 = new String[] { "long", "java.lang.String" };

		_methodName46 = "getByOid";

		_methodParameterTypes46 = new String[] { "java.lang.String" };
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(dossierFile) });
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile createDossierFile(
		long dossierFileId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] { dossierFileId });
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile deleteDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { dossierFileId });
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile deleteDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(dossierFile) });
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
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
	public org.opencps.dossiermgt.model.DossierFile fetchDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { dossierFileId });
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile getDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11, new Object[] { dossierFileId });
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
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
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFiles(
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

		return (java.util.List<org.opencps.dossiermgt.model.DossierFile>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getDossierFilesCount()
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
	public org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { ClpSerializer.translateInput(dossierFile) });
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
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
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long userId, long dossierId, long dossierPartId,
		java.lang.String templateFileNo, java.lang.String groupName,
		long fileGroupId, long groupDossierPartId, long ownerUserId,
		long ownerOrganizationId, java.lang.String displayName,
		java.lang.String formData, long fileEntryId, int dossierFileMark,
		int dossierFileType, java.lang.String dossierFileNo,
		java.util.Date dossierFileDate, int original, int syncStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] {
						userId,
						
					dossierId,
						
					dossierPartId,
						
					ClpSerializer.translateInput(templateFileNo),
						
					ClpSerializer.translateInput(groupName),
						
					fileGroupId,
						
					groupDossierPartId,
						
					ownerUserId,
						
					ownerOrganizationId,
						
					ClpSerializer.translateInput(displayName),
						
					ClpSerializer.translateInput(formData),
						
					fileEntryId,
						
					dossierFileMark,
						
					dossierFileType,
						
					ClpSerializer.translateInput(dossierFileNo),
						
					ClpSerializer.translateInput(dossierFileDate),
						
					original,
						
					syncStatus,
						
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long oldDossierFileId, long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		java.io.InputStream is, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20,
					new Object[] {
						oldDossierFileId,
						
					folderId,
						
					ClpSerializer.translateInput(sourceFileName),
						
					ClpSerializer.translateInput(mimeType),
						
					ClpSerializer.translateInput(title),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(changeLog),
						
					ClpSerializer.translateInput(is),
						
					size,
						
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long oldDossierFileId, long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog, byte[] bytes,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21,
					new Object[] {
						oldDossierFileId,
						
					folderId,
						
					ClpSerializer.translateInput(sourceFileName),
						
					ClpSerializer.translateInput(mimeType),
						
					ClpSerializer.translateInput(title),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(changeLog),
						
					ClpSerializer.translateInput(bytes),
						
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long userId, long dossierId, long dossierPartId,
		java.lang.String templateFileNo, java.lang.String groupName,
		long fileGroupId, long groupDossierPartId, long ownerUserId,
		long ownerOrganizationId, java.lang.String displayName,
		java.lang.String formData, long fileEntryId, int dossierFileMark,
		int dossierFileType, java.lang.String dossierFileNo,
		java.util.Date dossierFileDate, int original, int syncStatus,
		long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		java.io.InputStream is, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName22,
					_methodParameterTypes22,
					new Object[] {
						userId,
						
					dossierId,
						
					dossierPartId,
						
					ClpSerializer.translateInput(templateFileNo),
						
					ClpSerializer.translateInput(groupName),
						
					fileGroupId,
						
					groupDossierPartId,
						
					ownerUserId,
						
					ownerOrganizationId,
						
					ClpSerializer.translateInput(displayName),
						
					ClpSerializer.translateInput(formData),
						
					fileEntryId,
						
					dossierFileMark,
						
					dossierFileType,
						
					ClpSerializer.translateInput(dossierFileNo),
						
					ClpSerializer.translateInput(dossierFileDate),
						
					original,
						
					syncStatus,
						
					folderId,
						
					ClpSerializer.translateInput(sourceFileName),
						
					ClpSerializer.translateInput(mimeType),
						
					ClpSerializer.translateInput(title),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(changeLog),
						
					ClpSerializer.translateInput(is),
						
					size,
						
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long userId, long dossierId, long dossierPartId,
		java.lang.String templateFileNo, java.lang.String groupName,
		long fileGroupId, long groupDossierPartId, long ownerUserId,
		long ownerOrganizationId, java.lang.String displayName,
		java.lang.String formData, int dossierFileMark, int dossierFileType,
		java.lang.String dossierFileNo, java.util.Date dossierFileDate,
		int original, int syncStatus, long folderId,
		java.lang.String sourceFileName, java.lang.String mimeType,
		java.lang.String title, java.lang.String description,
		java.lang.String changeLog, byte[] bytes,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] {
						userId,
						
					dossierId,
						
					dossierPartId,
						
					ClpSerializer.translateInput(templateFileNo),
						
					ClpSerializer.translateInput(groupName),
						
					fileGroupId,
						
					groupDossierPartId,
						
					ownerUserId,
						
					ownerOrganizationId,
						
					ClpSerializer.translateInput(displayName),
						
					ClpSerializer.translateInput(formData),
						
					dossierFileMark,
						
					dossierFileType,
						
					ClpSerializer.translateInput(dossierFileNo),
						
					ClpSerializer.translateInput(dossierFileDate),
						
					original,
						
					syncStatus,
						
					folderId,
						
					ClpSerializer.translateInput(sourceFileName),
						
					ClpSerializer.translateInput(mimeType),
						
					ClpSerializer.translateInput(title),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(changeLog),
						
					ClpSerializer.translateInput(bytes),
						
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile addSignDossierFile(
		long oldDossierFileId, boolean isSigned, long folderId,
		java.lang.String sourceFileName, java.lang.String mimeType,
		java.lang.String title, java.lang.String description,
		java.lang.String changeLog, java.io.InputStream is, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24,
					new Object[] {
						oldDossierFileId,
						
					isSigned,
						
					folderId,
						
					ClpSerializer.translateInput(sourceFileName),
						
					ClpSerializer.translateInput(mimeType),
						
					ClpSerializer.translateInput(title),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(changeLog),
						
					ClpSerializer.translateInput(is),
						
					size,
						
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countDossierFile(long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
					new Object[] { dossierId, dossierPartId });
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
	public int countDossierFile(long dossierId, long dossierPartId,
		long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName26,
					_methodParameterTypes26,
					new Object[] { dossierId, dossierPartId, groupFileId });
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
	public int countDossierFile(long groupId, long ownerUserId,
		long ownerOrganizationId, java.lang.String keyword,
		java.lang.String templateFileNo, int removed)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] {
						groupId,
						
					ownerUserId,
						
					ownerOrganizationId,
						
					ClpSerializer.translateInput(keyword),
						
					ClpSerializer.translateInput(templateFileNo),
						
					removed
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

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countDossierFileAdvance(long groupId, long ownerUserId,
		long ownerOrganizationId, java.lang.String keyword,
		java.lang.String templateFileNo, int removed, int partType, int original)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName28,
					_methodParameterTypes28,
					new Object[] {
						groupId,
						
					ownerUserId,
						
					ownerOrganizationId,
						
					ClpSerializer.translateInput(keyword),
						
					ClpSerializer.translateInput(templateFileNo),
						
					removed,
						
					partType,
						
					original
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

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countDossierFile(long groupId, java.lang.String keyword,
		long dossierTemplateId, long fileEntryId, boolean onlyViewFileResult)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(keyword),
						
					dossierTemplateId,
						
					fileEntryId,
						
					onlyViewFileResult
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

		return ((Integer)returnObj).intValue();
	}

	@Override
	public void removeDossierFile(long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			_invokableLocalService.invokeMethod(_methodName30,
				_methodParameterTypes30, new Object[] { dossierFileId });
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
	}

	@Override
	public void deleteDossierFile(long dossierFileId, long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			_invokableLocalService.invokeMethod(_methodName31,
				_methodParameterTypes31,
				new Object[] { dossierFileId, fileEntryId });
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
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByD_DP(
		long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName32,
					_methodParameterTypes32,
					new Object[] { dossierId, dossierPartId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.dossiermgt.NoSuchDossierFileException) {
				throw (org.opencps.dossiermgt.NoSuchDossierFileException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.opencps.dossiermgt.model.DossierFile>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> findByF_D_S_R(
		long fileGroupId, long dossierId, int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName33,
					_methodParameterTypes33,
					new Object[] { fileGroupId, dossierId, syncStatus, removed });
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

		return (java.util.List<org.opencps.dossiermgt.model.DossierFile>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByD_GF(
		long dossierId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName34,
					_methodParameterTypes34,
					new Object[] { dossierId, groupFileId });
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

		return (java.util.List<org.opencps.dossiermgt.model.DossierFile>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName35,
					_methodParameterTypes35, new Object[] { dossierId });
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

		return (java.util.List<org.opencps.dossiermgt.model.DossierFile>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByD_S_R(
		long dossierId, int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName36,
					_methodParameterTypes36,
					new Object[] { dossierId, syncStatus, removed });
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

		return (java.util.List<org.opencps.dossiermgt.model.DossierFile>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile getDossierFileInUse(
		long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName37,
					_methodParameterTypes37,
					new Object[] { dossierId, dossierPartId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.dossiermgt.NoSuchDossierFileException) {
				throw (org.opencps.dossiermgt.NoSuchDossierFileException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile getDossierFileInUseByGroupFileId(
		long dossierId, long dossierPartId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName38,
					_methodParameterTypes38,
					new Object[] { dossierId, dossierPartId, groupFileId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.dossiermgt.NoSuchDossierFileException) {
				throw (org.opencps.dossiermgt.NoSuchDossierFileException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> searchDossierFile(
		long groupId, long ownerUserId, long ownerOrganizationId,
		java.lang.String keyword, java.lang.String templateFileNo, int removed,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName39,
					_methodParameterTypes39,
					new Object[] {
						groupId,
						
					ownerUserId,
						
					ownerOrganizationId,
						
					ClpSerializer.translateInput(keyword),
						
					ClpSerializer.translateInput(templateFileNo),
						
					removed,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(obc)
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

		return (java.util.List<org.opencps.dossiermgt.model.DossierFile>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> searchDossierFile(
		long groupId, java.lang.String keyword, long dossierTemplateId,
		long fileEntryId, boolean onlyViewFileResult, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName40,
					_methodParameterTypes40,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(keyword),
						
					dossierTemplateId,
						
					fileEntryId,
						
					onlyViewFileResult,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(obc)
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

		return (java.util.List<org.opencps.dossiermgt.model.DossierFile>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List searchDossierFileAdvance(long groupId,
		long ownerUserId, long ownerOrganizationId, java.lang.String keyword,
		java.lang.String templateFileNo, int removed, int partType,
		int original, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName41,
					_methodParameterTypes41,
					new Object[] {
						groupId,
						
					ownerUserId,
						
					ownerOrganizationId,
						
					ClpSerializer.translateInput(keyword),
						
					ClpSerializer.translateInput(templateFileNo),
						
					removed,
						
					partType,
						
					original,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(obc)
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
	public org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		long dossierFileId, long ownerUserId, long ownerOrganizationId,
		long fileEntryId, java.lang.String displayName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName42,
					_methodParameterTypes42,
					new Object[] {
						dossierFileId,
						
					ownerUserId,
						
					ownerOrganizationId,
						
					fileEntryId,
						
					ClpSerializer.translateInput(displayName)
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

			if (t instanceof org.opencps.dossiermgt.NoSuchDossierFileException) {
				throw (org.opencps.dossiermgt.NoSuchDossierFileException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		long dossierFileId, long userId, long dossierId, long dossierPartId,
		java.lang.String templateFileNo, long groupFileId, long ownerUserId,
		long ownerOrganizationId, java.lang.String displayName,
		java.lang.String formData, long fileEntryId, int dossierFileMark,
		int dossierFileType, java.lang.String dossierFileNo,
		java.util.Date dossierFileDate, int original, int syncStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName43,
					_methodParameterTypes43,
					new Object[] {
						dossierFileId,
						
					userId,
						
					dossierId,
						
					dossierPartId,
						
					ClpSerializer.translateInput(templateFileNo),
						
					groupFileId,
						
					ownerUserId,
						
					ownerOrganizationId,
						
					ClpSerializer.translateInput(displayName),
						
					ClpSerializer.translateInput(formData),
						
					fileEntryId,
						
					dossierFileMark,
						
					dossierFileType,
						
					ClpSerializer.translateInput(dossierFileNo),
						
					ClpSerializer.translateInput(dossierFileDate),
						
					original,
						
					syncStatus,
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.dossiermgt.NoSuchDossierFileException) {
				throw (org.opencps.dossiermgt.NoSuchDossierFileException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		long dossierFileId, long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		java.io.InputStream is, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName44,
					_methodParameterTypes44,
					new Object[] {
						dossierFileId,
						
					folderId,
						
					ClpSerializer.translateInput(sourceFileName),
						
					ClpSerializer.translateInput(mimeType),
						
					ClpSerializer.translateInput(title),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(changeLog),
						
					ClpSerializer.translateInput(is),
						
					size,
						
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile fetchByTemplateFileNoDossierId_First(
		long dossierId, java.lang.String templateFileNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName45,
					_methodParameterTypes45,
					new Object[] {
						dossierId,
						
					ClpSerializer.translateInput(templateFileNo)
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierFile getByOid(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName46,
					_methodParameterTypes46,
					new Object[] { ClpSerializer.translateInput(oid) });
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

		return (org.opencps.dossiermgt.model.DossierFile)ClpSerializer.translateOutput(returnObj);
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
}