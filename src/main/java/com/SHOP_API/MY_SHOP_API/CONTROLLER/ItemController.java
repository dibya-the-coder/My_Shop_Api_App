package com.SHOP_API.MY_SHOP_API.CONTROLLER;

import com.SHOP_API.MY_SHOP_API.MODEL.ItemSuggationTable;
import com.SHOP_API.MY_SHOP_API.SERVICE.ItemData;
import com.SHOP_API.MY_SHOP_API.MODEL.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Seller")
public class ItemController {
    @Autowired
    ItemData id;
    @Autowired
    ItemData ID;

    @PostMapping("/add")
    public ResponseEntity<String> createItem(@RequestParam String type, @RequestParam Integer numItem){
        try{
            return new ResponseEntity<>(id.addItem(type, numItem),HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>("FAILED",HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/getSuggation/{id}")
    public ResponseEntity<Optional<Item>> ItemSuggation(@PathVariable String id){
        return new ResponseEntity<>(ID.getSuggation(Integer.parseInt(id)),HttpStatus.OK);
    }

    @GetMapping("/lol")
    public List<ItemSuggationTable> gg(){
        return ID.gg();
    }

}
