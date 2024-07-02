package c07_17;

class W {
    static void metSta() {
        System.out.println("Met sta do W!");
    }
    static void metSta2() {
        System.out.println("Estático 2 do W!");
    }
    void metCon() {
        System.out.println("Insta do W!");
    }
}

class Z extends W {
    static void metSta() {
        System.out.println("Met sta do Z!");
    }
    void metCon() {
        System.out.println("Insta do Z!");
        metSta2();
//        this.metSta2(); // OK
//        super.metSta2(); // OK
    }
}

public class TesteHeranca {
    public static void main(String[] args) {
    }
}

class Lion {
    class Cub {}
    static class Den {
        static int i = 100;
        static Cub cc = new Lion().new Cub();
    }
    static void rest() {
//        var c1 = new Cub(); // NÃO!
        Cub c2 = new Lion().new Cub();
        Lion.Cub c3 = new Lion().new Cub();
        Lion.Den d1 = new Lion.Den();
        Lion.Den d2 = new Den();
        Den d3 = new Den();
        int i1 = Den.i;
        int i2 = Lion.Den.i;
    }
}

class Aa {
    public void metodo(long l) {
    }
}
class Ba extends Aa{
    protected void metodo(int i) {
    }
    public void metodo() {
    }
}


class B7 {
    private String s;
    protected B7() {}
    static A7 B7(String s) {
        return new A7(s);
    }
}
class A7 extends B7 {
    A7(String s) {
//        super(); // implícito
//        this.s = s;
    }
    public static void main(String[] args) {
        B7 b = A7.B7("t");
//        System.out.println(b.s);
    }
}


class Burro {
    int x() { return y();}
    int y() { return 3; }
}
class Cavalo extends Burro {
    Cavalo() {
//        this(x()); // NÃO!
        this(1);
        x();
    }
    Cavalo(int i) {
        System.out.println(i);
    }
    int y() { return 2; }
}
class Fazenda {
    public static void main(String[] args) {
        new Cavalo();
    }
}