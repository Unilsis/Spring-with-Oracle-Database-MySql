package com.bdb.onboarding.bdb.repositores;

import org.springframework.data.repository.CrudRepository;

import com.bdb.onboarding.bdb.entites.EntidadeEntity;

public interface EntityRepository extends CrudRepository<EntidadeEntity, Integer> {

}
