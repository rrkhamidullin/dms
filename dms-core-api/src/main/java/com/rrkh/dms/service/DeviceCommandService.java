package com.rrkh.dms.service;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceState;

public interface DeviceCommandService {

    DeviceState runCommand(String guid, DeviceCommand command);
}
