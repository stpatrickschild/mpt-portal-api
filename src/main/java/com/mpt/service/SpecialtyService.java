package com.mpt.service;

import com.mpt.model.Specialty;
import com.mpt.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    public List<Specialty> getAllSpecialty() {
        return this.specialtyRepository.findAll();
    }

    public Specialty createSpecialty(Specialty specialty) {
        specialtyRepository.save(specialty);
        return specialty;
    }
//    public void deleteProcedure(int id) {this.procedureRepository.deleteById(id);}

//
//    public Procedure updateProcedure(Procedure procedure) { return  this.procedureRepository.save(procedure);}
}
