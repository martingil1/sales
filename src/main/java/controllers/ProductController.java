package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ProductService;

@RestController
@RequestMapping(value = "/producto")
public class ProductController {

    @Autowired
    ProductService productService;

}
