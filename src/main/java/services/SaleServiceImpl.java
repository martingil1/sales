package services;

import daos.SaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService{

    @Autowired
    SaleDao saleDao;

}
