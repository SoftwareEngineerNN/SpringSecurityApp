package com.muradov.deadpool.service;


import com.muradov.deadpool.dao.WarehouseStoreDao;
import com.muradov.deadpool.entity.Spare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpareService {

    @Autowired
    private WarehouseStoreDao warehouseStoreDAO;

    public Optional<Spare> getSpareById(Integer spareId) {
        return warehouseStoreDAO.findById(spareId);
    }
    public Iterable<Spare> getAllSpares()
    {
        return warehouseStoreDAO.findAll();
    }

}

