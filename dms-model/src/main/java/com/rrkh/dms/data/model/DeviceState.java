package com.rrkh.dms.data.model;

public class DeviceState {

    public enum Status {
        NA,
        IDLE,
        BUSY
    }

    private Status status;

    public DeviceState(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
