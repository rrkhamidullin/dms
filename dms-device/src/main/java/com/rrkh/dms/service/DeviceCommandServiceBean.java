package com.rrkh.dms.service;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceState;
import com.rrkh.dms.device.DeviceCommandInterface;

public class DeviceCommandServiceBean implements DeviceCommandInterface {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public DeviceState runCommand(DeviceCredentials deviceCredentials, DeviceCommand deviceCommand) {
        return null;
    }

    @Override
    public DeviceState pollState(DeviceCredentials deviceCredentials) {
        return null;
    }
}
