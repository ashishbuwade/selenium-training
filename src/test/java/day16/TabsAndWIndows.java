package day16;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class TabsAndWIndows {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//       driver.switchTo().newWindow(WindowType.TAB);
       driver.switchTo().newWindow(WindowType.WINDOW);

       driver.get("https://text-compare.com/");

    }
}
