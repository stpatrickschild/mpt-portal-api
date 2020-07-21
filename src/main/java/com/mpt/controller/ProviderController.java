package com.mpt.controller;

import com.mpt.model.Provider;
import com.mpt.repository.ProviderRepository;
import com.mpt.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping
    public ResponseEntity<List<Provider>>getAllProviders(){
        return new ResponseEntity<>(this.providerService.getAllProviders(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public Provider createProvider(@RequestBody Provider provider) {
        return this.providerService.createProvider(provider);
    }

//    // testing might need to remove this
//    @Autowired
//    private ProviderRepository providerRepository;
//
//    @GetMapping
//    public List<Provider> getAllProviders(){
//        return this.providerRepository.findAll();
//    }

    //Populate all tables with data using a Sql script
    //TODO, Get all Categories, Procedures


//    // testing might need to remove this
//    @GetMapping("/{id}")
//    public Provider getProvider(@PathVariable int id){
//        System.out.println("requested Id is " + id);
//        return this.providerRepository.findById(id).orElse(null);
//    }

//    //testing might need to remove this
//    @GetMapping("/{provider_id}/categories")
//    public String getCategoriesForProvider(@PathVariable int provider_id){
//        System.out.println("provider Id is " + provider_id);
//
//
//       Provider p =  getProvider(provider_id);
//       return null;

    }

//    @GetMapping("/{provider_id}/procedure/{procedure_id}")
//    public String getProcedure(@PathVariable int provider_id, @PathVariable int procedure_id) {
//        System.out.println("provider Id is " + provider_id);
//        System.out.println("procedure_id Id is " + procedure_id);
//
//        return null;
//    }

//    @GetMapping("/{provider_id}/procedure/{procedure_id}")
//    public String getProcedure(@PathVariable int provider_id, @PathVariable int procedure_id){
//        System.out.println("provider Id is " + provider_id);
//        System.out.println("procedure_id Id is " + procedure_id);
//
//        Procedure procedure = this.providerRepository.getProcedureCost(provider_id, procedure_id);
//        return String.valueOf(procedureCost.getCost());
//    }


//    @PostMapping("/create")
//    public Provider createProvider(@RequestBody Provider provider){
//        return this.providerRepository.createProvider(provider);
//    }
//
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteProvider(@PathVariable long id){
//        System.out.println("requested Id is " + id);
//        this.providerRepository.deleteProvider(id);
//    }
//
//    @PutMapping("/update")
//    public Provider updateProvider(@RequestBody Provider provider){
//        return this.providerRepository.updateProvider(provider);
//    }

}