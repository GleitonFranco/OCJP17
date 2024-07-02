package c07_17;

import java.util.List;

public interface Herbivore {
    int MAX_SIZE = 3;
    void eat();
    private static void run() {};
    private void walk() {
        speed();
        run();
        eat();
    };
    default void speed() {
//        eat();
//        run();
//        walk();
    }

}

interface Carnivore {
    static void drink() {}
    void eat(int meat);
}
class Cao implements Carnivore {
    @Override
    public void eat(int meat) {
        Carnivore.drink();
    }
}

interface Onivore {
    private void eat() {};
    void fish();
}

record Crane(int numEggs, String name) implements Onivore {
    Crane {
        numEggs++;
    }
    Crane(String firstName, String lastName) {
        this(0, firstName + lastName);
    }
    public void fish() {}
}

record Eagle(int eggs, Crane crane) {}

interface Test {
    Crane EAGLE = new Crane("Gleiton", "Franco");
}

class Bear implements Herbivore, Carnivore {
    public void eat() {
        var c = new Crane("Gleiton", "Franco");
        var e = new Eagle(0, c);
        var c1 = new Crane(5, "Crane-01");
//        var c2 = new Crane(); // NÃO!
        Number n = Float.parseFloat("1.1");
    }

    public void eat(int meat) {
        System.out.println("Eating meat="+ (meat + MAX_SIZE));
        Carnivore.drink();
    }

    public static void main(String... a) {
        System.out.println(MAX_SIZE);
        System.out.println(Season.WINTER);
        System.out.println(Season.SUMMER );
        var c = new Crane(10, "Webby");
        System.out.println(c);
        System.out.println(new Crane("Mary", "Jane"));
    }
}

// INSTANCEOF
interface Reptile {}
class Rodent {}
final class Rat {}
class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent r = new Rodent();
//        Capybara c = (Capybara) r; // NÃO!! Runtime Exception (ClassCastException)
        if (r instanceof Capybara cc) {
            System.out.println(cc);
        }
//        Carnivore c2 = (Carnivore) r; // NÃO!! Runtime Exception (ClassCastException)
        if (r instanceof Carnivore) {}
        if (r instanceof Carnivore carnivore) {
            System.out.println(carnivore);
        }
        if (r instanceof Reptile) {} // (not related interface) false
//        if (r instanceof Rat) {} // NÃO! (not related class) compiler error
    }
}


interface I {}

sealed interface C permits D {}

class B {}

final class D implements C {}

class A {
    public static void main(String args[]) {
        B obj = new B();
        System.out.println(obj instanceof I);      //false
//        System.out.println(obj instanceof A);      //Gives compiler error
//        System.out.println(obj instanceof C);      //Gives ANOTHER compiler error
    }
}


interface Animal2 {
    String makeSound(List l);
}

class Dog2 implements Animal2 {
    @Override
    public String makeSound(List l) {  // This would cause an error
        return "Woof";
    }
}

class Movie {
    private int butter = 5;
    private void watch() {}
    private Movie() {}
    class Popcorn {
        private static int butter = 10;
        private Popcorn() {}
        private void watch() {
            System.out.println(butter);
        }
    }
    public static void main(String[] args) {
        var m = new Movie();
        var p = new Movie().new Popcorn();
        p.watch();
        m.watch();
    }
}



interface Z99 {}
interface W99 {}
interface Y99 extends Z99, W99 {}
class B99 {int x =1;}
class C99 extends B99 implements Y99 {}
class D99 extends B99 implements Z99, W99 {}
class F99 implements Z99, W99 {}
class E99 extends C99 {}
class A99 extends B99 implements Y99 {
    public static void main(String[] args) {
        var z = (B99) (Z99) (W99) new F99();
        W99 z1 = (W99) z;
        B99 z3 = (B99) z1;
    }
}