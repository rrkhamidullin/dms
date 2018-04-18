package com.rrkh.dms.data.service;

import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceCredentialsDataService {

    DeviceCredentials getByGuid(String guid);

    DeviceCredentials save(DeviceCredentials deviceCredentials);

    void remove(String guid);
}
