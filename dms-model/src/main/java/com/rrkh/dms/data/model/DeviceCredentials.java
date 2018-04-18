package com.rrkh.dms.data.model;

/**
 * Device info needed for communication
 */
public interface DeviceCredentials {

    //TODO should be String or something composite here?

    /**
     * Unique device identification
     *
     * @return device GUID
     */
    Long getGuid();

    //TODO Some address or resource where to get device itself
    /**
     *
     * @return ...
     */
    String getUri();

    //TODO Some token for authorization
    /**
     *
     * @return
     */
    String getToken();
}
