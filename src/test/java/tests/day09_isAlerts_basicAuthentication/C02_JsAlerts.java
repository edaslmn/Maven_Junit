package tests.day09_isAlerts_basicAuthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase_All;

public class C02_JsAlerts extends TestBase_All {

    //3 test method'u olusturup asagidaki gorevi tamamlayin



    @Test
    public void simpleAlertTest(){

        //1. Test
        // - https://testotomasyonu.com/javascriptAlert adresine gidin
        driver.get("https://testotomasyonu.com/javascriptAlert");

        // - 1.alert'e tiklayin
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        // - Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        String actualAlertYazisi = driver.switchTo().alert().getText();
        String expectedAlertYazisi = "I am a Js Alert";
        Assertions.assertEquals(expectedAlertYazisi,actualAlertYazisi);

        // - OK tusuna basip alert'i kapatin
        driver.switchTo().alert().accept();


    }


    @Test
    public void confirmAlertTest(){

        //2.Test
        // - https://testotomasyonu.com/javascriptAlert adresine gidin
        driver.get("https://testotomasyonu.com/javascriptAlert");

        // - 2.alert'e tiklayalim
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        // - Cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        driver.switchTo().alert().dismiss();
        String expectedSonucYazisi = "You clicked: Cancel";
        String actualSonucYazisi = driver.findElement(By.id("result")).getText();

        Assertions.assertEquals(expectedSonucYazisi,actualSonucYazisi);
        ReusableMethods.bekle(3);


    }


    @Test
    public void promptAlertTest(){

        //3.Test
        // - https://testotomasyonu.com/javascriptAlert adresine gidin
        driver.get("https://testotomasyonu.com/javascriptAlert");

        // - 3.alert'e tiklayalim
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        // - Cikan prompt ekranina "Yusuf" yazdiralim
        driver.switchTo().alert().sendKeys("Yusuf");

        // - OK tusuna basarak alert'i kapatalim
        driver.switchTo().alert().accept();

        // - Cikan sonuc yazisinin "Yusuf" icerdigini test edelim
        String expectedYaziIcerigi = "Yusuf";
        String actualSonucYazisi = driver.findElement(By.id("result")).getText();
        Assertions.assertTrue(expectedYaziIcerigi.contains(actualSonucYazisi));

    }
}
