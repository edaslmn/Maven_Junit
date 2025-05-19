package day06_jUnitFramework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class C01_TestNotasyonu {

    /*
        bir classın run edilebiir olması için
        bugüne kadar MUTLAKA main method olmalı demiştik

        gerçekten de main method olmadan
        methodların yanında run tuşu çıkmıyor

        JUnit Framework'u ile gelen en büyük promosyon
        @Test notasyonudur.

        @Test notasyonu sayesinde
        her bir method bağımsız olarak çalıştırılabilir hale gelir

     */

    @Test @Disabled
    public void test01(){
        System.out.println("Test1 çalıştı");
    }


    @Test
    public void test02(){
        System.out.println("Test2 çalıştı");
    }


    @Test
    public void test03(){
        System.out.println("Test3 çalıştı");
    }



}
