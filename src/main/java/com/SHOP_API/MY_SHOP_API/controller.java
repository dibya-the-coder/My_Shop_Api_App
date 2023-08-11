package com.SHOP_API.MY_SHOP_API;

import com.SHOP_API.MY_SHOP_API.SERVICE.DataAccess;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.shop_app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/Data")
@RestController
public class controller {
    @Autowired
    DataAccess da;

    @GetMapping("/home")
    public String home(){
        return "home page";

    }
    @GetMapping("/allData")
    public List<shop_app> getAllStudent(){

        return da.getAllStudent();
    }
    @GetMapping("/id/{id}")
    public shop_app getById(@PathVariable String id){

        return da.getById(Integer.parseInt(id));
    }
    @GetMapping("/type/{type}")
    public List<shop_app> getByType(@PathVariable String type)
    {
        return da.getByType(type);
    }

}
