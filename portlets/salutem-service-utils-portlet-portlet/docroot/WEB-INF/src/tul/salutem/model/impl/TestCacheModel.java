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

package tul.salutem.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import tul.salutem.model.Test;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Test in entity cache.
 *
 * @author Aneta Andrzejewska
 * @see Test
 * @generated
 */
public class TestCacheModel implements CacheModel<Test>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{testId=");
		sb.append(testId);
		sb.append(", username=");
		sb.append(username);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Test toEntityModel() {
		TestImpl testImpl = new TestImpl();

		testImpl.setTestId(testId);

		if (username == null) {
			testImpl.setUsername(StringPool.BLANK);
		}
		else {
			testImpl.setUsername(username);
		}

		if (createDate == Long.MIN_VALUE) {
			testImpl.setCreateDate(null);
		}
		else {
			testImpl.setCreateDate(new Date(createDate));
		}

		testImpl.resetOriginalValues();

		return testImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		testId = objectInput.readLong();
		username = objectInput.readUTF();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(testId);

		if (username == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(username);
		}

		objectOutput.writeLong(createDate);
	}

	public long testId;
	public String username;
	public long createDate;
}