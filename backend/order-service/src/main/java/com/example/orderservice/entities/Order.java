package com.example.orderservice.entities;

import com.example.orderservice.enums.OrderStatus;
import com.example.orderservice.model.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createAt;
    private OrderStatus statuse;
    private Long customerId;
    @Transient
    private Customer customer;
    @OneToMany(mappedBy = "order")
    private List<ProductItem> productItems;

    public double getTotal(){
        double s = 0;
        for (ProductItem productItem:productItems) {
            s+=productItem.getAmount();
        }
        return s;
    }

}
