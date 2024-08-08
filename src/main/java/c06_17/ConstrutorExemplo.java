package c06_17;

class Girafa {
    static int patas = 4;
    static {
        System.out.println("Estático de Girafa " + patas);
    }
    {
        // System.out.println("Instance initializer de Girafa" + listras); // NÃO!
    }
    int listras = 5;
    {
        System.out.println("Instance initializer de Girafa " + listras);
    }
    Girafa() {
        System.out.println("Construtor de Girafa");
    }
}

class Okapi extends Girafa {
    static {
        System.out.println("Estático de Girafa Okapi " + patas);
    }
    {
        System.out.println("Instance initializer de Girafa Okapi " + listras);
    }
    Okapi(int i) {
        super();
        System.out.println("Construtor de Girafa Okapi");
        listras = 10;
    }
}

public class ConstrutorExemplo {
    public static void main(String... capins) {
        System.out.println("Início de main()");
        new Okapi(3);
        System.out.println();
        new Okapi(7);
    }
}
