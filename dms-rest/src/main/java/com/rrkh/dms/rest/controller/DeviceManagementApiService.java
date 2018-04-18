package com.rrkh.dms.rest.controller;

import com.rrkh.dms.data.facade.DeviceCredentialsFacade;
import com.rrkh.dms.data.model.DeviceCredentials;
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
    private final DeviceCredentialsFacade credentialsFacade;

    @Autowired
    public DeviceManagementApiService(Logger logger, DeviceCredentialsFacade credentialsFacade) {
        this.logger = logger;
        this.credentialsFacade = credentialsFacade;
    }

    @RequestMapping(path = "/m/add", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public DeviceCredentials add(@RequestBody DeviceCredentials deviceCredentials) {
        return credentialsFacade.addDeviceCredentials(deviceCredentials);
    }

    @RequestMapping(path = "/m/{guid}", method = RequestMethod.GET)
    @ResponseBody
    @Override
    public DeviceCredentials get(@PathVariable("guid") Long guid) {
        return credentialsFacade.getDeviceCredentials(guid);
    }

    @RequestMapping(path = "/m/{guid}", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public DeviceCredentials update(@PathVariable("guid") Long guid, @RequestBody DeviceCredentials deviceCredentials) {
        return credentialsFacade.updateDeviceCredentials(guid, deviceCredentials);
    }

    @RequestMapping(path = "/m/{guid}", method = RequestMethod.DELETE)
    @Override
    public void remove(@PathVariable("guid") Long guid) {
        credentialsFacade.removeDeviceCredentials(guid);
    }
}
