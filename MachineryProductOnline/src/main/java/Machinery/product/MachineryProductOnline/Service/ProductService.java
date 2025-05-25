package Machinery.product.MachineryProductOnline.Service;

import Machinery.product.MachineryProductOnline.Model.Products;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class ProductService {

    List<Products> product = new ArrayList<>(Arrays.asList(
            new Products(101, "First","First Des"),
            new Products(102, "Second","Second Des"),
            new Products(103, "Third","Third Des"),
            new Products(104, "Four","Four Des")));

    public List<Products> getProducts() {
        return product;
    }
    public Products getProductsByID(int ProdId){
             return product.stream()
                     .filter(p -> p.getProdID()==ProdId)
                     .findFirst().get();
    }

    public void addProduct(Products prod) {
        product.add(prod);
    }

    public void UpdateProduct(Products prod) {

        int index = 0;
        for(int i= 0; i < product.size();i++)
            if(product.get(i).getProdID() == prod.getProdID())
                index = i;
        product.set(index,prod);



    }
}
