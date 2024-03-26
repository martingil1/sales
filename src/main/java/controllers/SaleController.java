package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.SaleService;

@RestController
@RequestMapping(value = "/venta")
public class SaleController {

    @Autowired
    SaleService saleService;

}
