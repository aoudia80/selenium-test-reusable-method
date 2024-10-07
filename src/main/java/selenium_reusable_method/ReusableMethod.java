package selenium_reusable_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableMethod {
    // A reusable method that opens different browsers based on the input string
    public static void reusMethodBrowsers(String browser){

        // Check if the input is "chrome" to open Chrome browser
        // then it opens https://www.google.com/
        if (browser.equals("chrome")){
            WebDriver driver = new ChromeDriver(); // Create a new instance of ChromeDriver
            driver.get("https://www.google.com/");// Navigate to Google's homepage

        // Check if the input is "Firefox" to open Firefox browser
        } else if (browser.equals("Firefox")) {
            WebDriver driver= new FirefoxDriver(); // Create a new instance of FirefoxDriver
            driver.get("https://www.amazon.com/"); // Navigate to Amazon's homepage

        // Check if the input is "edge" to open Edge browser
        } else if (browser.equals("edge")) {
            WebDriver driver= new EdgeDriver(); // Create a new instance of EdgeDriver
            driver.get("https://www.walmart.com/"); // Navigate to Walmart's homepage

        // If the input is none of the above, print an error message
        } else {
            System.out.println("is not a browser"); // Output when the browser is not recognized

        }
    }
    // Main method to call the reusable browser method
    public static void main(String[] args) {

        // Call the method with a valid input (one of the browsers) to demonstrate is redirected to the website homepage
        // an invalid browser "orange" to demonstrate the default case
        ReusableMethod.reusMethodBrowsers("orange");
    }
}
