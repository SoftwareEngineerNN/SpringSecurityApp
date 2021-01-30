package com.muradov.deadpool.controller;

import com.muradov.deadpool.entity.Spare;
import com.muradov.deadpool.service.SpareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class WarehouseController {

    @Autowired
    private SpareService spareService;

    @GetMapping(value = "/spares/spareId/{spareId}")
    public Optional<Spare> getSpareById(@PathVariable("spareId") Integer spareId ) {
        return spareService.getSpareById(spareId);
    }

    @GetMapping(value = "/admin/spares/allspares")
    public Iterable<Spare> getAllSpares() {
        return spareService.getAllSpares();
    }
}

