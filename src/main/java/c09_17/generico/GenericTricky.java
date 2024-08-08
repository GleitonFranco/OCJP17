package c09_17.generico;

import c09_17.Rabbit;

import java.util.ArrayList;
import java.util.List;

public class GenericTricky {
    public static void main(String[] args) {
        TrickyCrate<Rabbit> crate = new TrickyCrate<>();
        String s = crate.tricky("pegadinha");
        String s3 = crate.lessTricky("pegadinha");
        String s33 = crate.<String>lessTricky("pegadinha");
        var r = crate.noTricky(new Rabbit(0,"0", 0));
//        String s2 = crate.noTrick("pegadinha");


        List<String> strs = new ArrayList<>();
//        List<Object> objs = strs; // NÃO
        String str = "Gleiton";
        Object objs2 = str;
    }
}

class TrickyCrate<T> {
    public <T> T tricky(T t) {
        return t;
    }
    public <U> U lessTricky(U t) {
        return t;
    }
    public T noTricky(T t) {
        return t;
    }
}

record Hello<T> (T t) {
    public Hello(T t) {
        this.t = t;
    }
}