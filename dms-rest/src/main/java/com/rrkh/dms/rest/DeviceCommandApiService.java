package com.rrkh.dms.rest;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceState;
import com.rrkh.dms.service.DeviceCommandService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceCommandApiService implements DeviceCommandApi {

    private final Logger logger;
    private final DeviceCommandService commandService;

    @Autowired
    public DeviceCommandApiService(Logger logger, DeviceCommandService commandService) {
        this.logger = logger;
        this.commandService = commandService;
    }

    @Override
    public DeviceState runCommand(String guid, DeviceCommand command) {
        return commandService.runCommand(guid, command);
    }
}