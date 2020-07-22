package com.mpt.service;


import com.mpt.model.Category;
import com.mpt.model.Specialty;
import com.mpt.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

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
}
