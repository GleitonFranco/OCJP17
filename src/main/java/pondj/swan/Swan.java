package pondj.swan;

import pond.shore.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
//        other.floatInWater(); // NÃO!
    }
}
