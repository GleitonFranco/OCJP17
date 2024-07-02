package c1interface;

import c02oo.Food;
import c02oo.Product;

import java.util.Arrays;

public class MainDrinks {
    public static void main(String[] args) {
        Drink drink = new Drink(1);
        System.out.println(drink.measure());
        drink.prepare();
        System.out.println("===============================");

        Z z = new Z();
        z.toString(); // tudo estende Object
        if (z instanceof Y) {
            Y y = (Y)z;
            y.a();
            //y.b();   NÃO! b() é só de Z
        }

        new Some<Z>() {

        };

        Product[] ps = new Product[3];
        Product produtos[] = new Product[3];
        int[] primes;
        primes = new int[] {1,2,3};
        ps = new Product[] {new Drink(1), new Food()};
        int[][] matrix = new int[2][3];
        matrix[0][1] = 5;
        matrix[1][2] = 7;
        matrix = new int[][]{{4, 1}, {2,0,5}};
        //matrix = {{4, 1}, {2,0,5}}; // NÃO!
        int[][] matrix2 = {{4, 1}, {2,0,5}};
        int[] primesEmpty = new int[3];
        boolean[] booEmpty = new boolean[3];
        System.out.println(primesEmpty[2]);// 0
        System.out.println(produtos[2]);// null
        System.out.println(booEmpty[2]);// false

        char[] a1 = {'a','c','m','e'};
        char[] a2 = {'t','o', ' ', ' ', ' '};
        System.arraycopy(a1,2,a2,3,2);
        System.out.println(a2.length);
        System.out.println(a2);
        String[] aaa = new String[5];
        Arrays.fill(aaa, 2, 4, "aaa");
        System.out.println(aaa);// [null, null, "aaa", "aaa", null]
        String[] names1 = {"Mary", "Ann", "Jane", "Tom"};
        String[] names2= {"Mary", "Ann", "John", "Tom"};
        boolean isSame = Arrays.equals(names1, names2);// mesmo conteúdo e mesma posição
        System.out.println(isSame);//false
        Arrays.sort(names1);
        System.out.println(names1);
//        Arrays.sort(produtos, (p1, p2) -> p1.getId() - p2.getId());
        int[] values = {1,2,3};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {

        }
        int sum = 0;
        for (int i =0; i < values.length; sum += ++i);
        System.out.println(sum);
        System.out.println(System.getProperty("java.vm.vendor"));
    }
}


interface Consumable {
    static int measure() {
        return 12;
    }

    void consume(int quantity);

    default void prepare() {
        System.out.println("Método prepare consumable");
    }
}

interface Liquid extends Consumable {
    int measure();
    default void prepare() {
        Consumable.super.prepare();
        System.out.println("Método prepare Liquid");
    }
}

class Drink extends Product implements Consumable, Liquid {

    public Drink(int id) {
        super(id);
    }

    @Override
    public int measure() {
        return 0;
    }

//    @Override
//    public void prepare() {
//        Liquid.super.prepare();
//    }

    @Override
    public void consume(int quantity) {

    }
}


interface Y {
    void a();
}
class Z implements Y {
    public void a() {

    }
    public void b() {

    }
}

//class Some <T extends Y> {
class Some <T> {

}
