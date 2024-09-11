package app;

import java.util.List;

import entities.Department;
import entities.Seller;
import model.DaoFactory;
import model.SellerDao;

public class Program {
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(" === TEST1: seller findById === ");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println();
        System.out.println(" === TEST2: seller findByDepartment === ");

        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println(" === TEST3: seller findAll === ");

        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }


    }
}
