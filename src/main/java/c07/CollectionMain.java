package c07;

import c02oo.Drink;
import c02oo.Food;
import c02oo.Product;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionMain {
    public static void main(String[] args) {
        Product p1 = new Food();
        Product p2 = new Drink();
        Product p3 = new Food();

        List<Product> lista1 = new ArrayList<>();
        lista1.add(p1);
        lista1.add(p2);
        Product removed = lista1.remove(0);
        boolean isRemoved = lista1.remove(p3);
        List<Product> lista2 = Arrays.asList(p1, p2);// tamanho fixo
//        lista2.add(p3); // NÃO!
        lista2.set(0, p3);
//        lista2.remove(0); // NÃO!
        List<Product> lista3 = List.of(p1,p2);// tamanho fixo e imutável
        List<Product> lista3_1 = List.of(new Product[] {p1,p2});
//        lista3.add(p3); // NÃO!
//        lista3.set(0, p3); // NÃO!
//        lista3.remove(0); // NÃO!
        List<Product> lista4 = new ArrayList<>(20);//default=10

        String x1 = "teste x";
        String x2 = new String("teste x");
        Set<String> set1 = new HashSet<>();
        set1.add(x1);
        set1.add(x2);
        set1.remove(x2);
        set1.remove("oi");
        set1.add(null);

        Deque<Product> deque1 = new ArrayDeque<>();
        Deque<Product> deque2 = new ArrayDeque<>();
        Product nulo = deque1.pollFirst();
        deque1.offerFirst(p1);
        deque1.offerFirst(p2);
//        deque1.offerLast(null); // NPE
//        deque1.addLast(null); // NPE
        deque1.peekFirst();
        deque1.peekFirst();
        deque1.peekFirst();
        deque1.peekFirst();
        deque1.peekFirst();
        deque1.peekFirst();
        deque1.pollFirst();// recupera e remove da lista
//        Map<String, Product> mapa1 = Map.of("1", p1, "2", p2, "3", p3, "4", p1, "5", p2, "6", p3
//        , "8", p1, "9", p2, "10", p3, "11", p1, "12", p2, "13", p3); // NÃO! Limite 10!
        Map<String, Product> mapa1 = Map.of("1", p1, "2", p2, "3", p3);
        System.out.println(mapa1.get("1"));
        //mapa1.put("4", p1);// NÃO! UOE!
        //mapa1.put("1", p1);// NÃO! UOE!
        Map<String, Product> mapa2 = new HashMap<>(mapa1);
        mapa2.put("4", p1);

        Map<Product, Integer> estoque = new HashMap<>();
        estoque.put(p1, Integer.valueOf(2));
        boolean temAcabando = estoque.containsValue(1);//false
        // Collection extends Iterator
        testIterators();
        return;
    }

    public static void testIterators() {
        Product p1 = new Food();
        Product p2 = new Drink();
        Product p3 = new Food();
        Map<String, Product> mapa1 = new HashMap<>();
        Set<String> keys = mapa1.keySet();
//        List<Product> v = (ArrayList<Product>)mapa1.values(); //CCE
        List<Product> lista1 = new ArrayList<>();
//        Product[] ps = (Product[])lista1.toArray();
        Product[] array = new Product[2];
//        array = lista1.toArray(); // não dá!
        var l = lista1.stream().toArray(Product[]::new);
        lista1.removeIf(p -> p.getName().length() > 3);
        lista1.add(p1);
        lista1.add(p2);
        Iterator<Product> iterator = lista1.iterator();
        Iterator<Product> iterator2 = lista1.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        System.out.println();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
//        System.out.println(iterator.next()); // Não! NSEE



    }
}
