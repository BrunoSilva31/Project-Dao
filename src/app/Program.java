package app;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import entities.Seller;
import model.DaoFactory;
import model.SellerDao;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
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

        System.out.println();
        System.out.println(" === TEST4: seller insert === ");

        Seller newSeller = new Seller(null, "Bruno", "brunoemail@.com", new Date(), 2000.00, department);

        sellerDao.insert(newSeller);
        System.out.println("Inserted! New ID = " + newSeller.getId());

        System.out.println();
        System.out.println(" === TEST5: seller update === ");

        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);

        System.out.println("Update completed");


        System.out.println();
        System.out.println(" === TEST6: seller delete === ");

        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();

        sellerDao.deleteById(id);
        System.out.print("Delete completed");

        sc.close();
    }
}
