package com.example.smartmenu.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartmenu.models.Cart;
import com.example.smartmenu.models.CartItem;


@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Long>{
    List<CartItem> findByCart(Cart cart);
}
