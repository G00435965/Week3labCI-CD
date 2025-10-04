package ie.atu.week3cicd1;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
//@Data generates all the getters and setters using Lombok
//@AllArgs Constructor saves us from writing 2 constructors and 5 methods by generating
@Data
@AllArgsConstructor
public class Product {
    @NotBlank //Basically you cant submit a blank name for the product
    @Size(min = 1, max = 9, message = "Product must be between 1 and 9 characters")

    private String productName;
    @Positive
    private double price;
}
