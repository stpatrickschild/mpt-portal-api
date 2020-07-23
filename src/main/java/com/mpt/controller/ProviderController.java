package com.mpt.controller;

import com.mpt.model.Category;
import com.mpt.model.Provider;
import com.mpt.model.Specialty;
import com.mpt.service.CategoryService;
import com.mpt.service.ProviderService;
import com.mpt.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SpecialtyService specialtyService;

    @GetMapping
    public ResponseEntity<List<Provider>>getAllProvidersServices(){
        return new ResponseEntity<>(this.providerService.getAllProviders(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public Provider createProvider(@RequestBody Provider provider) {
        return this.providerService.createProvider(provider);
    }
    @GetMapping("/{id}")
    public Provider getProvider(@PathVariable int id){
        System.out.println("requested Id is " + id);
        return this.providerService.findById(id).orElse(null);
    }

    @GetMapping("/{id}/categories")
    public List<Category>getCategoriesForProvider(@PathVariable int id){
        return this.categoryService.getCategoriesForProvider(id);
    }

    @GetMapping("/{id}/categories/{category_id}/specialties")
    public List<Specialty>getSpecialtiesForProviderAndCategory(@PathVariable int id, @PathVariable int category_id){
        return this.specialtyService.getSpecialtiesForProviderAndCategory(id, category_id);
    }


}