package c07_17;

public class Gorilla {
    private int len =3;

    private interface Climb {}

    private final Climb climbing = new Climb() {};

    public void up() {
        Climb climbing2 = new Climb() {};
        int pass = 2;
        class Goup {
            public void going() {
                System.out.println(pass * len);
            }
        }
//        pass++;
    }
}
