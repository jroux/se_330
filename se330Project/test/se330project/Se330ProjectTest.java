/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project;

import java.util.ArrayList;
import javafx.stage.Stage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Object;
import javafx.scene.control.Button;
import se330project.Models.workoutModel;
import se330project.Views.homePageView;


/**
 *
 * @author jrrou
 */
public class Se330ProjectTest {
    
    public Se330ProjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of start method, of class Se330Project.
     */
    @Test
    public void testStart() {
        //System.out.println("start");
        //Stage primaryStage = null;
        //Se330Project instance = new Se330Project();
        //instance.start(primaryStage);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    @Test
    public void testAddNums(){
        System.out.println("addNums");
        int expectedResult = 4;
        assertEquals(expectedResult, Se330Project.addNums(2,2));
        assertNotEquals(expectedResult, Se330Project.addNums(10,2));
    }


//
//    /**
//     * Test of createBWExercises method, of class Se330Project.
//     */
//    @Test
//    public void testCreateBWExercises() {
//        System.out.println("createBWExercises");
//        Se330Project instance = new Se330Project();
//        ArrayList<String> expResult = null;
//        ArrayList<String> result = instance.createBWExercises();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createGymExercises method, of class Se330Project.
//     */
//    @Test
//    public void testCreateGymExercises() {
//        System.out.println("createGymExercises");
//        Se330Project instance = new Se330Project();
//        ArrayList<String> expResult = null;
//        ArrayList<String> result = instance.createGymExercises();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of turnGoOn method, of class Se330Project.
//     */
//    @Test
//    public void testTurnGoOn() {
//        System.out.println("turnGoOn");
//        workoutModel model = null;
//        homePageView view = null;
//        Se330Project instance = new Se330Project();
//        instance.turnGoOn(model, view);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cardioWorkout method, of class Se330Project.
//     */
//    @Test
//    public void testCardioWorkout() {
//        System.out.println("cardioWorkout");
//        workoutModel model = null;
//        ArrayList<String> createdWorkout = null;
//        homePageView view = null;
//        Se330Project instance = new Se330Project();
//        ArrayList<String> expResult = null;
//        ArrayList<String> result = instance.cardioWorkout(model, createdWorkout, view);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of bodyWeightWorkout method, of class Se330Project.
//     */
//    @Test
//    public void testBodyWeightWorkout() {
//        System.out.println("bodyWeightWorkout");
//        workoutModel model = null;
//        ArrayList<String> createdWorkout = null;
//        ArrayList<String> BWExercises = null;
//        Se330Project instance = new Se330Project();
//        ArrayList<String> expResult = null;
//        ArrayList<String> result = instance.bodyWeightWorkout(model, createdWorkout, BWExercises);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of gymWorkout method, of class Se330Project.
//     */
//    @Test
//    public void testGymWorkout() {
//        System.out.println("gymWorkout");
//        workoutModel model = null;
//        ArrayList<String> createdWorkout = null;
//        ArrayList<String> GymExercises = null;
//        Se330Project instance = new Se330Project();
//        ArrayList<String> expResult = null;
//        ArrayList<String> result = instance.gymWorkout(model, createdWorkout, GymExercises);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setWorkout method, of class Se330Project.
//     */
//    @Test
//    public void testSetWorkout() {
//        System.out.println("setWorkout");
//        workoutModel model = null;
//        ArrayList<String> createdWorkout = null;
//        ArrayList<String> BWExercises = null;
//        ArrayList<String> GymExercises = null;
//        homePageView view = null;
//        Se330Project instance = new Se330Project();
//        String expResult = "";
//        String result = instance.setWorkout(model, createdWorkout, BWExercises, GymExercises, view);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of disableButton method, of class Se330Project.
//     */
//    @Test
//    public void testDisableButton() {
//        System.out.println("disableButton");
//        Boolean clickCheck = null;
//        Button btn = null;
//        Se330Project instance = new Se330Project();
//        Button expResult = null;
//        Button result = instance.disableButton(clickCheck, btn);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of resetWorkout method, of class Se330Project.
//     */
//    @Test
//    public void testResetWorkout() {
//        System.out.println("resetWorkout");
//        homePageView view = null;
//        workoutModel model = null;
//        ArrayList<String> BWExercises = null;
//        ArrayList<String> GymExercises = null;
//        ArrayList<String> createdWorkout = null;
//        Se330Project instance = new Se330Project();
//        instance.resetWorkout(view, model, BWExercises, GymExercises, createdWorkout);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class Se330Project.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Se330Project.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}



