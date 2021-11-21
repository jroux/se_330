/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Imports and packages
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
//Unit testing file that tests the controller for home page functions
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
        BWExercises.add("Push Ups");
        BWExercises.add("Small Arm Circles");
        BWExercises.add("Tricep Dips");
        BWExercises.add("Plank With Shoulder Taps");
        BWExercises.add("Bear Crawl");
        BWExercises.add("Squats");
        BWExercises.add("Calf Raises");
        BWExercises.add("Pulsing Squats");
        BWExercises.add("Reverse Lunge");
        BWExercises.add("Glute Bridges");
        BWExercises.add("Mountain Climbers");
        BWExercises.add("Crunches");
        BWExercises.add("Russian Twists");
        BWExercises.add("Leg Lifts");
        BWExercises.add("Burpees");
        Collections.sort(BWExercises);
        Collections.sort(result);
        assertEquals(BWExercises, result); //array has correct elements
    }
    
     /**
     * Test of createGymExercises method, of class controller.
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
        GymExercises.add("Cable Pull");
        GymExercises.add("Medicine Ball Slams");
        GymExercises.add("Arm Curls");
        GymExercises.add("Back Squat");
        GymExercises.add("Front Squat");
        GymExercises.add("Sumo Squat");
        GymExercises.add("Box Jumps");
        GymExercises.add("Side Lunge");
        GymExercises.add("Abs Machine");
        GymExercises.add("Leg Press");
        Collections.sort(GymExercises);
        Collections.sort(result);
        assertEquals(GymExercises, result); //array has correct elements

    }
    
     /**
     * Test of createCardioList20 method, of class controller.
     */
    @Test
    public void testCreateCardioList20() {
        //testing null case
        System.out.println("createCardioList20 null case");
        controller instance = new controller();
        ArrayList<String> result = instance.createCardioList20();
        System.out.println(result);
        assertNotNull(result);
        
        //testing length case
        System.out.println("createCardioList20 length case");
        controller instanceLen = new controller();
        ArrayList<String> resultLen = instance.createCardioList20();
        int expectedSize = 4;
        assertEquals(expectedSize, resultLen.size()); //correct length
        
        //testing to ensure it contains the correct exercises
        System.out.println("createCardioList20 contains case");
        ArrayList<String> cardioList = new ArrayList<String>(); 
        cardioList.add(" 5 Min Walk \n 5 Min Jog \n 5 min Walk \n 5 Min Jog");
        cardioList.add(" 5 Min Walk \n 20 Burpees \n 5 Min Walk \n 20 Burpees \n 5 Min Walk");
        cardioList.add(" 5 Min Jog \n 5 Min Walk \n 20 Squats \n 20 Burpees \n 20 Push Ups \n 2 Min Jog");
        cardioList.add(" 20 Squats \n 20 Burpees \n 20 Push Ups \n 10 Min Run \n 20 Squats \n 20 Burpees \n 20 Push Ups \n 5 Min Run");
        Collections.sort(cardioList);
        Collections.sort(result);
        assertEquals(cardioList, result); //array has correct elements
    }
    
     /**
     * Test of createCardioList40 method, of class controller.
     */
    @Test
    public void testCreateCardioList40() {
        //testing null case
        System.out.println("createCardioList40 null case");
        controller instance = new controller();
        ArrayList<String> result = instance.createCardioList40();
        System.out.println(result);
        assertNotNull(result);
        
        //testing length case
        System.out.println("createCardioList40 length case");
        controller instanceLen = new controller();
        ArrayList<String> resultLen = instance.createCardioList40();
        int expectedSize = 3;
        assertEquals(expectedSize, resultLen.size()); //correct length
        
        //testing to ensure it contains the correct exercises
        System.out.println("createCardioList40 contains case");
        ArrayList<String> cardioList40 = new ArrayList<String>(); 
        cardioList40.add(" 10 Min Walk \n 20 Squats \n 20 Push Ups \n 5 Burpees \n 10 Min Walk \n 20 Squats \n 20 Push Ups \n 5 Burpees");
        cardioList40.add(" 5 Min Walk \n 20 Squats \n 20 Push Ups \n 10 Burpees \n 10 Min Jog \n 5 Min Walk \n 20 Squats \n 20 Push Ups \n 10 Burpees \n 5 Min Walk \n 5 Min Jog");
        cardioList40.add(" 5 Min Jog \n 20 Squats \n 20 Push Ups \n 20 Burpees \n 10 Min Jog \n 20 Squats \n 20 Push Ups \n 20 Burpees \n 10 Min Jog \n 5 Min Walk \n 20 Squats \n 20 Push Ups \n 20 Burpees");
        Collections.sort(cardioList40);
        Collections.sort(result);
        assertEquals(cardioList40, result); //array has correct elements
    }
    
    /**
     * Test of CardioWorkout method, of class controller.
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
        
        //Testing length case
        System.out.println("cardio length case");
        controller instance1 = new controller();
        workoutModel model1 = new workoutModel();
        workoutModel model2 = new workoutModel();
        model1.setTime(20);
        model1.setWrkTemp(1);
        model2.setTime(40);
        model2.setWrkTemp(1);
        int expectedResult = 1;
        int unexpected = 3;
        ArrayList<String> createdWorkout1 = new ArrayList<String>();
        ArrayList<String> createdWorkout2 = new ArrayList<String>();
        ArrayList<String> result1 = instance1.cardioWorkout(model1, createdWorkout1, viewMock);
        ArrayList<String> result2 = instance1.cardioWorkout(model2, createdWorkout2, viewMock);
        ArrayList<String> result3 = instance1 .cardioWorkout(model1, createdWorkout1, viewMock);
        assertEquals(expectedResult, result1.size()); //Correct length for time 20
        assertEquals(expectedResult, result2.size()); //Correct length for time 40
        assertNotEquals(unexpected, result3.size()); //Edge case if time and length are incorrect
    }
    
    /**
     * Test of bodyWeightWorkout method, of class controller.
     */
    @Test
    public void testBodyWeightWorkout() {
        //Testing null case
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
        
        //Testing length case
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
        assertEquals(expectedResult, result1.size()); //Correct length for time 20
        assertEquals(expectedResult2, result2.size()); //Correct length for time 40
        assertNotEquals(expectedResult2, result3.size()); //Edge case if time and length are incorrect
    }
    
     /**
     * Test of gymWorkout method, of class controller.
     */
    @Test
    public void testGymWorkout() {
        //Testing null case
        System.out.println("gymWorkout null case");
        controller instance = new controller();
        workoutModel model = new workoutModel();
        model.setTime(20);
        model.setWrkTemp(2);
        model.setEquip(2);
        ArrayList<String> createdWorkout = new ArrayList<String>();
        ArrayList<String> result = instance.gymWorkout(model, createdWorkout, instance.createGymExercises());
        assertNotNull(result);
        
        //Testing length case
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
        assertEquals(expectedResult, result1.size()); //Correct length for time 20
        assertEquals(expectedResult2, result2.size()); //Correct length for time 40
        assertNotEquals(expectedResult2, result3.size()); //Edge case if time and length are incorrect
    }
    
     /**
     * Test of setWorkout method, of class controller.
     */
    @Test
    public void testSetWorkout() {
        //Testing null case
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