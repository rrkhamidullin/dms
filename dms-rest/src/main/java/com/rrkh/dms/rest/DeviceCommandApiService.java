package com.rrkh.dms.rest;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceState;
import com.rrkh.dms.service.DeviceCommandService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping(path = "/c/{guid}", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public DeviceState runCommand(@PathVariable("guid") Long guid, @RequestBody DeviceCommand command) {
        return commandService.runCommand(guid, command);
    }

    @RequestMapping(path = "/c/{guid}", method = RequestMethod.GET)
    @ResponseBody
    @Override
    public DeviceState pollState(@PathVariable("guid") Long guid) {
        return commandService.pollState(guid);
    }
}
