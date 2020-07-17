package com.mpt.service;

import com.mpt.model.ProcedureCost;
import com.mpt.model.Provider;
import com.mpt.repository.ProcedureCostRepository;
import com.mpt.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private ProcedureCostRepository procedureCostRepository;

    //TODO
    //Create a new repository for Procedure

    //TODO
    //Create a new repository for Category

//    @Autowired
//    private RestTemplate restTemplate;

    public Provider getProvider(int id) {
//        this.restTemplate.getForEntity("", Provider.class);
        return this.providerRepository.findById(id).orElse(null);
    }

    public ProcedureCost getProcedureCost(int provider_id, int procedure_id, String network_name ) {
        var allProcedureCosts = this.procedureCostRepository.findAll();
        var selectedProcedureCost  = allProcedureCosts.stream().filter(procedureCost -> procedureCost.getProcedure_id() == procedure_id
                && procedureCost.getProvider_id() == provider_id
                && procedureCost.getNetwork() == network_name).findFirst();
        return selectedProcedureCost.orElse(null);
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
}