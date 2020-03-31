package com.restaurant;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "restaurant_order_service_restaurants")
@Access(AccessType.FIELD)
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    @ElementCollection
    @CollectionTable(name = "restaurant_order_service_restaurant_menu_items")
    private List<MenuItem> menuItems;

    public Restaurant() {
    }

    public Restaurant(long id, List<MenuItem> menuItems) {
        this.id = id;
        this.menuItems = menuItems;
    }

    public Long getId() {
        return id;
    }

}
