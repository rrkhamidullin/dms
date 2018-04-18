package com.rrkh.dms.device;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceState;

public interface DeviceCommandInterface {

    DeviceState runCommand(DeviceCredentials deviceCredentials, DeviceCommand deviceCommand);

    DeviceState pollState(DeviceCredentials deviceCredentials);
}
