package c1construtor;

import java.util.List;

public class Swan {
//    { eggs = 3; }

    int eggs = 2;

    { eggs = 4; }

    public Swan() {
//        eggs = 5;
    }

    public static void main(String[] args) {
        var s = new Swan();
        System.out.println(s.eggs);

//        long l = 3123456789; // NÃO!
        long l = 3123456789L; // OK
        int bin = 0b1111; // 15
        int oct = 017; // 15
        int dec = 15; // 15
        int hex = 0xF; // 15
        System.out.println(bin  + " " + oct + " " + dec + " " + hex);
        double milhar = 1_000_000.00;
        double milhar2 = 1_000000.00;
        double milhar3 = 1_000000.00_00;
//        double milhar4 = 1_000000_.00;
//        double milhar5 = 1_000000._00;
//        double milhar6 = 1_000000.00_;
//        double milhar6 = _1000000.00;
        System.out.println(Integer.max(1,2));
        System.out.println(Integer.min(1,2));
        System.out.println(Integer.sum(1,2));
        String pyramid = """
                  *
                 * *
                * * *
                """;
        System.out.println(pyramid);
        String textBlock = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.println("*"+textBlock+"*");


        int d; // ???
        int dias;
        int diasDecorridos;
        int diasDesdeCriação;

        List lista; // ???
        List linhas; // ???
        List clientes;
        int O = 2;
        int O1 = 3;

        int a = 1;
        if (O == 1)
            a = O1;
        else
            a = 01;
    }

    public static void copyChars(char a1[], char a2[]) {

    }

    public static void copyCharsMelhorado(char origem[], char destino[]) {

    }

}

