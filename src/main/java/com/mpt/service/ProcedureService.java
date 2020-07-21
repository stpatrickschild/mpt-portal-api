package com.mpt.service;

import com.mpt.model.Procedure;
import com.mpt.repository.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcedureService {

    @Autowired
    private ProcedureRepository procedureRepository;

    public List<Procedure> getAllProcedure() {
        return this.procedureRepository.findAll();
    }

    public Procedure createProcedure(Procedure procedure) {
        procedureRepository.save(procedure);
        return procedure;
    }

//    public void deleteProcedure(int id) {this.procedureRepository.deleteById(id);}
//
//    public Procedure updateProcedure(Procedure procedure) { return  this.procedureRepository.save(procedure);}
}
