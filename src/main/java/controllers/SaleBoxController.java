package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.SaleBoxService;

@RestController
@RequestMapping(value = "/caja")
public class SaleBoxController {

    @Autowired
    SaleBoxService saleBoxService;

    //Solamente para mostrar el cierre de caja
}
