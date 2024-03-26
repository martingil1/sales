package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.SellerService;

@RestController
@RequestMapping(value = "/vendedor")
public class SellerController {

    @Autowired
    SellerService sellerService;

}
