package org.Demo;

import org.testng.annotations.Test;

public class NewPersonalLoan {
    @Test(priority = 1)
    public void PersonalRegistered(){
        System.out.println("sucessfully Registered");
    }
    @Test(enabled = false)
    public void PersonalActivated(){
        System.out.println("Sucessfully Activated");
    }
    @Test(invocationCount = 5)
    public  void  PersonalCreated(){
        System.out.println("Sucessfully Verified");
    }
    @Test(priority = -4)
    public void PersonalCredited(){
        System.out.println("Sucessfully Credited");
    }
}
