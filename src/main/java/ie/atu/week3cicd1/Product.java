package ie.atu.week3cicd1;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
//@Data generates all the getters and setters using Lombok
//@AllArgs Constructor saves us from writing 2 constructors and 5 methods by generating
@Data
@AllArgsConstructor
public class Product {
    @NotBlank //

    private String productName;
    @Positive
    private double price;
}
