package rikkei.view;

import rikkei.config.Config;
import rikkei.controller.CategoryController;
import rikkei.model.Category;

import java.util.List;

public class CategoryView {
    CategoryController categoryController=new CategoryController();
    List<Category> categoryList=categoryController.getListCategory();
    public void showListCategory(){

            System.out.println(categoryList);
            System.out.println("Enter  Back to back Menu");
            String backMenu = Config.scanner().nextLine();
            if (backMenu.equalsIgnoreCase("back")) {
                new NavBar();


        }

    }
    public void formCreateCategory(){
        while (true) {
            int id = 0;
            if (categoryList.size() == 0) {
                id = 1;
            } else {
                id = categoryList.get(categoryList.size()-1).getId() + 1;
            }
            System.out.println("Enter name of Category:");
            String name = Config.scanner().nextLine();
            Category category = new Category(id, name);
            categoryController.createCategory(category);
            System.err.println("Creat Success!");
            System.out.println();
            System.out.println("Enter any key to continue or Back to back Menu");
            String backMenu = Config.scanner().nextLine();
            if (backMenu.equalsIgnoreCase("back")) {
                new NavBar();
                break;
            }
        }
    }
    public void updateCategory(){
        while (true){
            System.out.println("Enter Id to update");
            int id = Config.scanner().nextInt();
            if (categoryController.detailCategory(id)==null){
                System.out.println("Id not found!");
            }else {
                System.out.println("Enter name of Category");
                String name = Config.scanner().nextLine();
                Category category= new Category(id,name);
                categoryController.updateCategory(category);
                System.out.println("Enter any key to continue or Back to back Menu");
                String backMenu = Config.scanner().nextLine();
                if (backMenu.equalsIgnoreCase("back")) {
                    new NavBar();
                    break;
                }
            }
        }
    }

    public void deleteCategory(){
        while (true){
            System.out.println("Enter Id to delete");
            int id =Config.scanner().nextInt();
            if (categoryController.detailCategory(id)==null){
                System.out.println("Id not found!");
            } else {
                categoryController.deleteCategory(id);
            }
        }
    }
}
