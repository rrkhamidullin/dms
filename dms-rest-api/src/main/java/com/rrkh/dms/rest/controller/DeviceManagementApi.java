package com.rrkh.dms.rest.controller;


import com.rrkh.dms.data.model.DeviceCredentials;

public interface DeviceManagementApi {

    DeviceCredentials add(DeviceCredentials deviceCredentials);

    DeviceCredentials get(Long guid);

    DeviceCredentials update(Long guid, DeviceCredentials deviceCredentials);

    void remove(Long guid);

}
