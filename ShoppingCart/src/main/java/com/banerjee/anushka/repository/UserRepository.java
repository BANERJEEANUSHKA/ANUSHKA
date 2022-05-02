package com.banerjee.anushka.repository;

import com.banerjee.anushka.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by banerjee on 4/8/2016.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
