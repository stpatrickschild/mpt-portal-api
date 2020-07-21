package com.mpt.controller;

import com.mpt.model.Procedure;
import com.mpt.service.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/procedure")
public class ProcedureController {

    @Autowired
    private ProcedureService procedureService;

    @GetMapping
    public ResponseEntity<List<Procedure>>getAllProcedureService(){
        return new ResponseEntity<>(this.procedureService.getAllProcedure(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public Procedure createProcedure(@RequestBody Procedure procedure){
        return this.procedureService.createProcedure(procedure);
    }
}
