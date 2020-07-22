package com.mpt.service;

import com.mpt.model.Provider;
import com.mpt.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

//    @Autowired
//    private ProcedureCostRepository procedureCostRepository;



//    @Autowired
//    private RestTemplate restTemplate;

    public Provider getProvider(int id) {
//        this.restTemplate.getForEntity("", Provider.class);
        return this.providerRepository.findById(id).orElse(null);
    }



    public Provider createProvider(Provider provider) {
        return this.providerRepository.save(provider);
    }

    public List<Provider> getAllProviders() {
        return this.providerRepository.findAll();
    }

    public void deleteProvider(int id) {
        this.providerRepository.deleteById(id);
    }

    public Provider updateProvider(Provider provider) {
        return this.providerRepository.save(provider);
    }

    public Optional<Provider> findById(int id) { return this.providerRepository.findById(id); }





}