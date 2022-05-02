package com.banerjee.anushka.repository;

import com.banerjee.anushka.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by banerjee on 4/8/2016.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
