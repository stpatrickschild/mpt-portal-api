package com.mpt.service;

import com.mpt.model.Category;
import com.mpt.model.Procedure;
import com.mpt.model.Provider;
//import com.mpt.repository.ProcedureCostRepository;
import com.mpt.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;
    private ArrayList<Provider> fakeProviders = new ArrayList<>();
    private ArrayList<Procedure> fakeProcedures = new ArrayList<>();
    private ArrayList<Category> fakeCategories = new ArrayList<>();

    public ProviderService(){
        var aetna = new Provider("Aetna", "123 Main Ave S", "Seattle", "WA", "98116");
        aetna.setId(1);
        var bluecross = new Provider("BlueCross", "1 Jackson Ave S", "Bellevue", "WA", "98006");
        bluecross.setId(2);
        fakeProviders.add(aetna);
        fakeProviders.add(bluecross);

        var internal_medicine = new Category("Internal Medicine", "All things related to internal medicines");
        internal_medicine.setId(1);
        var dermatology = new Category("Dermatology", "All things related to dermatology");
        dermatology.setId(2);
        fakeCategories.add(internal_medicine);
        fakeCategories.add(dermatology);

        var cardiovascular_diseases = new Procedure("Cardiovascular Diseases", internal_medicine, aetna, 30,85, 485);
        cardiovascular_diseases.setId(1);
        var critical_care_medicine = new Procedure("Critical care medicine", internal_medicine, bluecross, 45,75, 2200);
        critical_care_medicine.setId(2);
        var dermatopathology = new Procedure("Dermatopathology", dermatology, bluecross, 50,75, 567);
        dermatopathology.setId(3);
        var procedural_dermatology = new Procedure("Procedural dermatology", dermatology, bluecross, 85,113, 2200);
        procedural_dermatology.setId(3);

        fakeProcedures.add(cardiovascular_diseases);
        fakeProcedures.add(critical_care_medicine);
        fakeProcedures.add(dermatopathology);
        fakeProcedures.add(procedural_dermatology);
    }

//    @Autowired
//    private ProcedureCostRepository procedureCostRepository;

    //TODO
    //Create a new repository for Procedure

    //TODO
    //Create a new repository for Category

//    @Autowired
//    private RestTemplate restTemplate;

    public Provider getProvider(int id) {
        var selectedProviders = this.fakeProviders.stream().filter(provider -> provider.getId() == id).toArray();
        if(selectedProviders.length > 0)
            return (Provider) selectedProviders[0];
        else return null;
        //return this.providerRepository.findById(id).orElse(null);
    }

    public Procedure getProcedureCost(int provider_id, int category_id, int procedure_id ) {
        var selectedProcedures  = fakeProcedures.stream().filter(procedure -> procedure.getProvider().getId() == provider_id
                        && procedure.getCategory().getId() == category_id
                && procedure.getId() == procedure_id)
                .toArray();

        if(selectedProcedures.length > 0)
            return (Procedure) selectedProcedures[0];
        else
            return null;
    }

    public Provider createProvider(Provider provider) {
        return this.providerRepository.save(provider);
    }

    public List<Provider> getAllProviders() {
        return fakeProviders;
        //return this.providerRepository.findAll();
    }

    public void deleteProvider(int id) {
        this.providerRepository.deleteById(id);
    }

    public Provider updateProvider(Provider provider) {
        return this.providerRepository.save(provider);
    }

    public List<Category> getCategoriesSupportedByProvider(int provider_id) {
        var selectedCategories  = fakeProcedures.stream().filter(procedure -> procedure.getProvider().getId() == provider_id).map(x-> x.getCategory()).distinct()
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
        if(selectedCategories.toArray().length > 0){
            return  selectedCategories;
        }
        return null;
    }

    public List<Procedure> getCategoriesSupportedByProvider(int provider_id, int category_id) {
        var selectedProcedures  = fakeProcedures.stream().filter(procedure -> procedure.getProvider().getId() == provider_id
        && procedure.getCategory().getId() == category_id).collect(Collectors.toCollection(() -> new ArrayList<Procedure>()));

        return selectedProcedures;
    }
}