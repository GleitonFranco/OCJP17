package adventure.objecto;

public sealed interface Furniture extends ObjectoInterface permits Blocker, Container {
    String getShortName();
    int getTank();
    void decreaseTank(int damage);
}
