package guru.techinsights.microservices.product.service.impl;

import guru.techinsights.microservices.product.dto.ProductRequest;
import guru.techinsights.microservices.product.dto.ProductResponse;
import guru.techinsights.microservices.product.mapper.ProductMapper;
import guru.techinsights.microservices.product.model.Product;
import guru.techinsights.microservices.product.repository.ProductRepository;
import guru.techinsights.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * @author Sattya
 * create at 9/18/2024 5:49 PM
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public ProductResponse createProduct(ProductRequest productRequest) {
        // if product title already exists
        if (productRepository.existsByNameIgnoreCase(productRequest.name())){
            // log error and return
            log.error("Product with id {} already exists", productRequest.name());
            throw new ResponseStatusException(HttpStatus.CONFLICT, String.format("Product with name %s already exists", productRequest.name()));
        }
        productRepository.save(productMapper.fromProductRequest(productRequest));
        log.info("Product created successfully with id {}", productRequest.name());
        return productMapper.toProductResponse(productRepository.findByName(productRequest.name()));
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        List<Product> response = productRepository.findAll();
        return productMapper.toDto(response);
    }
}
