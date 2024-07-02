package c07_17;

abstract class Animal {
    abstract int getType();
}

interface Fly {
    void fly();
}
interface Swim {
    void swim();
}

abstract class Bird extends Animal implements Fly {
    abstract boolean canSwoop();
}

class Swan extends Bird implements Swim {
    @Override
    boolean canSwoop() {
        return false;
    }
    @Override
    int getType() {
        return 0;
    }
    @Override
    public void fly() {

    }
    @Override
    public void swim() {

    }
}

class B0 {
    protected void b() {
        System.out.println("BBB");
    }
    static void b0() {}
}

class B1 extends B0 {
    public void b1() {
        System.out.println("B1");
        b();
    }
    public void b() {}
    private static void bs() {}
}

class B2 extends B1 {
    public void b2() {
        System.out.println("B1");
        b();
        B2.b0();
    }
}