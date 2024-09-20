package guru.techinsights.microservices.product.mapper;

import guru.techinsights.microservices.product.dto.ProductRequest;
import guru.techinsights.microservices.product.dto.ProductResponse;
import guru.techinsights.microservices.product.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Sattya
 * create at 9/18/2024 5:58 PM
 */
@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product fromProductRequest(ProductRequest productRequest);
    ProductResponse toProductResponse(Product product);

    List<ProductResponse> toDto(List<Product> product);
}
