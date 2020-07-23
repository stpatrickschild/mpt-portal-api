package com.mpt.controller;

import com.mpt.model.Category;
import com.mpt.model.Specialty;
import com.mpt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories(){

        return new ResponseEntity<>(this.categoryService.getAllCategories(), HttpStatus.OK);
    }


   @PostMapping("/create")
    public Category createCategory(@RequestBody Category category) {
        return this.categoryService.createCategory(category);
   }


    @GetMapping("/{id}/specialty")
    public ResponseEntity<List<Specialty>> getSpecialty(@PathVariable int id) {
        return new ResponseEntity<>(this.categoryService.getSpecialty(id), HttpStatus.OK);
    }


//    @DeleteMapping
//    @PutMappin
}
