package guru.techinsights.microservices.product.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @author Sattya
 * create at 9/18/2024 4:45 PM
 */
@Document(value = "product")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {
    @Id

    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
