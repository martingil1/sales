package services;

import daos.SaleBoxDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleBoxServiceImpl implements SaleBoxService{

    @Autowired
    SaleBoxDao saleBoxDao;

}
