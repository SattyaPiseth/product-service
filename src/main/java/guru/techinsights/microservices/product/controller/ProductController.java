package guru.techinsights.microservices.product.controller;

import guru.techinsights.microservices.product.dto.ProductRequest;
import guru.techinsights.microservices.product.dto.ProductResponse;
import guru.techinsights.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sattya
 * create at 9/18/2024 5:45 PM
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/product")
public class ProductController {
    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
      return productService.createProduct(productRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<ProductResponse> getAllProducts(){
      return productService.getAllProducts();
    }
}
