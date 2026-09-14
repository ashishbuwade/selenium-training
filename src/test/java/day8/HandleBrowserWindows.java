package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Set<String> windowIDs = driver.getWindowHandles();

        //Approach1

        List<String> windowList = new ArrayList<>(windowIDs);
        String parentId = windowList.get(0);
        String childId = windowList.get(1);

        System.out.println(driver.getTitle());

        //Switch to child window
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

        //Switch to parent Window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());


        //Approach2

        for(String winId: windowIDs){
            String title = driver.switchTo().window(winId).getTitle();
            System.out.println(title);
            if(title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
            }
        }

    }

}
