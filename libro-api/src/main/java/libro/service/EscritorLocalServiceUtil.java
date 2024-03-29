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

package libro.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Escritor. This utility wraps
 * {@link libro.service.impl.EscritorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EscritorLocalService
 * @see libro.service.base.EscritorLocalServiceBaseImpl
 * @see libro.service.impl.EscritorLocalServiceImpl
 * @generated
 */
@ProviderType
public class EscritorLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link libro.service.impl.EscritorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the escritor to the database. Also notifies the appropriate model listeners.
	*
	* @param escritor the escritor
	* @return the escritor that was added
	*/
	public static libro.model.Escritor addEscritor(
		libro.model.Escritor escritor) {
		return getService().addEscritor(escritor);
	}

	public static libro.model.Escritor addEscritor(long groupId,
		long companyId, long userId, java.lang.String userName,
		java.lang.String nombre) {
		return getService()
				   .addEscritor(groupId, companyId, userId, userName, nombre);
	}

	public static void addLibroEscritor(long libroId,
		libro.model.Escritor escritor) {
		getService().addLibroEscritor(libroId, escritor);
	}

	public static void addLibroEscritor(long libroId, long escritorId) {
		getService().addLibroEscritor(libroId, escritorId);
	}

	public static void addLibroEscritors(long libroId,
		java.util.List<libro.model.Escritor> escritors) {
		getService().addLibroEscritors(libroId, escritors);
	}

	public static void addLibroEscritors(long libroId, long[] escritorIds) {
		getService().addLibroEscritors(libroId, escritorIds);
	}

	public static void clearLibroEscritors(long libroId) {
		getService().clearLibroEscritors(libroId);
	}

	/**
	* Creates a new escritor with the primary key. Does not add the escritor to the database.
	*
	* @param escritorId the primary key for the new escritor
	* @return the new escritor
	*/
	public static libro.model.Escritor createEscritor(long escritorId) {
		return getService().createEscritor(escritorId);
	}

	/**
	* Deletes the escritor from the database. Also notifies the appropriate model listeners.
	*
	* @param escritor the escritor
	* @return the escritor that was removed
	*/
	public static libro.model.Escritor deleteEscritor(
		libro.model.Escritor escritor) {
		return getService().deleteEscritor(escritor);
	}

	/**
	* Deletes the escritor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param escritorId the primary key of the escritor
	* @return the escritor that was removed
	* @throws PortalException if a escritor with the primary key could not be found
	*/
	public static libro.model.Escritor deleteEscritor(long escritorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteEscritor(escritorId);
	}

	public static void deleteLibroEscritor(long libroId,
		libro.model.Escritor escritor) {
		getService().deleteLibroEscritor(libroId, escritor);
	}

	public static void deleteLibroEscritor(long libroId, long escritorId) {
		getService().deleteLibroEscritor(libroId, escritorId);
	}

	public static void deleteLibroEscritors(long libroId,
		java.util.List<libro.model.Escritor> escritors) {
		getService().deleteLibroEscritors(libroId, escritors);
	}

	public static void deleteLibroEscritors(long libroId, long[] escritorIds) {
		getService().deleteLibroEscritors(libroId, escritorIds);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link libro.model.impl.EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link libro.model.impl.EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static libro.model.Escritor fetchEscritor(long escritorId) {
		return getService().fetchEscritor(escritorId);
	}

	/**
	* Returns the escritor matching the UUID and group.
	*
	* @param uuid the escritor's UUID
	* @param groupId the primary key of the group
	* @return the matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public static libro.model.Escritor fetchEscritorByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchEscritorByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the escritor with the primary key.
	*
	* @param escritorId the primary key of the escritor
	* @return the escritor
	* @throws PortalException if a escritor with the primary key could not be found
	*/
	public static libro.model.Escritor getEscritor(long escritorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEscritor(escritorId);
	}

	/**
	* Returns the escritor matching the UUID and group.
	*
	* @param uuid the escritor's UUID
	* @param groupId the primary key of the group
	* @return the matching escritor
	* @throws PortalException if a matching escritor could not be found
	*/
	public static libro.model.Escritor getEscritorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEscritorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the escritors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link libro.model.impl.EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @return the range of escritors
	*/
	public static java.util.List<libro.model.Escritor> getEscritors(int start,
		int end) {
		return getService().getEscritors(start, end);
	}

	/**
	* Returns all the escritors matching the UUID and company.
	*
	* @param uuid the UUID of the escritors
	* @param companyId the primary key of the company
	* @return the matching escritors, or an empty list if no matches were found
	*/
	public static java.util.List<libro.model.Escritor> getEscritorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getEscritorsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of escritors matching the UUID and company.
	*
	* @param uuid the UUID of the escritors
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching escritors, or an empty list if no matches were found
	*/
	public static java.util.List<libro.model.Escritor> getEscritorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<libro.model.Escritor> orderByComparator) {
		return getService()
				   .getEscritorsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of escritors.
	*
	* @return the number of escritors
	*/
	public static int getEscritorsCount() {
		return getService().getEscritorsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	public static java.util.List<libro.model.Escritor> getLibroEscritors(
		long libroId) {
		return getService().getLibroEscritors(libroId);
	}

	public static java.util.List<libro.model.Escritor> getLibroEscritors(
		long libroId, int start, int end) {
		return getService().getLibroEscritors(libroId, start, end);
	}

	public static java.util.List<libro.model.Escritor> getLibroEscritors(
		long libroId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<libro.model.Escritor> orderByComparator) {
		return getService()
				   .getLibroEscritors(libroId, start, end, orderByComparator);
	}

	public static int getLibroEscritorsCount(long libroId) {
		return getService().getLibroEscritorsCount(libroId);
	}

	/**
	* Returns the libroIds of the libros associated with the escritor.
	*
	* @param escritorId the escritorId of the escritor
	* @return long[] the libroIds of libros associated with the escritor
	*/
	public static long[] getLibroPrimaryKeys(long escritorId) {
		return getService().getLibroPrimaryKeys(escritorId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static boolean hasLibroEscritor(long libroId, long escritorId) {
		return getService().hasLibroEscritor(libroId, escritorId);
	}

	public static boolean hasLibroEscritors(long libroId) {
		return getService().hasLibroEscritors(libroId);
	}

	public static void setLibroEscritors(long libroId, long[] escritorIds) {
		getService().setLibroEscritors(libroId, escritorIds);
	}

	/**
	* Updates the escritor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param escritor the escritor
	* @return the escritor that was updated
	*/
	public static libro.model.Escritor updateEscritor(
		libro.model.Escritor escritor) {
		return getService().updateEscritor(escritor);
	}

	public static void updateEscritor(long id, java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateEscritor(id, nombre);
	}

	public static EscritorLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EscritorLocalService, EscritorLocalService> _serviceTracker =
		ServiceTrackerFactory.open(EscritorLocalService.class);
}