package com.rrkh.dms.data.model;

public class DeviceCredentialsDto implements DeviceCredentials {

    private String guid;
    private String uri;
    private String token;

    public DeviceCredentialsDto(DeviceCredentials deviceCredentials) {
        this.guid = deviceCredentials.getGuid();
        this.uri = deviceCredentials.getUri();
        this.token = deviceCredentials.getToken();
    }

    @Override
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
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
