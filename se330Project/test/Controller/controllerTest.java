/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se330project.Se330Project;

/**
 *
 * @author jrrou
 */
public class controllerTest {
    
    public controllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testCreateBWExercises() {
        System.out.println("createBWExercises");
        controller instance = new controller();
        ArrayList<String> result = instance.createBWExercises();
        assertNotNull(result);

    }

    
}
