package com.rrkh.dms.rest;

import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceState;

public interface DeviceCommandApi {

    DeviceState runCommand(Long guid, DeviceCommand command);

    DeviceState pollState(Long guid);
}
