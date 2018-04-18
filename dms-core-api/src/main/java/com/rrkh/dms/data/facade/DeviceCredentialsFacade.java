package com.rrkh.dms.data.facade;

import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceCredentialsFacade {

    DeviceCredentials getDeviceCredentials(Long guid);

    DeviceCredentials addDeviceCredentials(DeviceCredentials deviceCredentials);

    DeviceCredentials updateDeviceCredentials(Long guid, DeviceCredentials deviceCredentials);

    void removeDeviceCredentials(Long guid);
}
