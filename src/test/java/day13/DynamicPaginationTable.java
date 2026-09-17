package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicPaginationTable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//span[text()='Admin']")).click();

        String totalS = driver.findElement(By.xpath("//span[contains(.,'Records Found') or contains(.,'Record Found')]")).getText();

        String totalNumS = totalS.substring(totalS.indexOf("(")+1,totalS.indexOf(")"));

        int totalNum = Integer.parseInt(totalNumS);
        System.out.println(totalNum);

        for(int i=1;i<=totalNum+1;i++){
            for(int j=1;j<=6;j++){
                if(i==1){
                    String headers = driver.findElement(By.xpath("(//div[@class='oxd-table']//div[@class='oxd-table-header']//div[@role='columnheader'])["+j+"]")).getText();
                    System.out.print(headers+ "\t");
                }else{
                    if(j!=1 && j!=6){
                        String val = driver.findElement(By.xpath("(//div[@class='oxd-table']//div[@class='oxd-table-body']//div[@class='oxd-table-card'])[" + (i-1) + "]//div[@class='oxd-table-cell oxd-padding-cell'][" + j + "]")).getText();
                        System.out.print(val + "\t");
                    }
                }
            }
            System.out.println();
        }


    }

}
