package config;
import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    private final static Browser browser = ConfigFactory
            .create(Browser.class, System.getProperties());

    public static String environment() {
        return browser.environment();
    }

    public static String browserName() {
        return browser.browserName();
    }

    public static String browserVersion() {
        return browser.browserVersion();
    }

    public static String URL() {
        return browser.URL();
    }
}

