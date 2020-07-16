package com.mpt.controller;

import com.mpt.model.Provider;
import com.mpt.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/providers")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/{id}")
    public Provider getPatient(@PathVariable long id){
        System.out.println("requested Id is " + id);
        return this.providerService.getProvider(id);
    }

//    @PostMapping("/create")
//    public Provider createProvider(@RequestBody Provider provider){
//        return this.providerService.createProvider(provider);
//    }
//
    @GetMapping
    public List<Provider> getAllProviders(){
        return this.providerService.getAllProviders();
    }
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