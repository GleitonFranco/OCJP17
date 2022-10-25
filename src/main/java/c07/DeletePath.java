package c07;

import java.nio.file.Path;

public class DeletePath {

    public static void main(String... args) {
//        Path backup = Path.of("/opt/");
        var t = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(1);
        });
        System.out.println("INIT");
        t.start();
    }
}
