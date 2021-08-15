package org.Demo;

import org.testng.annotations.Test;

public class Loan {
    @Test(priority = 1)
    public void HomeRegistered(){
        System.out.println("sucessfully Registered");
    }
    @Test(enabled = false)
    public void HomeActivated(){
        System.out.println("Sucessfully Activated");
    }
    @Test(invocationCount = 5)
    public  void  HomeCreated(){
        System.out.println("Sucessfully Verified");
    }
    @Test(priority = -4)
    public void HomeCredited(){
        System.out.println("Sucessfully Credited");
    }
}
