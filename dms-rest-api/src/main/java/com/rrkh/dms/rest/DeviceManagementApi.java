package com.rrkh.dms.rest;


import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceCredentialsDto;

public interface DeviceManagementApi {

    DeviceCredentials add(DeviceCredentialsDto deviceCredentials);

    DeviceCredentials get(Long guid);

    DeviceCredentials update(Long guid, DeviceCredentialsDto deviceCredentials);

    void remove(Long guid);

}
