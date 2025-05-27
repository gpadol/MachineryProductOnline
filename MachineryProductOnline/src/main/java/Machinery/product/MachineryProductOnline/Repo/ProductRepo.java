package Machinery.product.MachineryProductOnline.Repo;

import Machinery.product.MachineryProductOnline.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {
}
