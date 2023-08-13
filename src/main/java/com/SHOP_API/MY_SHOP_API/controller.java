package com.SHOP_API.MY_SHOP_API;
import com.SHOP_API.MY_SHOP_API.SERVICE.DataAccess;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.shop_app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public ResponseEntity<List<shop_app>> getAllStudent(){

        try{
            return new ResponseEntity<>(da.getAllStudent(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
        }
    }

//    @GetMapping("/id/{id}")
//    public shop_app getById(@PathVariable String id){
//
//        return da.getById(Integer.parseInt(id));
//    }
    @GetMapping("/type/{type}")
    public ResponseEntity<List<shop_app>> getByType(@PathVariable String type)
    {
        try{
            return new ResponseEntity<>(da.getByType(type), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
        }
    }


    @PostMapping("/add")
    public ResponseEntity<String> AddShopDetail(@RequestBody shop_app s){
        try{
            return new ResponseEntity<>(da.addShopData(s),HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity<>("failed",HttpStatus.BAD_REQUEST);
        }
    }

}
