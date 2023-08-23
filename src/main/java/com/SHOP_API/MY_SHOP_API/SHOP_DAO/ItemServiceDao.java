package com.SHOP_API.MY_SHOP_API.SHOP_DAO;

import com.SHOP_API.MY_SHOP_API.MODEL.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemServiceDao extends JpaRepository<Item,Integer>
{
}
