package com.SHOP_API.MY_SHOP_API.MODEL;

import com.SHOP_API.MY_SHOP_API.MODEL.shop_app;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToMany
    private List<shop_app> items;

}
