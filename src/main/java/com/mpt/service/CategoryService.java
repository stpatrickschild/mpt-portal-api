package com.mpt.service;


import com.mpt.model.Category;
import com.mpt.model.Specialty;
import com.mpt.repository.CategoryRepository;
import com.mpt.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProviderRepository providerRepository;


    public List<Category> getAllCategories() {
       return this.categoryRepository.findAll();
    }

    public Category createCategory(Category category) {
        categoryRepository.save(category);
        return category;
    }

    public List<Specialty> getSpecialty(int id) {
        var c = categoryRepository.findById(id).orElse(null);
        return c != null ? c.getSpecialtyList(): null;
    }

    public List<Category> getCategoriesForProvider(int id){
       var p  = providerRepository.findById(id).orElse(null);
       var s = p.getSpecialtyList();
       var c = new ArrayList<Category>();
       for (var specialty: s){
           c.add(specialty.getCategory());
        }

       return   c.stream().sorted((lhs, rhs) -> {
           return lhs.getName().compareTo(rhs.getName());
       }).distinct().collect(Collectors.toList());

    }



}

