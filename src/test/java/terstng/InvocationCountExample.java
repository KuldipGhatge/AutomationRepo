package terstng;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 10)
    public void invocationcount(){
        System.out.println("Invocation count demo");
    }
}
