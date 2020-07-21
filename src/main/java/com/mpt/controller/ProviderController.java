package com.mpt.controller;

import com.mpt.model.Provider;
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
    public ResponseEntity<List<Provider>>getAllProvidersServices(){
        return new ResponseEntity<>(this.providerService.getAllProviders(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public Provider createProvider(@RequestBody Provider provider) {
        return this.providerService.createProvider(provider);
    }





}