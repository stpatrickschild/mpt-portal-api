package com.mpt.controller;

import com.mpt.model.ProcedureCost;
import com.mpt.model.Provider;
import com.mpt.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping
    public List<Provider> getAllProviders(){
        return this.providerService.getAllProviders();
    }

    //Populate all tables with data using a Sql script
    //TODO, Get all Categories, Procedures


    @GetMapping("/{id}")
    public Provider getProvider(@PathVariable int id){
        System.out.println("requested Id is " + id);
        return this.providerService.getProvider(id);
    }

    @GetMapping("/{provider_id}/{procedure_id}/{network_Name}")
    public String getProcedureCost(@PathVariable int provider_id, @PathVariable int procedure_id, @PathVariable String network_Name){
        System.out.println("provider Id is " + provider_id);
        System.out.println("procedure_id Id is " + procedure_id);
        System.out.println("network_Name is " + network_Name);
        ProcedureCost procedureCost = this.providerService.getProcedureCost(provider_id, procedure_id, network_Name);
        return String.valueOf(procedureCost.getCost());
    }

//    @PostMapping("/create")
//    public Provider createProvider(@RequestBody Provider provider){
//        return this.providerService.createProvider(provider);
//    }
//
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteProvider(@PathVariable long id){
//        System.out.println("requested Id is " + id);
//        this.providerService.deleteProvider(id);
//    }
//
//    @PutMapping("/update")
//    public Provider updateProvider(@RequestBody Provider provider){
//        return this.providerService.updateProvider(provider);
//    }

}