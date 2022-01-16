import config.ConfigHelper;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    @BeforeAll
    static void setupBeforeAll() {

        System.setProperty("env", "remote");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        Configuration.browser = ConfigHelper.browser.getBrowserName();
        Configuration.browserVersion = ConfigHelper.browser.getBrowserVersion();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        if (System.getProperties().containsValue("remote")) {
            Configuration.remote = ConfigHelper.browser.getUrl();

        }

        Configuration.browserCapabilities = capabilities;

    }
}
