package com.rrkh.dms.data.service;

import com.rrkh.dms.data.exception.NotFoundException;
import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceCredentialsService {

    DeviceCredentials getDeviceCredentials(String guid) throws NotFoundException;

    DeviceCredentials addDeviceCredentials(DeviceCredentials deviceCredentials);

    DeviceCredentials updateDeviceCredentials(String guid, DeviceCredentials deviceCredentials);

    void removeDeviceCredentials(String guid);
}
