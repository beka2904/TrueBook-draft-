package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.entity.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
