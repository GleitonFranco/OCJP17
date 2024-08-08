package c09_17.generico;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoundedWildCards {
    public static void main(String[] args) {
//        List<Number> numbers = new ArrayList<Integer>(); // NÃO!
        List<? extends Number> numbers2 = new ArrayList<Integer>();

        List<String> strings = new ArrayList<>();
        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);

        List<? super String> strings2 = new ArrayList<Object>();
//        strings2.add(new Object());

        List<? super IOException> exceptions = new ArrayList<>();
//        exceptions.add(new Exception());
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }

    // LOWER-BOUNDED WILDCARDS
    public static void addSound(List<? super String> objects) {
        objects.add("quack!");
//        objects.add(new Object());
    }

    // NOT FOR List<String> (exact match)
//    public static void addSound2(List<Object> objects) {
//        objects.add("quack!");
//    }

    public static long contar(List<? extends Number> numbers) {
        numbers.add(null); // OK
//        numbers.add(Integer.valueOf(1)); // NÃO!!
        return numbers.stream().map(Number::longValue).reduce(0L, Long::sum);
    }

    public static void anyFlyer(List<Flyer> fliers) {
        fliers.add(null);
        fliers.add(new Goose());
    }

    // UPPER-BOUNDED (IMMUTABLE ADD obj)
    public static void groupOfFlyers(List<? extends Flyer> fliers) {
        fliers.add(null);
//        fliers.add(new Goose()); // NÃO!!
    }

    // UNBOUNDED (IMMUTABLE ADD obj)
    public static void groupOfPraticallyAnything(List<?> fliers) {
        fliers.add(null);
//        fliers.add(new Goose()); // NÃO!!
    }

}

interface Flyer { void fly(); }
class Goose implements Flyer {
    @Override
    public void fly() {}
}
class HangGlider implements Flyer {
    @Override
    public void fly() {}
}