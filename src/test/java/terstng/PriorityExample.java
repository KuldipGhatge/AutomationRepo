package terstng;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test
    public void Testcase_Z(){
        System.out.println("testcase_Z");
    }

    @Test(priority = 5)
    public void Testcase_A(){
        System.out.println("testcase_A");
    }

    @Test(priority = -1)
    public void Testcase_K(){
        System.out.println("testcase_K");
    }

    @Test(priority = 2)
    public void Testcase_G(){
        System.out.println("testcase_G");
    }

    @Test
    public void Testcase_Q(){
        System.out.println("testcase_Q");
    }
}
