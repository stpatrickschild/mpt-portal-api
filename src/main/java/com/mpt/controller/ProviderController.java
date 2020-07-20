package com.mpt.controller;

import com.mpt.model.Category;
import com.mpt.model.Procedure;
import com.mpt.model.ProcedureCost;
import com.mpt.model.Provider;
import com.mpt.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3004")
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

    @GetMapping("/{id}/categories")
    public List<Category> getCategories(@PathVariable int id){
        System.out.println("requested Id is " + id);
        return this.providerService.getCategoriesSupportedByProvider(id);
    }

    @GetMapping("/{id}/category/{category_id}/procedures")
    public List<Procedure> getProcedures(@PathVariable int id, @PathVariable int category_id){
        return this.providerService.getCategoriesSupportedByProvider(id, category_id);
    }

    //Create a similar method like ^, that takes a provider_id and a category id and returns a list of Procedures

    @GetMapping("/{provider_id}/category/{category_id}/procedure/{procedure_id}")
    public Procedure getProcedureCost(@PathVariable int provider_id, @PathVariable int category_id, @PathVariable int procedure_id){
        System.out.println("provider Id is " + provider_id);
        System.out.println("category_id Id is " + category_id);
        System.out.println("procedure_id Id is " + procedure_id);
        Procedure procedure = this.providerService.getProcedureCost(provider_id, category_id, procedure_id);
        return procedure;
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