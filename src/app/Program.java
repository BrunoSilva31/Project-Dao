package app;

import entities.Seller;
import model.DaoFactory;
import model.SellerDao;

public class Program {
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(" === TEST1: seller findById === ");


        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
