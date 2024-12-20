package com.example.order_service.repository;

import com.example.order_service.module.OrderItemModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderItemRepo extends JpaRepository<OrderItemModel, Integer> {
    @Query("SELECT o FROM OrderItemModel o WHERE o.order.id = :orderID")
    List<OrderItemModel> orderDetail(@Param("orderID") int orderID);
}
