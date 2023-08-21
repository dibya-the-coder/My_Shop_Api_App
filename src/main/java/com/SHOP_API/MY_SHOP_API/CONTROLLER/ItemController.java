package com.SHOP_API.MY_SHOP_API.CONTROLLER;

import com.SHOP_API.MY_SHOP_API.SERVICE.ItemData;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.shop_app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Seller")
public class ItemController {
    @Autowired
    ItemData id;

    @PostMapping("/add")
    public ResponseEntity<String> createItem(@RequestParam String type, @RequestParam int numItem){
        try{
            return new ResponseEntity<>(id.addItem(type, numItem),HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>("FAILED",HttpStatus.BAD_REQUEST);
        }
    }

}
