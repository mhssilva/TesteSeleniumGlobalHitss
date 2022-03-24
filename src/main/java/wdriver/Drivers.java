package wdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Drivers {
    public static void main(String[] args) {
        //setando path do chromedriver
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matheus\\Desktop\\WdriverHits\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //chamando URL de testes.
        driver.get("file:///C:/Users/Matheus/Desktop/WdriverHits/loginteste.html");

        //WebElement primeiroNome=driver.findElement(By.xpath("//input[@id='fname']"));
        WebElement primeiroNome =driver.findElement(By.id("fname"));
        primeiroNome.sendKeys("PRIMEIRONOME");

        WebElement ultimoNome=driver.findElement(By.name("lname"));
        ultimoNome.sendKeys("ULTIMONOME");

        WebElement submitButton=driver.findElement(By.xpath("//Button[@id='bsubmit']"));
        submitButton.click();


    }
}