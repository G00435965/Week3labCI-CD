package ie.atu.week3cicd1;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@RequestMapping means that every endpoint within the controller starts with /product now
@RequestMapping("/api/products")
@RestController
public class ProductController
{
    List<Product> myList = new ArrayList<>();

    //So this would be /products/hello
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/count")
    public int countProducts() {
        return myList.size();
    }


    @GetMapping("/getproducts")
    public List<Product> getProducts()
    {
        Product myProduct = new Product("TV", 499);
        return myList;
    }
    //with @PostMapping you can add to the other Mappings
    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct)
    {
        myList.add(myProduct);
        return myProduct;
    }
}
//@Valid checks for errors