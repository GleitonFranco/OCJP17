package c09_17;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Listas {
    public static void main(String[] args) {
        String[] nomes = {"A", "B", "C", "D", "E", "F", "G", "H"};
        List<String> as = Arrays.asList(nomes); // size fixed
        List<String> of = List.of(nomes); // immutable list
        List<String> copy = List.copyOf(as); // immutable list
        List<String> news = new ArrayList<>(as); //
        news.add("Z");
        //as.add("Z"); // RTE! UnsupportedOperationException
        as.set(0, "W");
        System.out.println(as);
        System.out.println(of);
        System.out.println(copy);
        System.out.println(Arrays.toString(nomes));
        //of.set(0, "Z"); // RTE! UnsupportedOperationException
        //copy.set(0, "Z"); // RTE! UnsupportedOperationException

        // CAMINHO INVERSO
        String[] inverso = news.toArray(new String[0]);
        String[] inverso2 = news.toArray(new String[news.size()]);
        String[] inverso3 = news.toArray(new String[1]);

        // herdados de Collection
        news.add("Y");// true
        news.remove("B");//true
        news.remove("X");//false
        //news.clear();

        // List
        news.add(1, "B#");
        news.remove(3);// remove e devolve D
        news.replaceAll(s -> s.concat("s"));

        // Ordenação
        Collections.sort(as);
        //Collections.sort(of); // NÃO! RTE! UOE!
        Collections.sort(news);

    }

    static void fazAlgoComCollection(Collection c) {
        c.add(null); // true
        c.remove(new Object()); // true se houver
        c.size();
        c.toArray();
        c.contains(null);
        c.removeIf(o -> true);
        c.clear();
        c.isEmpty();
        Iterator i = c.iterator();
        while (i.hasNext()) {i.next();i.remove();}
    }
}
