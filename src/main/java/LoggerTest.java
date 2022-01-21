import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class LoggerTest {
    static  final Logger loger = Logger.getLogger(LoggerTest.class);

    public static void main(String[] args) {
        DOMConfigurator.configure("LogerConfig.xml");
        loger.error("rer");
        loger.debug("rer");
        loger.warn("rer");
        loger.info("rer");
    }
}
