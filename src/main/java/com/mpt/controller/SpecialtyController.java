package com.mpt.controller;

import com.mpt.model.Specialty;
import com.mpt.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/specialty")
public class SpecialtyController {

    @Autowired
    private SpecialtyService specialtyService;

    @GetMapping
    public ResponseEntity<List<Specialty>>getAllSpecialtyService(){
        return new ResponseEntity<>(this.specialtyService.getAllSpecialty(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public Specialty createSpecialty(@RequestBody Specialty specialty){
        return this.specialtyService.createSpecialty(specialty);
    }
}
