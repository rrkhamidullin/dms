package com.rrkh.dms.data.repository;

import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceCredentialsRepository  {

    DeviceCredentials getByGuid(String guid);

    <S extends DeviceCredentials> S save(S entity);
}
