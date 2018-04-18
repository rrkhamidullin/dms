package com.rrkh.dms.data.service;

import com.rrkh.dms.data.exception.NotFoundException;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceCredentialsEntity;
import com.rrkh.dms.data.repository.DeviceCredentialsRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeviceCredentialsDataServiceBean implements DeviceCredentialsDataService {

    private final DeviceCredentialsRepository credentialsRepository;

    @Autowired
    public DeviceCredentialsDataServiceBean(DeviceCredentialsRepository credentialsRepository) {
        this.credentialsRepository = credentialsRepository;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public DeviceCredentials getByGuid(String guid) {
        Optional<DeviceCredentialsEntity> optional = credentialsRepository.findById(guid);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NotFoundException(String.format("Entity with guid: %s is not present in data layer.", guid));
        }
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public DeviceCredentials save(DeviceCredentials deviceCredentials) {
        return credentialsRepository.save(new DeviceCredentialsEntity(deviceCredentials));
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public void remove(String guid) {
        credentialsRepository.deleteById(guid);
    }
}
