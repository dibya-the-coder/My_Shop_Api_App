package com.SHOP_API.MY_SHOP_API.SERVICE;

import com.SHOP_API.MY_SHOP_API.SHOP_DAO.Item;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.ItemServiceDao;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.Shop_DAO_Interface;
import com.SHOP_API.MY_SHOP_API.SHOP_DAO.shop_app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemData {
    @Autowired
    ItemServiceDao isd;

    @Autowired
    Shop_DAO_Interface sd;

    public String addItem(String type, int numItem) {

        List<shop_app> sa = sd.findRandomQustionByType(type, numItem);
        Item item = new Item();
        item.setItems(sa);
        isd.save(item);
        return "SUCCESS";

    }
}
