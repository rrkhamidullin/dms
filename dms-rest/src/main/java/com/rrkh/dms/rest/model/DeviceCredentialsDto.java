package com.rrkh.dms.rest.model;

import com.rrkh.dms.data.model.DeviceCredentials;

public class DeviceCredentialsDto implements DeviceCredentials {

    private Long guid;
    private String uri;
    private String token;

    public DeviceCredentialsDto(DeviceCredentials deviceCredentials) {
        this.guid = deviceCredentials.getGuid();
        this.uri = deviceCredentials.getUri();
        this.token = deviceCredentials.getToken();
    }

    public DeviceCredentialsDto() {
    }

    @Override
    public Long getGuid() {
        return guid;
    }

    public void setGuid(Long guid) {
        this.guid = guid;
    }

    @Override
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
