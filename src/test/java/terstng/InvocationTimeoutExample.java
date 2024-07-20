package terstng;

import org.testng.annotations.Test;

public class InvocationTimeoutExample {

    @Test(invocationCount=100000000,invocationTimeOut=1)
    public void invocationTimeout() {
        System.out.println("Invocation Timeout demo");
    }
}
