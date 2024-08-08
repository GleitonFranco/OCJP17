package c09_17;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        Map<String, Integer> cidadesImutavel = Map.of("Ibiapina", 25000, "Tianguá", 80000);
        Map<String, Integer> cidadesImutavel2 = Map.ofEntries(
                Map.entry("Ibiapina", 25_000),
                Map.entry("Ubajaara", 30_000),
                Map.entry("Tianguá", 80_000),
                Map.entry("Viçosa", 65_000)
        );
//        var entry = Map.entry("Varjota", null); // NÃO! NPE! param @NotNull!
        Map<String,Integer> cidadesCopy = new HashMap<>(cidadesImutavel2);
        cidadesCopy.put("Guaraciaba", 35_000);
        cidadesCopy.put("Varjota", null);
        Map<String,Integer> cidadesCopy2 = Map.copyOf(cidadesImutavel2);
//        cidadesCopy2.put("Guaraciaba", 35000); // RTE! UOE!
        boolean sp = cidadesImutavel2.containsKey("São Paulo"); // false
        boolean grande = cidadesImutavel2.containsValue(500_000); // false
        boolean isVazio = mapa.isEmpty(); // true
        cidadesCopy.putIfAbsent("Canindé", 150_000); // added
        cidadesCopy.putIfAbsent("Varjota", 50_000); // added, valor estava null
        cidadesCopy.putIfAbsent("Ibiapina", 50_000); // Não alterada, já existe e valor

        Integer populacaoFora = cidadesCopy.remove("Viçosa"); // 65_000
        Integer populacaoFora2 = cidadesCopy.remove("São Paulo"); // null

        Integer populacaoAnterior = cidadesCopy.replace("Guaraciaba", 40_000); // 35_000

        cidadesCopy.forEach((k,v)-> System.out.println(k + " = " + v));
        System.out.println(cidadesCopy.size());
        System.out.println();
        sortedMap(cidadesCopy);


        var m = Map.of("paracetamol",20,"amoxicilina",20,"lacto-purga",20);
        var estoque = new TreeMap<>(m);
        estoque.put("dipirona",null);
        System.out.println(estoque);
        estoque.merge("sonrisal",15, Integer::sum); // Sem cadastro. Cadastra e lança.
        estoque.merge("dipirona",15, Integer::sum); // Estoque nulo. Lança.
        estoque.merge("paracetamol",15, Integer::sum); // Já tem estoque. Soma.
        System.out.println(estoque);
    }

    static void sortedMap(Map<?, ?> mapa) {
        Map<?, ?> sortedMap = new TreeMap<>(mapa);
        sortedMap.forEach((k,v)-> System.out.println(k + " = " + v));
    }

}
