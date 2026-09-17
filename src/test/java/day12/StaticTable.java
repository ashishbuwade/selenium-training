package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        //Find total number of rows
        int rowsCount = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

        System.out.println(rowsCount);

        //Find total number of columns
        int colsCount = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();

        System.out.println(colsCount);

        //Read data from specific row and column(ex. 5th row and 1st column)
        String specValue = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();

        System.out.println(specValue);

        //Get all the table values
        for(int i=2;i<=rowsCount;i++){
            for(int j=1;j<=colsCount;j++){
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
                System.out.print(value+"\t");
            }
            System.out.println();
        }

        //Print Book Name whose author is Mukesh
        for(int i=2;i<=rowsCount;i++){
            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
//            System.out.println(authorName);
            if(authorName.equals("Mukesh")){
                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
                System.out.println(bookName +"\t"+ authorName);
            }
        }

        //Find total price of all the books

        int total = 0;
        for(int i=2;i<=rowsCount;i++){
            String priceOfBook = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();

            int price = Integer.parseInt(priceOfBook);
            total = total + price;
        }
        System.out.println("Total Price of books: "+total);


    }

}
