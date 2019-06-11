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

package libro.service.impl;

import com.liferay.portal.kernel.exception.PortalException;

import libro.model.Escritor;
import libro.model.impl.EscritorImpl;
import libro.service.base.EscritorLocalServiceBaseImpl;

/**
 * The implementation of the escritor local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link libro.service.EscritorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EscritorLocalServiceBaseImpl
 * @see libro.service.EscritorLocalServiceUtil
 */
public class EscritorLocalServiceImpl extends EscritorLocalServiceBaseImpl {

	
	public Escritor addEscritor(long groupId, long companyId, long userId, String userName, String nombre) {

		long escritorId = counterLocalService.increment(Escritor.class.getName());
		Escritor escritor = escritorPersistence.create(escritorId);
		escritor.setGroupId(groupId);
		escritor.setCompanyId(companyId);
		escritor.setUserId(userId);
		escritor.setUserName(userName);
		escritor.setNombre(nombre);
		
		return escritorPersistence.update(escritor);
	}
	public void updateEscritor(long id, String nombre) throws PortalException {
	    final Escritor escritor = getEscritor(id);
	    escritor.setNombre(nombre);
	 
	    updateEscritor(escritor);
	}
}