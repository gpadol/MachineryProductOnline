package Machinery.product.MachineryProductOnline.Service;

import Machinery.product.MachineryProductOnline.Model.Products;
import Machinery.product.MachineryProductOnline.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Products> product = new ArrayList<>(Arrays.asList(
//            new Products(101, "First", "First Des"),
//            new Products(102, "Second", "Second Des"),
//            new Products(103, "Third", "Third Des"),
//            new Products(104, "Four", "Four Des")));

    public List<Products> getProducts() {

        return repo.findAll();
    }

    public Products getProductsByID(int ProdId) {
        return repo.findById(ProdId).orElse(new Products());
    }

    public void addProduct(Products prod) {
        repo.save(prod);
    }

    public void UpdateProduct(Products prod) {

        repo.save(prod);
    }

    public void deleteProduct(int PrdID)
    {
        repo.deleteById(PrdID);
    }
}
