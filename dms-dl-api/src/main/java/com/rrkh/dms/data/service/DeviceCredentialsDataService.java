package com.rrkh.dms.data.service;

import com.rrkh.dms.data.exception.NotFoundException;
import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceCredentialsDataService {

    DeviceCredentials getByGuid(String guid) throws NotFoundException;

    DeviceCredentials save(DeviceCredentials deviceCredentials);

    void remove(String guid);
}
