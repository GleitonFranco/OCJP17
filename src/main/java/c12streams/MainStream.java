package c12streams;


import br.com.meta.modelo.Pedido;
import br.com.meta.modelo.Produto;
import c02oo.Product;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class MainStream {

    public static void mani(String[] args) {
//        String s = "some text";
//        IntStream charCodes1 = s.chars();
//        IntStream charCodes2 = s.codePoints();
//        Stream<String> symbols = charCodes2.mapToObj(c -> String.valueOf((char) c));
//        Random random = new Random();
//        DoubleStream randomNumbers = random.doubles(10);
//        Predicate<String> p;
//        List<Product> productList = new ArrayList<>();
//        productList.stream()
//                .filter(pp -> pp.getPrice().equals(BigDecimal.TEN))
//                .peek(Product::applyDisccount)
//                .map(pp -> pp.getPrice())
//                .forEach(pr -> pr.add(BigDecimal.ONE));



    }

    public static void exemplo06(List<Product> lista) {
        Function<Product, String> nameMapper = p -> p.getName();
        UnaryOperator<String> triMapper = String::trim;
        ToIntFunction<String> lengthMapper = String::length;
        lista.stream()
                .map(nameMapper)
                ;
    }

    public static void exemplo07(List<Pedido> pedidos) {
        pedidos.stream()
                .flatMap(p -> p.itens.stream())
                .map(i -> i.produto)
                .forEach(System.out::println);
    }
}
