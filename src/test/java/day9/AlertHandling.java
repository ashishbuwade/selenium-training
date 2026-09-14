package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
//        driver.switchTo().alert().accept();

        //1. Normal Alert with OK button
        Alert myAlert = driver.switchTo().alert();
        System.out.println(myAlert.getText());
        myAlert.accept();

        //2. Confirmation Alert - OK and Cancel button
        driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
        Alert myAlert1 = driver.switchTo().alert();
        System.out.println(myAlert1.getText());
//        myAlert1.accept();
        myAlert1.dismiss();


        //3. Prompt Alert - Input Box
        driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
        Alert myAlert2 = driver.switchTo().alert();
        System.out.println(myAlert2.getText());
//        myAlert1.accept();
        myAlert2.sendKeys("Hey AB!");
        myAlert2.accept();

    }
}
