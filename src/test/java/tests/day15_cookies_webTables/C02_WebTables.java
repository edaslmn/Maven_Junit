package tests.day15_cookies_webTables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import java.util.List;

public class C02_WebTables extends TestBase_Each {


    @Test
    public void klasikHtmlTabloTesti(){

        // eğer web table klasik html kodları ile oluşturulmuşsa
        // sadece tagları kullanarak
        // tüm body'i istediğimiz satırı
        // veya istediğimz hücreyi görebiliriz.

        //1."https://testotomasyonu.com/webtables" adresine gidin
        driver.get("https://testotomasyonu.com/webtables");


        //2.Web table tum body’sini yazdirin
        WebElement tumBodyElementi = driver.findElement(By.tagName("tbody"));
        System.out.println("tum body: " + tumBodyElementi.getText());


        //3. Web tablosunda "Comfortable Gaming Chair" bulundugunu test edin
        String expectedTabloIcerik = "Comfortable Gaming Chair";
        String tumBody = tumBodyElementi.getText();

        Assertions.assertTrue(tumBody.contains(expectedTabloIcerik));


        //4. Web table’daki satir sayisinin 5 oldugunu test edin
        List<WebElement> satirElementleriList = driver.findElements(By.xpath("//tbody/tr"));
        int expectedSatirSayisi = 5;
        int actualSatirSayisi = satirElementleriList.size();
        Assertions.assertEquals(actualSatirSayisi, expectedSatirSayisi);


        //5. Tum satirlari yazdirin
        System.out.println(ReusableMethods.stringListeDonustur(satirElementleriList));


        //6. Web table’daki sutun sayisinin 4 olduğunu test edin
        List<WebElement> ikinciSatirDataElementleriList = driver.findElements(By.xpath("tr[2]/td"));
        int expectedSutunSayisi = 4;
        int actualSutunSayisi = ikinciSatirDataElementleriList.size();

        Assertions.assertEquals(actualSatirSayisi, expectedSatirSayisi);


        //7. 3.sutunu yazdirin
        WebElement ucuncuSatir = driver.findElement(By.xpath("//tr[3]"));
        System.out.println(ucuncuSatir.getText());


        //8. Tablodaki basliklari yazdirin
        WebElement basliklar = driver.findElement(By.xpath("//tr[1]"));


        //9. Satir ve sutunu parametre olarak alip, hucredeki bilgiyi döndüren bir method olusturun.
        WebElement urun = driver.findElement(By.xpath(ReusableMethods.tableUrunBulma("2","3")));

        System.out.println(urun.getText()); //$40.00


        //10. 4.satirdaki category degerinin "Furniture" oldugunu test edin
        WebElement furnitureElementi = driver.findElement(By.xpath(ReusableMethods.tableUrunBulma("4","2")));
        String expectedYazi = "Furniture";
        String actualYazi = furnitureElementi.getText();

        Assertions.assertEquals(expectedYazi, actualYazi);

    }




}
