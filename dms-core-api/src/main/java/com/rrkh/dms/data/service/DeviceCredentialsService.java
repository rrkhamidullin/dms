package com.rrkh.dms.data.service;

import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceCredentialsService {

    DeviceCredentials getDeviceCredentials(Long guid);

    DeviceCredentials addDeviceCredentials(DeviceCredentials deviceCredentials);

    DeviceCredentials updateDeviceCredentials(Long guid, DeviceCredentials deviceCredentials);

    void removeDeviceCredentials(Long guid);
}
