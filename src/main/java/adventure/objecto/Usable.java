package adventure.objecto;

public sealed interface Usable extends ObjectoInterface permits Tool, Key, Weapon, Scroll {
    void use();
}
