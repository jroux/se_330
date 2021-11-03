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
import static org.mockito.Mockito.mock;
import se330project.Se330Project;
import se330project.Models.workoutModel;
import se330project.Views.homePageView;

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
        System.out.println("createBWExercises");
        controller instance = new controller();
        ArrayList<String> result = instance.createBWExercises();
        assertNotNull(result);

    }
    
     /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testCreateGymExercises() {
        System.out.println("createGymExercises");
        controller instance = new controller();
        ArrayList<String> result = instance.createGymExercises();
        assertNotNull(result);

    }
    
    /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testCardioWorkout() {
        System.out.println("cardioWorkout");
        controller instance = new controller();
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> result = instance.cardioWorkout(modelMock, createdWorkout, viewMock);
        assertNotNull(result);
    }
    
    /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testBodyWeightWorkout() {
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
        System.out.println("setWorkout");
        controller instance = new controller();
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> GymExercises = new ArrayList<String>();
        ArrayList<String> BWExercises = new ArrayList<String>();
        String result = instance.setWorkout(modelMock, createdWorkout, BWExercises, GymExercises, viewMock);
        assertNotNull(result);
    }

    
}
