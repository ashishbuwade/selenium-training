package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        //Xpath with single attribute
        driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Dudu");

        //Xpath with multiple attribute
        driver.findElement(By.xpath("//input[@id='email'][@placeholder='Enter EMail']")).sendKeys("dudu@gmail.com");

        //Xpath with 'and' 'or' operator
        driver.findElement(By.xpath("//input[@id='phone' and @placeholder='Enter Phone']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input' or @class='wikipedia-search-input']")).sendKeys("who is bubu");

        //Xpath with text (inner text)
        boolean addressVisibleOrNot = driver.findElement(By.xpath("//label[text()='Address:']")).isDisplayed();
        System.out.println(addressVisibleOrNot);

        String addressText = driver.findElement(By.xpath("//label[text()='Address:']")).getText();
        System.out.println(addressText);

        //Xpath with contains()
        boolean automationTestingHeadingStatus = driver.findElement(By.xpath("//h1[contains(text(),'Automation Testing')]")).isDisplayed();
        System.out.println("Is Automation Testing Practice heading available: "+automationTestingHeadingStatus);

        //Xpath with starts-with()
//        boolean entryFormStatus = driver.findElement(By.xpath("//a[starts-with(.,'Data Entry')]")).isDisplayed();
        boolean entryFormStatus = driver.findElement(By.xpath("//a[starts-with(text(),'Data Entry')]")).isDisplayed();
        System.out.println("Is Data Entry Form available: "+entryFormStatus);

        //Chained Xpath
        boolean tabsStatus = driver.findElement(By.xpath("//div[@id='Wikipedia1']//h2")).isDisplayed();
        System.out.println("Is Tabs available: "+tabsStatus);


    }

}
