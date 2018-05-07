package com.rrkh.dms.data.model;

public class DeviceStateDto implements DeviceState {

    private DeviceState.Status status;

    public DeviceStateDto(DeviceState.Status status) {
        this.status = status;
    }

    public DeviceStateDto() {
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public DeviceState.Status getStatus() {
        return status;
    }
}
