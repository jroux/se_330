/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Imports and Packages
package se330project.Models;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jrrou
 */
//Unit testing file that tests the workout model functions
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
     * Tests getTime method and setTime method, of class workoutModel.
     */
    @Test
    public void testGetSetTime() {
        System.out.println("getTime and setTime Test");
        workoutModel instance = new workoutModel();
        int expResult = 20;
        instance.setTime(expResult);
        assertEquals(expResult, instance.getTime());
    }
    
    
    /**
     * Tests getWrkTemp method and setWrkTemp method, of class workoutModel.
     */
    @Test
    public void testGetSetWrkTemp() {
        System.out.println("getWrkTemp and setWrkTemp Test");
        workoutModel instance = new workoutModel();
        int expResult = 1;
        instance.setWrkTemp(expResult);
        assertEquals(expResult, instance.getWrkTemp());
    }


    /**
     * Tests getEquip method and setEquip method, of class workoutModel.
     */
    @Test
    public void testGetSetEquip() {
        System.out.println("getEquip and setEquip Test");
        workoutModel instance = new workoutModel();
        int expResult = 1;
        instance.setEquip(expResult);
        assertEquals(expResult, instance.getEquip());
    }    
}
