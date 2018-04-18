package com.rrkh.dms.device.service;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceState;

public interface DeviceCommandInterface {

    DeviceState sendCommand(DeviceCredentials deviceCredentials, DeviceCommand deviceCommand);

    DeviceState pollState(DeviceCredentials deviceCredentials);
}
