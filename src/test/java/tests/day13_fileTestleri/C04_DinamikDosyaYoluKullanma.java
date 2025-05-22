package tests.day13_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_DinamikDosyaYoluKullanma {

    @Test
    public void test01(){

        //day13 package2ında notlar.txt dosuasının olduğunu test edin

        String dosyaYolu = "src/test/java/tests/day13_fileTestleri/notlar.txt";

        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        // dosya yolunu dinamik yapalım

        // C:\Users\X\IdeaProjects
        //    \Team161_JUnit\src\test\java\tests\day13_fileTestleri\notlar.txt

        // Eger proje altındaki bir dosyaya ulaşmak isterseniz
        // Java bilgisayardaki projemizin konumunu veya dosyayolunu bize dinamik olarak verir.

        System.out.println(System.getProperty("user.dir"));
        // C:\Users\X\IdeaProjects\Team161_JUnit

        String dinamikDosyaYolu = System.getProperty("user.dir") + "/src\\test\\java\\tests\\day13_fileTestleri\\notlar.txt";

        Assertions.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));





    }
}
