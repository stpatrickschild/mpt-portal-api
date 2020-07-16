package com.mpt.service;

import com.mpt.model.Provider;
import com.mpt.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

//    @Autowired
//    private RestTemplate restTemplate;

    public Provider getProvider(long id) {
//        this.restTemplate.getForEntity("", Provider.class);
        return this.providerRepository.findById(id).orElse(null);
    }

    public Provider createProvider(Provider provider) {
        return this.providerRepository.save(provider);
    }

    public List<Provider> getAllProviders() {
        return this.providerRepository.findAll();
    }

    public void deleteProvider(long id) {
        this.providerRepository.deleteById(id);
    }

    public Provider updateProvider(Provider provider) {
        return this.providerRepository.save(provider);
    }
}