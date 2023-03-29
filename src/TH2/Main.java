package TH2;

import rikkei.config.Config;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Trịnh Đức Toàn", "Hà Nội"));
        students.add(new Student(2, "Lê Việt Dũng", "Phú Thọ"));
        students.add(new Student(3, "Phùng Trung Dũng", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Đồng Chính", "Hải Dương"));

        Config<Student> listStudents = new Config<Student>();
       String path ="src/TH2/student.csv";
        listStudents.writeToFile(path,students);
        System.out.println("Success!");
        System.out.println(listStudents.readFromFile("src/TH2/student.csv"));
    }



}
