package com.rrkh.dms.core.service;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceState;

public interface DeviceCommandService {

    DeviceState runCommand(Long guid, DeviceCommand command);

    DeviceState pollState(Long guid);
}
