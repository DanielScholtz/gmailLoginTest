package com.google;

import org.testng.annotations.Test;

public class loginTest extends Basics {

    @Test
    public void login() throws InterruptedException {
        username("testuser");
        Thread.sleep(500);
        password("password");
        Thread.sleep(500);
        invalidLogin();
    }
}
