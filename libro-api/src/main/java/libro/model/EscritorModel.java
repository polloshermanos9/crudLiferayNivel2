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

package libro.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Escritor service. Represents a row in the &quot;LIBRO_Escritor&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link libro.model.impl.EscritorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link libro.model.impl.EscritorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Escritor
 * @see libro.model.impl.EscritorImpl
 * @see libro.model.impl.EscritorModelImpl
 * @generated
 */
@ProviderType
public interface EscritorModel extends BaseModel<Escritor>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a escritor model instance should use the {@link Escritor} interface instead.
	 */

	/**
	 * Returns the primary key of this escritor.
	 *
	 * @return the primary key of this escritor
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this escritor.
	 *
	 * @param primaryKey the primary key of this escritor
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this escritor.
	 *
	 * @return the uuid of this escritor
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this escritor.
	 *
	 * @param uuid the uuid of this escritor
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the escritor ID of this escritor.
	 *
	 * @return the escritor ID of this escritor
	 */
	public long getEscritorId();

	/**
	 * Sets the escritor ID of this escritor.
	 *
	 * @param escritorId the escritor ID of this escritor
	 */
	public void setEscritorId(long escritorId);

	/**
	 * Returns the group ID of this escritor.
	 *
	 * @return the group ID of this escritor
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this escritor.
	 *
	 * @param groupId the group ID of this escritor
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this escritor.
	 *
	 * @return the company ID of this escritor
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this escritor.
	 *
	 * @param companyId the company ID of this escritor
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this escritor.
	 *
	 * @return the user ID of this escritor
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this escritor.
	 *
	 * @param userId the user ID of this escritor
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this escritor.
	 *
	 * @return the user uuid of this escritor
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this escritor.
	 *
	 * @param userUuid the user uuid of this escritor
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this escritor.
	 *
	 * @return the user name of this escritor
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this escritor.
	 *
	 * @param userName the user name of this escritor
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this escritor.
	 *
	 * @return the create date of this escritor
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this escritor.
	 *
	 * @param createDate the create date of this escritor
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this escritor.
	 *
	 * @return the modified date of this escritor
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this escritor.
	 *
	 * @param modifiedDate the modified date of this escritor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the nombre of this escritor.
	 *
	 * @return the nombre of this escritor
	 */
	@AutoEscape
	public String getNombre();

	/**
	 * Sets the nombre of this escritor.
	 *
	 * @param nombre the nombre of this escritor
	 */
	public void setNombre(String nombre);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Escritor escritor);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Escritor> toCacheModel();

	@Override
	public Escritor toEscapedModel();

	@Override
	public Escritor toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}