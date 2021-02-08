package com.muradov.deadpool.controller;

import com.muradov.deadpool.entity.Spare;
import com.muradov.deadpool.service.SpareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
    public String getSpareById(@PathVariable("spareId") Integer spareId ) {
        Spare s = spareService.getSpareById(spareId).get();
        return s.toString();
        }

    @GetMapping(value = "/admin/spares/allspares")
    public String getAllSpares() {
        return
                spareService.getAllSpares().toString();
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "/welcome";
    }
}

