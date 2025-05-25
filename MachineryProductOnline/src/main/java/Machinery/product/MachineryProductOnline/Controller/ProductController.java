package Machinery.product.MachineryProductOnline.Controller;

import Machinery.product.MachineryProductOnline.Model.Products;
import Machinery.product.MachineryProductOnline.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired

        ProductService service;
        @RequestMapping("/Products")
        public List<Products> getProducts(){

        return service.getProducts();
    }
    @RequestMapping("/Products/{PrdID}")
    public Products getProductByID(@PathVariable int PrdID)
    {
        return service.getProductsByID(PrdID);
    }
    @PostMapping("/Products")
    // To add the product in the database
    public void addProduct(@RequestBody Products prod)
    {
        service.addProduct(prod);

    }
    @PutMapping("/Products")
    public void UpdateProduct(@RequestBody Products prod)
    {
        service.UpdateProduct(prod);

    }
    @DeleteMapping("/Products/{PrdID}")
    public void deleteProduct(@PathVariable int PrdID)
    {
        service.deleteProduct(prdID);
    }
}
