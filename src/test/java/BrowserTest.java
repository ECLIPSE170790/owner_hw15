import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BrowserTest extends TestBase{

    @Test
    public void findSelenide() {
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $(".f4.text-normal").shouldHave(text("selenide/selenide"));
    }
}



