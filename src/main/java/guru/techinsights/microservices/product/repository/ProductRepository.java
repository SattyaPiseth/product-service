package guru.techinsights.microservices.product.repository;

import guru.techinsights.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sattya
 * create at 9/18/2024 5:44 PM
 */
@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
    boolean existsByNameIgnoreCase(String name);

    Product findByName(String name);

}
