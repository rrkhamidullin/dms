package com.rrkh.dms.service;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceState;
import com.rrkh.dms.device.DeviceCommandInterface;
import org.springframework.stereotype.Service;

@Service
public class DeviceCommandInterfaceBean implements DeviceCommandInterface {

    @Override
    public DeviceState runCommand(DeviceCredentials deviceCredentials, DeviceCommand deviceCommand) {
        return new DeviceState(DeviceState.Status.NA);
    }

    @Override
    public DeviceState pollState(DeviceCredentials deviceCredentials) {
        return new DeviceState(DeviceState.Status.NA);
    }
}
