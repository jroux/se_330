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
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import se330project.Se330Project;
import se330project.Models.workoutModel;
import se330project.Views.homePageView;
import java.util.Collections; 

/**
 *
 * @author jrrou
 */
public class controllerTest {
    private workoutModel modelMock;
    private homePageView viewMock;
    
    public controllerTest() {
        modelMock = mock(workoutModel.class);
        viewMock = mock(homePageView.class);
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
        //testing null case
        System.out.println("createBWExercises null case");
        controller instance = new controller();
        ArrayList<String> result = instance.createBWExercises();
        assertNotNull(result);
        
        //testing length case
        System.out.println("createBWExercises length case");
        controller instanceLen = new controller();
        ArrayList<String> resultLen = instance.createBWExercises();
        int expectedSize = 15;
        assertEquals(expectedSize, resultLen.size()); //correct length
        
        //testing to ensure it contains the correct exercises
        System.out.println("createBWExercises contains case");
        ArrayList<String> BWExercises = new ArrayList<String>(); 
        BWExercises.add("push ups");
        BWExercises.add("small arm circles");
        BWExercises.add("tricep dips");
        BWExercises.add("plank with shoulder taps");
        BWExercises.add("bear crawl");
        BWExercises.add("squats");
        BWExercises.add("calf raises");
        BWExercises.add("pulsing squats");
        BWExercises.add("reverse lunge");
        BWExercises.add("glute bridges");
        BWExercises.add("mountain climbers");
        BWExercises.add("crunches");
        BWExercises.add("russian twists");
        BWExercises.add("leg lifts");
        BWExercises.add("burpees");
        Collections.sort(BWExercises);
        Collections.sort(result);
        assertEquals(BWExercises, result); //array has correct elements
    }
    
     /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testCreateGymExercises() {
        //testing null case
        System.out.println("createGymExercises null case");
        controller instance = new controller();
        ArrayList<String> result = instance.createGymExercises();
        assertNotNull(result);
        
        //testing length case
        System.out.println("createBWExercises length case");
        controller instanceSize = new controller();
        ArrayList<String> resultSize = instance.createGymExercises();
        int expectedResult = 12;
        assertEquals(expectedResult, resultSize.size()); //correct length
        
        System.out.println("createBWExercises contains case");
        ArrayList<String> GymExercises = new ArrayList<String>(); 
        GymExercises.add("Pull Ups");
        GymExercises.add("Bent Over Rows");
        GymExercises.add("cable pull");
        GymExercises.add("medicine ball slams");
        GymExercises.add("arm curls");
        GymExercises.add("back squat");
        GymExercises.add("front squat");
        GymExercises.add("sumo squat");
        GymExercises.add("box jumps");
        GymExercises.add("side lunge");
        GymExercises.add("abs machine");
        GymExercises.add("leg press");
        Collections.sort(GymExercises);
        Collections.sort(result);
        assertEquals(GymExercises, result); //array has correct elements

    }
    
    /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testCardioWorkout() {
        //testing null case
        System.out.println("cardioWorkout");
        controller instance = new controller();
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> result = instance.cardioWorkout(modelMock, createdWorkout, viewMock);
        assertNotNull(result);
        
        createdWorkout.clear();
        assertTrue(createdWorkout.isEmpty());
    }
    
    /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testBodyWeightWorkout() {
        //testing null case
        System.out.println("bodyWeightWorkout");
        controller instance = new controller();
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> BWExercises = new ArrayList<String>();
        ArrayList<String> result = instance.bodyWeightWorkout(modelMock, createdWorkout, BWExercises);
        assertNotNull(result);
    }
    
     /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testGymWorkout() {
        //testing null case
        System.out.println("gymWorkout");
        controller instance = new controller();
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> GymExercises = new ArrayList<String>();
        ArrayList<String> result = instance.gymWorkout(modelMock, createdWorkout, GymExercises);
        assertNotNull(result);
    }
    
     /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testSetWorkout() {
        //testing null case
        System.out.println("setWorkout");
        controller instance = new controller();
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> GymExercises = new ArrayList<String>();
        ArrayList<String> BWExercises = new ArrayList<String>();
        String result = instance.setWorkout(modelMock, createdWorkout, BWExercises, GymExercises, viewMock);
        assertNotNull(result);
    }

    
}
