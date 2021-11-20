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
import javafx.scene.control.Button;

/**
 *
 * @author jrrou
 */
public class controllerTest {
    private workoutModel modelMock;
    private homePageView viewMock;
    
    public controllerTest() {
        workoutModel modelMock = mock(workoutModel.class);
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
        System.out.println("cardio null case");
        controller instance = new controller();
        workoutModel model = new workoutModel();
        model.setTime(20);
        model.setWrkTemp(1);
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> result = instance.cardioWorkout(model, createdWorkout, viewMock);
        assertNotNull(result);
    }
    
    /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testBodyWeightWorkout() {
        //testing null case
        System.out.println("bodyWeightWorkout null case");
        controller instance = new controller();
        workoutModel model = new workoutModel();
        model.setTime(20);
        model.setWrkTemp(2);
        model.setEquip(1);
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> BWExercises = new ArrayList<String>();
        BWExercises = instance.createBWExercises();
        ArrayList<String> result = instance.bodyWeightWorkout(model, createdWorkout, BWExercises);
        assertNotNull(result);
        
        //testing length case
        System.out.println("bodyWeightWorkout length case");
        controller instance1 = new controller();
        workoutModel model1 = new workoutModel();
        workoutModel model2 = new workoutModel();
        model1.setTime(20);
        model1.setWrkTemp(2);
        model1.setEquip(1);
        model2.setTime(40);
        model2.setWrkTemp(2);
        model2.setEquip(1);
        int expectedResult = 5;
        int expectedResult2 = 10;
        ArrayList<String> createdWorkout1 = new ArrayList<String>();
        ArrayList<String> createdWorkout2 = new ArrayList<String>();
        ArrayList<String> BWExercises1 = new ArrayList<String>();
        BWExercises1 = instance.createBWExercises();
        ArrayList<String> result1 = instance.bodyWeightWorkout(model1, createdWorkout1, BWExercises1);
        ArrayList<String> result2 = instance.bodyWeightWorkout(model2, createdWorkout2, BWExercises1);
        ArrayList<String> result3 = instance.bodyWeightWorkout(model1, createdWorkout1, BWExercises1);
        assertEquals(expectedResult, result1.size()); //correct length for time 20
        assertEquals(expectedResult2, result2.size()); //correct length for time 40
        assertNotEquals(expectedResult2, result3.size()); // edge case if time and length are incorrect
    }
    
     /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testGymWorkout() {
        //testing null case
        System.out.println("gymWorkout null case");
        controller instance = new controller();
        workoutModel model = new workoutModel();
        model.setTime(20);
        model.setWrkTemp(2);
        model.setEquip(2);
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> result = instance.gymWorkout(model, createdWorkout, instance.createGymExercises());
        assertNotNull(result);
        
        //testing length case
        System.out.println("gymWorkout length case");
        controller instance1 = new controller();
        workoutModel model1 = new workoutModel();
        workoutModel model2 = new workoutModel();
        model1.setTime(20);
        model1.setWrkTemp(2);
        model1.setEquip(2);
        model2.setTime(40);
        model2.setWrkTemp(2);
        model2.setEquip(2);
        int expectedResult = 5;
        int expectedResult2 = 10;
        ArrayList<String> createdWorkout1 = new ArrayList<String>();
        ArrayList<String> createdWorkout2 = new ArrayList<String>();
        ArrayList<String> result1 = instance.gymWorkout(model1, createdWorkout1, instance.createGymExercises());
        ArrayList<String> result2 = instance.gymWorkout(model2, createdWorkout2, instance.createGymExercises());
        ArrayList<String> result3 = instance.gymWorkout(model1, createdWorkout1, instance.createGymExercises());
        assertEquals(expectedResult, result1.size()); //correct length for time 20
        assertEquals(expectedResult2, result2.size()); //correct length for time 40
        assertNotEquals(expectedResult2, result3.size()); // edge case if time and length are incorrect
    }
    
     /**
     * Test of createBWExercises method, of class controller.
     */
    @Test
    public void testSetWorkout() {
        //testing null case
        System.out.println("setWorkout null case");
        controller instance = new controller();
        workoutModel model = new workoutModel();
        model.setTime(20);
        model.setWrkTemp(2);
        model.setEquip(1);
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> GymExercises = new ArrayList<String>();
        GymExercises = instance.createGymExercises();
        ArrayList<String> BWExercises = new ArrayList<String>();
        BWExercises = instance.createBWExercises();
        String result = instance.setWorkout(model, createdWorkout, BWExercises, GymExercises, viewMock);
        assertNotNull(result);
    }

    /**
     * Test of arrayToString method, of class controller.
     */
    @Test
    public void testArrayToString() {
        System.out.println("arrayToString null case");
        ArrayList<String> createdWorkout = null;
        Boolean b40 = null;
        controller instance = new controller();
        String result = instance.arrayToString(instance.createGymExercises(), true, false);
        assertNotNull(result);
    }


}




//     /**
//     * Test of createBWExercises method, of class controller.
//     */
//    @Test
//    public void testGymWorkout() {
//        //testing null case
//        System.out.println("gymWorkout");
//        controller instance = new controller();
//        ArrayList<String> createdWorkout = new ArrayList<String>();
//        ArrayList<String> GymExercises = new ArrayList<String>();
//        ArrayList<String> result = instance.gymWorkout(modelMock, createdWorkout, GymExercises);
//        assertNotNull(result);
//    }
//    