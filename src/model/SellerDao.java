package model;

import java.util.List;

import entities.Department;
import entities.Seller;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller ob);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
