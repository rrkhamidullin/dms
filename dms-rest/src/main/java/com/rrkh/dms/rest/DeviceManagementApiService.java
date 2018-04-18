package com.rrkh.dms.rest;

import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.service.DeviceCredentialsService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceManagementApiService implements DeviceManagementApi {

    private final Logger logger;
    private final DeviceCredentialsService credentialsService;

    @Autowired
    public DeviceManagementApiService(Logger logger, DeviceCredentialsService credentialsService) {
        this.logger = logger;
        this.credentialsService = credentialsService;
    }

    @RequestMapping(path = "/m/add", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public DeviceCredentials add(@RequestBody DeviceCredentials deviceCredentials) {
        return credentialsService.addDeviceCredentials(deviceCredentials);
    }

    @RequestMapping(path = "/m/{guid}", method = RequestMethod.GET)
    @ResponseBody
    @Override
    public DeviceCredentials get(@PathVariable("guid") Long guid) {
        return credentialsService.getDeviceCredentials(guid);
    }

    @RequestMapping(path = "/m/{guid}", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public DeviceCredentials update(@PathVariable("guid") Long guid, @RequestBody DeviceCredentials deviceCredentials) {
        return credentialsService.updateDeviceCredentials(guid, deviceCredentials);
    }

    @RequestMapping(path = "/m/{guid}", method = RequestMethod.DELETE)
    @Override
    public void remove(@PathVariable("guid") Long guid) {
        credentialsService.removeDeviceCredentials(guid);
    }
}
