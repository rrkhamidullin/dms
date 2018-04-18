package com.rrkh.dms.rest;


import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceCredentialsDto;

public interface DeviceManagementApi {

    DeviceCredentials add(DeviceCredentialsDto deviceCredentials);

    DeviceCredentials get(String guid);

    DeviceCredentials update(String guid, DeviceCredentialsDto deviceCredentials);

    void remove(String guid);

}
