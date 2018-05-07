package com.rrkh.dms.rest.controller;

import com.rrkh.dms.data.facade.DeviceCredentialsFacade;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.rest.model.DeviceCredentialsDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class DeviceManagementApiServiceTest {

    @Mock
    private Logger logger;

    @Mock
    private DeviceCredentialsFacade credentialsFacade;

    @Spy
    @InjectMocks
    private DeviceManagementApiService managementApiService;

    @Test
    public void testAdd() {

        Long expectedGuid = 1L;
        DeviceCredentials expectedCredentials = new DeviceCredentialsDto();
        ((DeviceCredentialsDto) expectedCredentials).setToken("the real token is should not be here");
        ((DeviceCredentialsDto) expectedCredentials).setUri("why not uri");

        Mockito.when(credentialsFacade.addDeviceCredentials(expectedCredentials)).thenAnswer((Answer<DeviceCredentials>) invocation -> {
            DeviceCredentials deviceCredentials = invocation.getArgumentAt(0, DeviceCredentials.class);
            ((DeviceCredentialsDto) deviceCredentials).setGuid(expectedGuid);
            return deviceCredentials;
        });

        DeviceCredentials actualCredentials = managementApiService.add(expectedCredentials);
        assertEquals(actualCredentials.getToken(), expectedCredentials.getToken());
        assertEquals(actualCredentials.getUri(), expectedCredentials.getUri());
        assertNotNull(actualCredentials.getGuid());

    }

    @Test
    public void testUpdate() {

    }

    @Test
    public void testGet() {

    }

    @Test
    public void testRemove() {

    }

}
