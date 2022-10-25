package c10develop;


import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemploLogging {
    private static final Logger LOGGER = Logger.getLogger(ExemploLogging.class.getName());
    private static final System.Logger LOGGERV2 = System.getLogger(ExemploLogging.class.getName());
    public static void main(String[] args) {
        try{
            //Imprimir dados com SYSTEM.LOGGER
            LOGGERV2.log(System.Logger.Level.INFO, "Mensagem de INFO");
            LOGGERV2.log(System.Logger.Level.WARNING, "Mensagem de WARNING");
            LOGGERV2.log(System.Logger.Level.TRACE, "Mensagem de TRACE");
            LOGGERV2.log(System.Logger.Level.ERROR, "Mensagem de ERROR");
            LOGGERV2.log(System.Logger.Level.DEBUG, "Mensagem de DEBUG");
            int a = 3/0;
        } catch(Exception e) {
            //Imprimir dados com LOGGER
            LOGGER.log(Level.SEVERE, "Exemplo de mensagem SEVERE", e);
            LOGGER.log(Level.WARNING, "Exemplo de mensagem WARNING", e);
            LOGGER.log(Level.WARNING, "Exemplo de mensagem WARNING", e);
        }
        LOGGER.log(Level.INFO, "Exemplo de mensagem info");

    }

}
