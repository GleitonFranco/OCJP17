package pond.duck;

import pond.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose other = new Goose();
//        other.floatInWater(); // NÃO! Not same package, nor extends Bird
    }
}
