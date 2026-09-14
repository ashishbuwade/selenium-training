package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] ab) {

        // 1. Launch Browser
//    ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        //2. Open URL
        driver.get("https://testautomationpractice.blogspot.com/");

        // 3. Validate title should be "Your Store"
        String pageTitle = driver.getTitle();

        if(pageTitle.equals("Automation Testing Practice")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        //Close Browser
//        driver.quit();
//        driver.close();


    }

}
