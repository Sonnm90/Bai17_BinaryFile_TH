package rikkei.view;

import rikkei.config.Config;

public class NavBar {
    public NavBar(){
        System.out.println("************CATEGORY MANAGE***********");
        System.out.println("1. Show List Category.");
        System.out.println("2. Creat  Category.");
        System.out.println("3. Update  Category.");
        System.out.println("4. Delete  Category.");


        int chooseMenu= Config.scanner().nextInt();
        switch (chooseMenu){
            case 1:
                new CategoryView().showListCategory();
                break;
            case 2:
                new CategoryView().formCreateCategory();
                break;
            case 3:
                new CategoryView().updateCategory();
                break;
            case 4:
                new CategoryView().deleteCategory();
                break;
        }
    }

    public static void main(String[] args) {
        new NavBar();
    }
}
