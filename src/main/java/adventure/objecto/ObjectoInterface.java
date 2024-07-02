package adventure.objecto;

public sealed interface ObjectoInterface permits Usable, Furniture {
    String getName();
}
