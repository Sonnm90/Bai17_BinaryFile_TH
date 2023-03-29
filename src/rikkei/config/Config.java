package rikkei.config;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Config<T> {
    public static final String PATH_CATEGORY ="src/rikkei/database/category.csv";
    public static Scanner scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public List<T> readFromFile(String pathFile){
        List<T> tList =new ArrayList<>();
        try{
            FileInputStream fileInputStream=new FileInputStream(pathFile);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            tList= (List<T>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException f){
            System.err.println("File Not Found!");
        } catch (IOException i){
            System.err.println("IOE Exception!");
        } catch (ClassNotFoundException c){
            System.err.println("Class Not Found!");
        }
        return tList;
    }

    public void writeToFile(String pathFile,List<T>tList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tList);
            fileOutputStream.close();
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException f){
            System.err.println("File Not Found!");
        } catch (IOException i){
            System.err.println("IOE Exception!");
        }
    }
}
