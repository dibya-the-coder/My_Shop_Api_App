package com.SHOP_API.MY_SHOP_API.SERVICE;

import com.SHOP_API.MY_SHOP_API.MODEL.Item;
import com.SHOP_API.MY_SHOP_API.MODEL.ItemSuggationTable;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.ItemServiceDao;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.ItemSuggarionDAO;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.Shop_DAO_Interface;
import com.SHOP_API.MY_SHOP_API.MODEL.shop_app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemData {
    @Autowired
    ItemServiceDao isd;

    @Autowired
    Shop_DAO_Interface sd;

    @Autowired
    ItemSuggarionDAO ISD;


//    public String SaveData(Item item){
//        return "Success";
//    }

    public String addItem(String type, Integer numItem) {

        List<shop_app> sa = sd.findRandomItemsByType(type, numItem);
        Item item = new Item();
        item.setItems(sa);
        isd.save(item);
        return "SUCCESS";

    }

    public Optional<Item> getSuggation(Integer id)
    {
        return isd.findById(id);
    }
    public List<ItemSuggationTable> gg(){
        return ISD.findAll();
    }
}
