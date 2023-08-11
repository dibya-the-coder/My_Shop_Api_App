package com.SHOP_API.MY_SHOP_API.SHOP_DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Shop_DAO_Interface extends JpaRepository<shop_app,Integer> {
    @Override
    shop_app getById(Integer id);

    List<shop_app> getByType(String a);
}
