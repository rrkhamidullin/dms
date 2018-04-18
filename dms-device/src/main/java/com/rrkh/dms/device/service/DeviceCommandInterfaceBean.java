package com.rrkh.dms.device.service;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceState;
import com.rrkh.dms.data.model.DeviceStateDto;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class DeviceCommandInterfaceBean implements DeviceCommandInterface {

    @Override
    public DeviceState sendCommand(DeviceCredentials deviceCredentials, DeviceCommand deviceCommand) {
        return new DeviceStateDto(DeviceState.Status.NA);
    }

    @Override
    public DeviceState pollState(DeviceCredentials deviceCredentials) {
        return new DeviceStateDto(DeviceState.Status.NA);
    }
}
