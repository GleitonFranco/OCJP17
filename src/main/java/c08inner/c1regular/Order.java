package c08inner.c1regular;

import c02oo.Product;

import java.util.Set;

public class Order {
    private Set<Item> items;
    private int quantity;

    class Item {
        private Product product;
    }
}
