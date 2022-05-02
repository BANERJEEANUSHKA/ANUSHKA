package com.banerjee.anushka.repository;

import com.banerjee.anushka.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by banerjee on 4/9/2016.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    List<ShoppingCart> findByStatus(String status);
}
