package com.rrkh.dms.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeviceCredentialsEntity implements DeviceCredentials {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long guid;
    private String uri;
    private String token;

    public DeviceCredentialsEntity() {
    }

    public DeviceCredentialsEntity(DeviceCredentials deviceCredentials) {
        this.uri = deviceCredentials.getUri();
        this.token = deviceCredentials.getToken();
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
