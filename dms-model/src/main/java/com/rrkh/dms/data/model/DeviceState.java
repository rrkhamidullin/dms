package com.rrkh.dms.data.model;

public interface DeviceState {

    enum Status {
        NA,
        IDLE,
        BUSY
    }

    Status getStatus();
}
