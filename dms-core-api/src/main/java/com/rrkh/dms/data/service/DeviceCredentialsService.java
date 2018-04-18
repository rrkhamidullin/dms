package com.rrkh.dms.data.service;

import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceCredentialsService {

    DeviceCredentials getDeviceCredentials(String guid);

    DeviceCredentials addDeviceCredentials(DeviceCredentials deviceCredentials);

    DeviceCredentials updateDeviceCredentials(String guid, DeviceCredentials deviceCredentials);

    DeviceCredentials removeDeviceCredentials(String guid);
}
