package com.rrkh.dms.rest;


import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceManagementApi {

    DeviceCredentials add(DeviceCredentials deviceCredentials);

    DeviceCredentials get(String guid);

    DeviceCredentials update(String guid, DeviceCredentials deviceCredentials);

    void remove(String guid);

}
