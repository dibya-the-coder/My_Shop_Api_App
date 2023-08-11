package com.SHOP_API.MY_SHOP_API.SERVICE;

import com.SHOP_API.MY_SHOP_API.SHOP_DAO.Shop_DAO_Interface;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.shop_app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataAccess {
    @Autowired
    Shop_DAO_Interface sd;

    public List<shop_app> getAllStudent(){

        return sd.findAll();
    }

    public shop_app getById(Integer id) {

        return sd.getById(id);
    }

    public List<shop_app> getByType(String a) {
        return sd.getByType(a);
    }
}
