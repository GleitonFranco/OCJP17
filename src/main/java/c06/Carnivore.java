package c06;

public class Carnivore {
    protected boolean hasFur = false;
    int speeds = -20;
}

class MeerKat extends Carnivore {
    protected boolean hasFur = true;
    int speeds = -10;

    public MeerKat() {
        this.speeds = -1;
        super.speeds = -2;
    }
    public MeerKat(int speeds) {
        super.speeds = speeds;

    }

    public static void main(String[] args) {
        MeerKat m = new MeerKat();
//        Carnivore c = new MeerKat();
        Carnivore c = m;
        System.out.println(m.hasFur);
        System.out.println(c.hasFur);
        System.out.println(m.speeds);
        System.out.println(c.speeds);

        Carnivore c2 = new MeerKat();
        System.out.println(c2.hasFur);
        System.out.println(c2.speeds);
    }
}