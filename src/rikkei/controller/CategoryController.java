package rikkei.controller;

import rikkei.model.Category;
import rikkei.service.CategoryServiceIMPL;
import rikkei.service.ICategoryService;

import java.util.List;

public class CategoryController {
    ICategoryService categoryService=new CategoryServiceIMPL();
    public List<Category> getListCategory(){
        return  categoryService.findAll();
    }
    public void createCategory(Category category){
        categoryService.save(category);
    }
    public Category detailCategory(int id){
        return categoryService.findById(id);
    }
    public void updateCategory(Category category){
        categoryService.save(category);
    }
    public void deleteCategory(int id){
        categoryService.deleteById(id);
    }
}
