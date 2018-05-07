package com.rrkh.dms.rest.controller;

import com.rrkh.dms.core.service.DeviceCommandService;
import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceState;
import com.rrkh.dms.data.model.DeviceStateDto;
import com.rrkh.dms.rest.model.DeviceCommandDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DeviceCommandApiServiceTest {

    @Mock
    private Logger logger;

    @Mock
    private DeviceCommandService commandService;

    @Spy
    @InjectMocks
    private DeviceCommandApiService commandApiService;

    @Test
    public void testRunCommand() {

        Long expectedGuid = 1L;
        DeviceCommand expectedDeviceCommand = new DeviceCommandDto();
        DeviceState expectedDeviceState = new DeviceStateDto();
        ((DeviceStateDto) expectedDeviceState).setStatus(DeviceState.Status.IDLE);

        Mockito.when(commandService.runCommand(expectedGuid, expectedDeviceCommand)).thenReturn(expectedDeviceState);

        DeviceState actualState = commandApiService.runCommand(expectedGuid, expectedDeviceCommand);
        assertEquals(actualState, expectedDeviceState);

        Mockito.verify(commandService).runCommand(expectedGuid, expectedDeviceCommand);
    }

    @Test
    public void testPollState() {
        Long expectedGuid = 1L;
        DeviceState expectedDeviceState = new DeviceStateDto();
        ((DeviceStateDto) expectedDeviceState).setStatus(DeviceState.Status.IDLE);

        Mockito.when(commandService.pollState(expectedGuid)).thenReturn(expectedDeviceState);

        DeviceState actualState = commandApiService.pollState(expectedGuid);
        assertEquals(actualState, expectedDeviceState);

        Mockito.verify(commandService).pollState(expectedGuid);
    }
}
