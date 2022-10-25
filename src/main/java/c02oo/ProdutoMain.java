package c02oo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProdutoMain {
    public static void main(String[] args) {
        Product x1 = new Food();
        Product x2 = new Drink();
        // Drink x6 = x2; // NÃO!
        Drink x6 = (Drink) x2;

        // x1.getBestBefore();  NÃO!!
        ((Food) x1).getBestBefore();

        order(x1);
        String s = isBalanced("][[{)())))}[)}}}}[{){}()]([][]){{{{{[)}]]{([{)()][({}[){]({{");
//        System.out.println(s);

        String[] aa = {

        };
//        Arrays.stream(aa).forEach(b -> System.out.println(isBalanced(b)));
//        System.out.println(aa[15]);
//        System.out.println(isBalanced(aa[15]));

    }

    public static void order(Product p) {
        if (p instanceof Food) {
            System.out.println("Desconto");
//            ((Food)p).getBestBefore().plusDays(1);
//            p.getPrice().multiply(new BigDecimal(0.9));
        }
    }

    public static String isBalanced(String s) {
        Map<String, String> openMap = new HashMap<>();
        openMap.put("{", "}");
        openMap.put("[", "]");
        openMap.put("(", ")");
        String balanceReturn = "YES";
        final StringBuilder brackets = new StringBuilder(1000);
        for (int i : s.chars().toArray()) {
            final char c = (char) i;
            final String ss = String.valueOf(c);
            if ("{[(".contains(ss)) {
                brackets.append(openMap.get(ss));
            }
            if ("}])".contains(ss)) {
                if (brackets.length() > 0 && brackets.charAt(brackets.length() - 1) == c) {
                    brackets.deleteCharAt(brackets.length() - 1);
                } else {
                    balanceReturn = "NO";
                    break;
                }
            }
        }
        return balanceReturn;
    }

}
