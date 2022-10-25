package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
    }

    public void helpOthersSwim() {
        Bird other = new Goose();
//        other.floatInWater(); // NÃO!

        Bird other2 = new Bird();
//        other2.floatInWater(); // NÃO!
    }
}
