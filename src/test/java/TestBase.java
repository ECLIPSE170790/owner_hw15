import config.Browser;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    @BeforeAll
    static void setupBeforeAll() {

        if (System.getProperty("environment") != null) {
            Browser config = ConfigFactory
                    .create(Browser.class, System.getProperties());

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);

            Configuration.browserCapabilities = capabilities;
            Configuration.browser = config.browserName();
            Configuration.browserVersion = config.browserVersion();


            if (config.environment().equalsIgnoreCase("remote")) {
                Configuration.remote = config.URL();
            }
        }
    }
}
