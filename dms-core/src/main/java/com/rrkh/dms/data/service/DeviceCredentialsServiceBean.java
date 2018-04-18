package com.rrkh.dms.data.service;


import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceCredentialsDto;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceCredentialsServiceBean implements DeviceCredentialsService {

    private final Logger logger;

    private final DeviceCredentialsDataService credentialsDataService;

    @Autowired
    public DeviceCredentialsServiceBean(Logger logger, DeviceCredentialsDataService credentialsDataService) {
        this.logger = logger;
        this.credentialsDataService = credentialsDataService;
    }

    @Override
    public DeviceCredentials getDeviceCredentials(String guid) {
        return new DeviceCredentialsDto(credentialsDataService.getByGuid(guid));
    }

    @Override
    public DeviceCredentials addDeviceCredentials(DeviceCredentials deviceCredentials) {
        return new DeviceCredentialsDto(credentialsDataService.save(deviceCredentials));
    }

    @Override
    public DeviceCredentials updateDeviceCredentials(String guid, DeviceCredentials deviceCredentials) {
        return new DeviceCredentialsDto(credentialsDataService.save(deviceCredentials));
    }

    @Override
    public void removeDeviceCredentials(String guid) {
        credentialsDataService.remove(guid);
    }
}
