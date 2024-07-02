package c06;

public abstract class Whale {
    public abstract void dive();

    public static void main(String... args) {
        Whale o = new Orca();
//        o.dive(2);
    }
}

class Orca extends Whale {
    static public int MAX = 3;
    public void dive() {
        System.out.println("diving...");
    }

    public void dive(int... depth) {
        System.out.println("diving depth..." + MAX);
    }

}