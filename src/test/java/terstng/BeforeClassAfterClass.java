package terstng;

import org.testng.annotations.*;

public class BeforeClassAfterClass {

    @BeforeClass
    public void beforeclass(){
        System.out.println("Beforeclass Method");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("AfterClass Method");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("Before Method");
    }

    @Test
    public void Testcase1(){
        System.out.println("Testcase1");
    }
    @Test
    public void Testcase2(){
        System.out.println("Testcase2");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("After Method");
    }





}
