package com.rrkh.dms.data.service;

import com.rrkh.dms.data.exception.NotFoundException;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.data.model.DeviceCredentialsEntity;
import com.rrkh.dms.data.repository.DeviceCredentialsRepository;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeviceCredentialsDataServiceBean implements DeviceCredentialsDataService {

    private final Logger logger;
    private final DeviceCredentialsRepository credentialsRepository;

    @Autowired
    public DeviceCredentialsDataServiceBean(Logger logger, DeviceCredentialsRepository credentialsRepository) {
        this.logger = logger;
        this.credentialsRepository = credentialsRepository;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public DeviceCredentials getByGuid(Long guid) {
        Optional<DeviceCredentialsEntity> optional = credentialsRepository.findById(guid);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            logger.warn("Unknown GUID:{} is received for getByGuid", guid);
            throw new NotFoundException(String.format("No entity with GUID: %s found.", guid));
        }
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public DeviceCredentials create(DeviceCredentials deviceCredentials) {
        if (Objects.nonNull(deviceCredentials.getGuid())) {
            logger.warn("Device credentials with GUID: {} is received for creation.");
        }
        DeviceCredentialsEntity credentialsEntity = new DeviceCredentialsEntity(deviceCredentials);
        return credentialsRepository.save(credentialsEntity);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public DeviceCredentials update(Long guid, DeviceCredentials deviceCredentials) {
        if (!credentialsRepository.existsById(guid)) {
            logger.warn("Nonexistent entity with GUID: {} is received for update", guid);
            throw new NotFoundException(String.format("No entity with guid:%s found.", guid));
        }
        DeviceCredentialsEntity credentialsEntity = new DeviceCredentialsEntity(deviceCredentials);
        credentialsEntity.setGuid(guid);
        return credentialsRepository.save(credentialsEntity);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public void remove(Long guid) {
        credentialsRepository.deleteById(guid);
    }
}
