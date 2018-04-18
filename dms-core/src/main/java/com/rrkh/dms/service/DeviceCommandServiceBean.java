package com.rrkh.dms.service;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceState;
import com.rrkh.dms.data.service.DeviceCredentialsService;
import com.rrkh.dms.device.DeviceCommandInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeviceCommandServiceBean implements DeviceCommandService {

    private final DeviceCommandInterface commandInterface;
    private final DeviceCredentialsService credentialsService;

    @Autowired
    public DeviceCommandServiceBean(DeviceCommandInterface commandInterface, DeviceCredentialsService credentialsService) {
        this.commandInterface = commandInterface;
        this.credentialsService = credentialsService;
    }


    @Override
    public DeviceState runCommand(String guid, DeviceCommand command) {
        DeviceCredentials deviceCredentials = credentialsService.getDeviceCredentials(guid);
        return commandInterface.runCommand(deviceCredentials, command);
    }
}
