package starter.wikipedia;

import net.serenitybdd.core.selectors.Selectors;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.openqa.selenium.By.cssSelector;

public class SearchResults {
    public static Question<Integer> resultCount() {
        return actor -> {
            String resultText = the(Selectors.xpathOrCssSelector("//*[@id=\"vector-toc\"]//a[@class=\"vector-toc-link\"]")).answeredBy(actor).getText();
            return Integer.parseInt(resultText.split(" ")[0].replace(",", ""));
        };
    }
} 