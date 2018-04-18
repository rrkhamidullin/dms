package com.rrkh.dms.data.model;

public class DeviceStateDto implements DeviceState {

    private Status status;

    public DeviceStateDto(Status status) {
        this.status = status;
    }

    @Override
    public Status getStatus() {
        return status;
    }
}
