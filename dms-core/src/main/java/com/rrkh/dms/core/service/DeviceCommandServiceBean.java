package com.rrkh.dms.core.service;

import com.rrkh.dms.data.facade.DeviceCredentialsFacade;
import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceState;
import com.rrkh.dms.device.service.DeviceCommandInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceCommandServiceBean implements DeviceCommandService {

    private final DeviceCommandInterface commandInterface;
    private final DeviceCredentialsFacade credentialsService;

    @Autowired
    public DeviceCommandServiceBean(DeviceCommandInterface commandInterface, DeviceCredentialsFacade credentialsService) {
        this.commandInterface = commandInterface;
        this.credentialsService = credentialsService;
    }

    @Override
    public DeviceState runCommand(Long guid, DeviceCommand command) {
        DeviceCredentials deviceCredentials = credentialsService.getDeviceCredentials(guid);
        return commandInterface.sendCommand(deviceCredentials, command);
    }

    @Override
    public DeviceState pollState(Long guid) {
        DeviceCredentials deviceCredentials = credentialsService.getDeviceCredentials(guid);
        return commandInterface.pollState(deviceCredentials);
    }
}
