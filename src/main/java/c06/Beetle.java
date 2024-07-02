package c06;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Beetle {
    private String getSize() {
        return "undefined";
    }
}

class RhinocerosBeetle extends Beetle {
    private int getSize() {
        return 5;
    }
}

/* Overriding methods rules:
* #1: signature ==
* #2: access >=
* #3: Exception =<
* #4: Return type: covariant (same type || subtype of)
*/

class Bear {
    public String getSize() throws IOException {
        return "undefined";
    }
}

class Panda extends Bear {
    @Override
    public String getSize() {
        return "5";
    }
}
