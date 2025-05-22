package tests.day13_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.TestBase_Each;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileExists extends TestBase_Each {

    @Test
    public void test01(){

        // day 13 package'i altinda
        // notlar.txt dosyasi bulundugunu test edin

        String dosyaYolu = "src/test/java/tests/day13_fileTestleri/notlar.txt";
        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        // bilgisayar masaüstünde notlar.txt
        // dosyasının var olduğunu test edin

        dosyaYolu ="C:\\Users\\X\\OneDrive\\Masaüstü\\Yeni klasör (2)";

        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));



    }



}
