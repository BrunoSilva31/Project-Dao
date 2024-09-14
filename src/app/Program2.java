package app;

import java.util.List;
import java.util.Scanner;

import entities.Department;
import model.DaoFactory;
import model.DepartmentDao;

public class Program2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println();
        System.out.println(" === TEST1: department findById === ");

        Department dep = departmentDao.findById(2);

        System.out.println(dep);


        System.out.println();
        System.out.println(" === TEST2: department findAll === ");

        List<Department> list = departmentDao.findAll();

        for (Department department : list) {
            System.out.println(department);
        }


        System.out.println();
        System.out.println(" === TEST3: department insert === ");

        Department dep2 = new Department(null, "BrunoPamento");

        departmentDao.insert(dep2);
        System.out.println("Inserted! New ID = " + dep2.getId());



        sc.close();
    }
}
