package c10develop;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ExemploLoggerManager {

    private static final Logger LOGGER = Logger.getLogger(ExemploLoggerManager.class.getName());
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ExemploLoggerManager.class.getName());
        LogManager.getLogManager().addLogger(logger);
        LOGGER.log(Level.INFO, "Exemplo de mensagem info");

        checkLogManager();
    }

    public static void checkLogManager() {

    }
}
