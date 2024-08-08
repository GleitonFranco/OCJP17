package c09_17;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        // Constructor
        Set<String> vogais = Set.of("a", "o", "u");
        Set<String> vogalCopy = Set.copyOf(vogais);
        Set<String> vogalCopy2 = Set.copyOf(new ArrayList<>());
//        vogalCopy.add("z"); // NÃO! RTE UOE
//        vogalCopy.remove("z");

        Set<Rabbit> rabbitSet = new HashSet<>();
        Set<Rabbit> rabbitSet2 = Set.of(
                new Rabbit(1, "Branco", 5),
                new Rabbit(2, "Saltador", 4.5),
                new Rabbit(3, "Corredor", 3)
        );

        // TREE SETs
        Set<Duck> duckTree = new TreeSet<>();
        duckTree.add(new Duck(1, "Patolino", 5));
        duckTree.add(new Duck(2, "MacDonalds", 4.5));

        Set<Rabbit> rabbitTree = new TreeSet<>();
        //rabbitTree.add(new Rabbit(1, "Branco", 5)); // NÃO! RTE! CCE!

        Set<Rabbit> rabbitTree2 = new TreeSet<>((r1,r2) -> r1.id() -r2.id()); // suprindo o Comparator (método compare())
        rabbitTree2.add(new Rabbit(1, "Pernalonga", 5)); // true se não duplicado
        rabbitTree2.add(new Rabbit(3, "Quincas", 5));
        rabbitTree2.add(new Rabbit(2, "Branco", 4.5));
        System.out.println(rabbitTree2);

        Set<Rabbit> rabbitTree4 = new TreeSet<>(Comparator.comparing(Rabbit::name).reversed()); // suprindo Comparator (método compare())
        Set<Rabbit> rabbitTree3 = new TreeSet<>(Comparator.comparingInt(Rabbit::id)); // suprindo Comparator (método compare())
    }
}
