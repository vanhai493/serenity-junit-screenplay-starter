package starter.wikipedia;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    /**
     * An action that opens the browser on the Wikipedia home page
     */
    public static Performable toTheHomePage() {
        // Method 1: Using url()
        // return Open.url("http://wikipedia.com/");
        
        // Method 2: Using browserOn() and url()
        return Open.browserOn().the(new WikipediaHomePage());
        
        // Method 3: Using relativeUrl() for relative paths
        // return Open.relativeUrl("/wiki/Main_Page");
        
        // Method 4: Using browserOn() directly with PageObject
        // return Open.browserOn(new WikipediaHomePage());
    }
}
