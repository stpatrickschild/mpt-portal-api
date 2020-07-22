package com.mpt.service;

import com.mpt.model.Specialty;
import com.mpt.repository.ProviderRepository;
import com.mpt.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Autowired
    private ProviderRepository providerRepository;

    public List<Specialty> getAllSpecialty() {
        return this.specialtyRepository.findAll();
    }

    public Specialty createSpecialty(Specialty specialty) {
        specialtyRepository.save(specialty);
        return specialty;
    }

    public List<Specialty> getSpecialtiesForProviderAndCategory(int provider_id, int category_id) {

        var p = providerRepository.findById(provider_id).orElse(null);
        var s = p.getSpecialtyList();


        return   s.stream().filter((specialty -> category_id == specialty.getCategory().getId())).sorted((lhs, rhs) -> {
            return lhs.getName().compareTo(rhs.getName());
        }).collect(Collectors.toList());

    }
//    public void deleteProcedure(int id) {this.procedureRepository.deleteById(id);}

//
//    public Procedure updateProcedure(Procedure procedure) { return  this.procedureRepository.save(procedure);}
}
