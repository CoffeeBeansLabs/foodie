package com.restaurant;

import javax.persistence.ElementCollection;
import java.util.List;

public class Menu {
    @ElementCollection
    private List<MenuItem> menuItems;

    public Menu() {}

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

}
