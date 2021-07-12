package com.order;

import lombok.*;

import javax.persistence.Embeddable;


@Embeddable
@Getter
@Setter @NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class OrderItem {
    private String id;
    private String name;
    private int price;
    private int quantity;
}