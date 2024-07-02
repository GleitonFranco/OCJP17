package adventure;

import java.util.List;

public record Room(String name,
                   String description,
                   List<Persona> personas,
                   List<Objecto> objectos,
                   List<Door> doors) {
}
