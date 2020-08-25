package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Ifelse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");

        String sayfabas = driver.getTitle();
        System.out.println(sayfabas);

        String sayfaUrl = driver.getCurrentUrl();
        System.out.println(sayfaUrl);

        if(sayfabas.contains("Computers")){
            System.out.println("Bu kelimeyi iceriyor:");
        }else {
            System.out.println("Bu kelimeyi icermiyor");
        }
        driver.quit();

    }
}
