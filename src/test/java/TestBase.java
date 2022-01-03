import config.ConfigHelper;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    @BeforeAll
    static void setupBeforeAll() {

            ConfigHelper config = new ConfigHelper();

            DesiredCapabilities capabilities = new DesiredCapabilities();

            if (config.environment().equals("remote")) {
                Configuration.remote = config.URL();
            }

            capabilities.setCapability("browserName", config.browserName());
            capabilities.setCapability("browserVersion", config.browserVersion());
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);

    }
}
