package c06;

public abstract class Canine {
    public abstract String getSound();
    public void bark() {
        System.out.println(getSound());
    }
}

class Fox extends Canine {
    public String getSound() {
        return "Sneak!";
    }

    public static void main(String... args) {
        Canine f = new Fox();
        f.bark();
    }
}

abstract class BigCanine extends Canine {
    public void eat() {}
}

class Wolf extends BigCanine {
    public String getSound() {
        return "Sneak!";
    }
}
