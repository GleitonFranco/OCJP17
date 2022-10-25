package c02oo;

public abstract class AbstrataA {

    abstract void imprimirConcreta();

    void imprimirAbstrata() {
        System.out.println(getClass().getSimpleName());
    }
}
