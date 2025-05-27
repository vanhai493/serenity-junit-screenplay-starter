package starter.wikipedia;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.openqa.selenium.By.cssSelector;

/**
 * Represents information appearing on an article displayed on Wikipedia
 */
public class DisplayedArticle {

    public static Question<String> firstHeading() {
        return actor -> the(cssSelector("#firstHeading")).answeredBy(actor).getText();
    }
}
