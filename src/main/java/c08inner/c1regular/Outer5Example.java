package c08inner.c1regular;

public class Outer5Example {
    public static void creatShippingMode(String description) {
        new ShippingMode(description);
    }

    private static class ShippingMode {
        private String description;
        private ShippingMode(String description) {
            this.description = description;
        }
    }

    public static void main(String... args) {
        Outer5Example.creatShippingMode("Fast");
        Outer5Example.creatShippingMode("Normal");
        Outer5Example o1 = new Outer5Example();
        Outer5Example o2 = new Outer5Example();
        Order o = new Order();
        Order.Item i = o.new Item();
        new Order().new Item();
    }
}
