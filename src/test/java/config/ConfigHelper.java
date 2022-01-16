package config;
import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public final static Browser browser = ConfigFactory
            .create(Browser.class, System.getProperties());

}

