package com.muradov.deadpool.dao;

import com.muradov.deadpool.entity.Spare;
import org.springframework.data.repository.CrudRepository;

public interface WarehouseStoreDao extends CrudRepository<Spare, Integer> {
}
