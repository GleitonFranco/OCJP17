package c09_17.generico;

import java.util.ArrayList;
import java.util.List;

public class GenericAnimal {
}

class LongTailAnimal {
    protected void chew(List<Object> input) {

    }

//    protected void chew(List<Double> input) {
//     NÃO! Overloading inválido por causa do Type Easure
//    }

}

class AntEater extends LongTailAnimal {
//    protected void chew(List<Double> input) {} // NÃO!

    protected void chew(ArrayList<Double> input) {} // overloading legal
//    protected void chew(ArrayList<Object> input) {} // Override legal, mas vai entrar em conflito com o anterior no type erase
}