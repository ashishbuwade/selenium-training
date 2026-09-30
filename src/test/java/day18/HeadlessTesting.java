package day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); //Setting for headless mode of execution

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");

        String act_title = driver.getTitle();
        if(act_title.equals("Automation Testing Practice")){
            System.out.println("Opened page successfully");
        }

    }
}
