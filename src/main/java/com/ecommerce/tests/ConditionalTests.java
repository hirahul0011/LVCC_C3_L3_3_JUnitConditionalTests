package com.ecommerce.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTests {
	
	@Test
    @EnabledOnOs({OS.WINDOWS})
    public void runOnWindows() {
            System.out.println("This runs on Windows");
    }

    @Test
    @EnabledOnOs({OS.LINUX})
    public void runOnLinux() {
            System.out.println("This runs on Linux");
    }
    
    @Test
    @DisabledIf("Math.random() < 0.314159")
    void mightNotBeExecuted() {
            System.out.println("This may or not execute ");
    }
    //Failed to evaluate condition 
    //[org.junit.jupiter.api.condition.DisabledIfCondition]: 
    //Could not find method [Math.random() < 0.314159] in 
    //class [com.ecommerce.tests.ConditionalTests]

    		




}
