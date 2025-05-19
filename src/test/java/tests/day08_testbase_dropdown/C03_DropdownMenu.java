package tests.day08_testbase_dropdown;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class C03_DropdownMenu extends TestBase_Each {

    // https://the-internet.herokuapp.com/dropdown adresine gidin.
    // 1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    // 2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
    // 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    // 4.Tüm dropdown değerleri(value) yazdırın
    // 5. Dropdown’un boyutunun 4 olduğunu test edin

    @Test
    public void test01(){

        // https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");


        // 1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement dropdownElementi = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select select = new Select(dropdownElementi);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        ReusableMethods.bekle(2);

        // 2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        select.selectByValue("2");



        // 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());



        // 4.Tüm dropdown değerleri(value) yazdırın

        System.out.println(ReusableMethods.stringListeDonustur(select.getOptions()));

        // 5. Dropdown’un boyutunun 4 olduğunu test edin




    }
}
