package c07_17;

import java.io.IOException;

class Veiculo {
    void ligar() {
        System.out.println("Ligado Veículo");
        this.pararNoSinal();
    }
    void pararNoSinal() {
        System.out.println("Parar no sinal vermelho e esperar =/");
    }
}

class Helicoptero extends Veiculo {
    void ligar() {
        System.out.println("Ligado Helicoptero");
        super.ligar();
    }
    void pararNoSinal() {
        System.out.println("Helicópteros NÃO param no sinal!");
        this.ligar();
    }
}


class B12 {
    void x(int i) throws IOException {
        if(++i<0) return;
        x(-1);
        System.out.println("c");
    }
}
abstract class C2 extends B12 {
    void x(int i) throws IOException {
        System.out.println("b");
        super.x(i);
    }
}
abstract class D3 extends C2 {
    void x(int i) throws IOException {
        super.x(i);
    }
}
class E3 extends D3 {
}

public class PolimorfismoInfinito {
    public static void main(String[] args) throws IOException {
//        new Veiculo().ligar();
//        new Helicoptero().ligar();
        new E3().x(32);
    }
}
