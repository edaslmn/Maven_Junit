package tests.day13_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Odev {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

    @Test
    public void test01(){

    //1. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

    //2. Textbox’in etkin olmadigini(enabled) dogrulayın
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        Assertions.assertTrue(textBox.isDisplayed());

    //3. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        WebElement enableButonu = driver.findElement(By.xpath("//*[.='Enable']"));
        enableButonu.click();
        wait.until(ExpectedConditions.elementToBeClickable(textBox));

    //4. Textbox’in etkin oldugunu(enabled) dogrulayın.
        Assertions.assertTrue(textBox.isEnabled());

    //5. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        WebElement yaziElementi = driver.findElement(By.xpath("//p[@id='message']"));
        wait.until(ExpectedConditions.textToBePresentInElement(yaziElementi,"It’s enabled!"));
        String expectedYazi = "It’s enabled!";
        String actualYazi = yaziElementi.getText();
        Assertions.assertEquals(expectedYazi, actualYazi);

}
 }