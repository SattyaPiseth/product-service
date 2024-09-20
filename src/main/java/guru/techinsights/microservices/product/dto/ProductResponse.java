package guru.techinsights.microservices.product.dto;

import java.math.BigDecimal;

/**
 * @author Sattya
 * create at 9/18/2024 6:03 PM
 */
public record ProductResponse(
        String id,
        String name,
        String description,
        BigDecimal price
) {
}
