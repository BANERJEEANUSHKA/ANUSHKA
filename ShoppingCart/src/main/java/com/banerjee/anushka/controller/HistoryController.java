package com.banerjee.anushka.controller;

import com.banerjee.anushka.domain.ShoppingCart;
import com.banerjee.anushka.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by banerjee on 4/14/2016.
 */
@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<ShoppingCart> getAll(){
        return shoppingCartService.findByPurchased();
    }


}
