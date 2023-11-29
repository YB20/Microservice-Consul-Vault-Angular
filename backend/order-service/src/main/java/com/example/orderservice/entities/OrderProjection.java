package com.example.orderservice.entities;

import com.example.orderservice.entities.Order;
import com.example.orderservice.enums.OrderStatus;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="fullOrder",types = Order.class)
public interface OrderProjection {
    Long getId();
    Date getCreateAt();
    Long getCustomerId();
    OrderStatus getStatuse();
}
