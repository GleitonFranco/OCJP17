package c08_17;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class VarDeclarations {
    public static void main(String[] args) {
        Set<?> set = Set.of("a", "b", "c");
    }

    static void remove(List<Character> chars) {
        char end = 'z';
        char nao = 'n';
        //char  start = 'a'; // NÃO! SERÁ REDECLARADA NO CORPO DA LAMBDA
        //char  c = 'c'; // NÃO! SERÁ REDECLARADA NA LINHA SEGUINTE
        Predicate<Character> predicate = c -> {
            //char nao = 'n'; // NÃO!
            //nao = 'm'; // NÃO! TEM QUE SER FINAL OU EFETIVAMENTE FINAL!
            //char  c = 'c'; // NÃO!
            c = 'c'; // ESQUISITO MAS OK
            char  start = 'a';
            char fim = 'h'; //OK
            //fim = 'h';// NÃO! NÃO EXISTE (AINDA)!
            return c > end || c < start;
        };
        char  c = 'c'; // OK
        char  start = 'a'; // OK
        //end = 'w'; // NÃO! TEM QUE SER FINAL OU EFETIVAMENTE FINAL!
        char fim = 'f';
    }
}
