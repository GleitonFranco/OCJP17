package c09_17.generico;

import java.awt.*;

public class GenericInterfaces {
}

interface Shippable<T> {
    void ship(T t);
}

class ShippableRobot implements Shippable<Robot> {
    @Override
    public void ship(Robot robot) {

    }
}

class AbstractShippable<U> implements Shippable<U> {
    public void ship(U u) {}
}

class ObjectShippable implements Shippable {
    public void ship(Object o) {}
}
