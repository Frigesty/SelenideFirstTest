import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideFirstTest {

    @Test
    void practiceFormTest(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $(".filterable-active").shouldHave(Condition.text("SoftAssertions"));
        $("[data-filterable-for=wiki-pages-filter]").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(Condition.text("Using JUnit5 extend test class"));

    }
}