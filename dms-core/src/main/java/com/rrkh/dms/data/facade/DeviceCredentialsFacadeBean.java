package com.rrkh.dms.data.facade;

import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.service.DeviceCredentialsDataService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeviceCredentialsFacadeBean implements DeviceCredentialsFacade {

    private final Logger logger;

    private final DeviceCredentialsDataService credentialsDataService;

    @Autowired
    public DeviceCredentialsFacadeBean(Logger logger, DeviceCredentialsDataService credentialsDataService) {
        this.logger = logger;
        this.credentialsDataService = credentialsDataService;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public DeviceCredentials getDeviceCredentials(Long guid) {
        return credentialsDataService.getByGuid(guid);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public DeviceCredentials addDeviceCredentials(DeviceCredentials deviceCredentials) {
        return credentialsDataService.create(deviceCredentials);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public DeviceCredentials updateDeviceCredentials(Long guid, DeviceCredentials deviceCredentials) {
        return credentialsDataService.update(guid, deviceCredentials);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void removeDeviceCredentials(Long guid) {
        credentialsDataService.remove(guid);
    }
}
