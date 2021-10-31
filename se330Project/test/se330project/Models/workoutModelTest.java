/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project.Models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jrrou
 */
public class workoutModelTest {
    
    public workoutModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTime method, of class workoutModel.
     */
    @Test
    public void testGetSetTime() {
        System.out.println("getTime");
        workoutModel instance = new workoutModel();
        int expResult = 20;
        instance.setTime(expResult);
        assertEquals(expResult, instance.getTime());
    }



    /**
     * Test of getWrkTemp method, of class workoutModel.
     */
    @Test
    public void testGetSetWrkTemp() {
        System.out.println("getWrkTemp");
        workoutModel instance = new workoutModel();
        int expResult = 1;
        instance.setWrkTemp(expResult);
        assertEquals(expResult, instance.getWrkTemp());
    }


    /**
     * Test of getEquip method, of class workoutModel.
     */
    @Test
    public void testGetSetEquip() {
        System.out.println("getEquip");
        workoutModel instance = new workoutModel();
        int expResult = 1;
        instance.setEquip(expResult);
        assertEquals(expResult, instance.getEquip());
    }    
}
