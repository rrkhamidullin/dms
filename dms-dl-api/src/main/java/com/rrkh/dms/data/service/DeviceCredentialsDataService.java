package com.rrkh.dms.data.service;

import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceCredentialsDataService {

    DeviceCredentials getByGuid(Long guid);

    DeviceCredentials create(DeviceCredentials deviceCredentials);

    DeviceCredentials update(Long guid, DeviceCredentials deviceCredentials);

    void remove(Long guid);
}
