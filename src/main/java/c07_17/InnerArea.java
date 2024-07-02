package c07_17;

public class InnerArea {
    private int length = 5;
    private int side = 10;

    private class Product {
        private int width = 9;
        private int side = 20;
        void multiply() {
            System.out.println(length * width);
            System.out.println(InnerArea.this.side * Product.this.side);
        }
    }

    public static void main(String[] args) {
        new InnerArea().new Product().multiply();
    }

}

class InnerAreaStatic {
    private static int length = 5;

    static class Product {
        private static int width = 5;
        static void multiply() {
            System.out.println(length * width);
        }
    }

    public static void main(String[] args) {
        Product.multiply();
    }
}

class Outro {
    public static void main(String[] args) {
        var product = new InnerAreaStatic.Product(); // se fosse private ia dar ruim
    }
}