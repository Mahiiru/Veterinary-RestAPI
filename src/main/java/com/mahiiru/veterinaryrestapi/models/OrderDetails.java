package com.mahiiru.veterinaryrestapi.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderDetails {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_order_id")
    private UserOrder userOrder;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private LocalDateTime date;
    private Integer quantity;
    private Double price;
    private Double total;

}
