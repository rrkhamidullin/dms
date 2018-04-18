package com.rrkh.dms.data.repository;

import com.rrkh.dms.data.model.DeviceCredentialsEntity;
import org.springframework.data.repository.CrudRepository;

public interface DeviceCredentialsSqlRepository extends DeviceCredentialsRepository, CrudRepository<DeviceCredentialsEntity, String> {

    @Override
    DeviceCredentialsEntity getByGuid(String guid);

}
