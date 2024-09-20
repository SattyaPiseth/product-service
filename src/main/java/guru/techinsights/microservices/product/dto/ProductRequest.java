package guru.techinsights.microservices.product.dto;



import java.math.BigDecimal;

/**
 * @author Sattya
 * create at 9/18/2024 5:46 PM
 */

public record ProductRequest(
        String name,
        String description,
        BigDecimal price
) {
}
