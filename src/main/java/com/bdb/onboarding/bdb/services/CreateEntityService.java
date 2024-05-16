package com.bdb.onboarding.bdb.services;

import org.springframework.stereotype.Service;

import com.bdb.onboarding.bdb.entites.EntidadeEntity;
import com.bdb.onboarding.bdb.repositores.EntityRepository;

@Service
public class CreateEntityService {
    private final EntityRepository entityRepository;

    public CreateEntityService(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    public EntidadeEntity create(EntidadeEntity entidade) {
        return entityRepository.save(entidade);
    }
}
