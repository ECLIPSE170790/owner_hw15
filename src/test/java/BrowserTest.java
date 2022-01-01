import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import config.Browser;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BrowserTest extends TestBase{

    @Test
    public void findSelenide() {
        Browser config = ConfigFactory
                .create(Browser.class, System.getProperties());

        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $(".f4.text-normal").shouldHave(text("selenide/selenide"));
    }
}



