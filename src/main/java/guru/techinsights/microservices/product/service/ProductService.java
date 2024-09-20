package guru.techinsights.microservices.product.service;

import guru.techinsights.microservices.product.dto.ProductRequest;
import guru.techinsights.microservices.product.dto.ProductResponse;

import java.util.List;

/**
 * @author Sattya
 * create at 9/18/2024 5:48 PM
 */
public interface ProductService {
    ProductResponse createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
}
