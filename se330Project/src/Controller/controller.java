/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Imports and packages
package Controller;
import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import se330project.Models.workoutModel;
import se330project.Views.homePageView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
/**
 *
 * @author jrrou
 */
//This stands as the controller class for the homepage of the application (logic)
public class controller {
    
 //-----------------------METHODS FOR CREATING EXERCISE LISTS------------------------------------- 
        //Medthod to create the array of bodyweight exercises
        public ArrayList<String> createBWExercises(){
        ArrayList<String> BWExercises = new ArrayList<String>(); 
        //Arm exercises
        BWExercises.add("Push Ups");
        BWExercises.add("Small Arm Circles");
        BWExercises.add("Tricep Dips");
        BWExercises.add("Plank With Shoulder Taps");
        BWExercises.add("Bear Crawl");
        //Leg exercises
        BWExercises.add("Squats");
        BWExercises.add("Calf Raises");
        BWExercises.add("Pulsing Squats");
        BWExercises.add("Reverse Lunge");
        BWExercises.add("Glute Bridges");
        //Ab exercises
        BWExercises.add("Mountain Climbers");
        BWExercises.add("Crunches");
        BWExercises.add("Russian Twists");
        BWExercises.add("Leg Lifts");
        BWExercises.add("Burpees");
        //Shuffle for random order to create different workouts
        Collections.shuffle(BWExercises); 
        return BWExercises;
    }

    //method to create gym exercise list
    public ArrayList<String> createGymExercises(){
        //Arm exercises
        ArrayList<String> GymExercises = new ArrayList<String>(); 
        GymExercises.add("Pull Ups");
        GymExercises.add("Bent Over Rows");
        GymExercises.add("Cable Pull");
        GymExercises.add("Medicine Ball Slams");
        GymExercises.add("Arm Curls");
        //Leg exercises
        GymExercises.add("Back Squat");
        GymExercises.add("Front Squat");
        GymExercises.add("Sumo Squat");
        GymExercises.add("Box Jumps");
        GymExercises.add("Side Lunge");
        //Ab exercises
        GymExercises.add("Abs Machine");
        GymExercises.add("Leg Press");
        //Shuffle for random order to create different workouts
        Collections.shuffle(GymExercises);
        return GymExercises;
    }
    
    //Method to create cardio list for 20 minutes
    public ArrayList<String> createCardioList20(){
        ArrayList<String> cardioList = new ArrayList<String>(); 
        cardioList.add(" 5 Min Walk \n 5 Min Jog \n 5 min Walk \n 5 Min Jog");
        cardioList.add(" 5 Min Walk \n 20 Burpees \n 5 Min Walk \n 20 Burpees \n 5 Min Walk");
        cardioList.add(" 5 Min Jog \n 5 Min Walk \n 20 Squats \n 20 Burpees \n 20 Push Ups \n 2 Min Jog");
        cardioList.add(" 20 Squats \n 20 Burpees \n 20 Push Ups \n 10 Min Run \n 20 Squats \n 20 Burpees \n 20 Push Ups \n 5 Min Run");
        //Shuffle for random order to create different workouts
        Collections.shuffle(cardioList);
        return cardioList;
    }
    
    //Method to create cardio list for 40 minutes
    public ArrayList<String> createCardioList40(){
        ArrayList<String> cardioList40 = new ArrayList<String>(); 
        cardioList40.add(" 10 Min Walk \n 20 Squats \n 20 Push Ups \n 5 Burpees \n 10 Min Walk \n 20 Squats \n 20 Push Ups \n 5 Burpees");
        cardioList40.add(" 5 Min Walk \n 20 Squats \n 20 Push Ups \n 10 Burpees \n 10 Min Jog \n 5 Min Walk \n 20 Squats \n 20 Push Ups \n 10 Burpees \n 5 Min Walk \n 5 Min Jog");
        cardioList40.add(" 5 Min Jog \n 20 Squats \n 20 Push Ups \n 20 Burpees \n 10 Min Jog \n 20 Squats \n 20 Push Ups \n 20 Burpees \n 10 Min Jog \n 5 Min Walk \n 20 Squats \n 20 Push Ups \n 20 Burpees");
        //Shuffle for random order to create different workouts
        Collections.shuffle(cardioList40);
        return cardioList40;
    }
    
    
 //-----------------------------------METHODS FOR LOGIC------------------------------------------------------
    
    //Method to enable Go button when all preferences have been selected 
    public void turnGoOn(workoutModel model, homePageView view){
        if (model.getTime() != 0 && model.getEquip() != 0 && model.getWrkTemp() != 0){
            view.getbtnGenerate().setDisable(false);
        }else if (model.getTime() != 0 && model.getWrkTemp() == 1){ //Cardio case - won't need to specify getEquip()
            view.getbtnGenerate().setDisable(false);
        }
    }
    
    //Method to create a cardio workout
    public ArrayList<String> cardioWorkout(workoutModel model, ArrayList<String> createdWorkout, homePageView view){
        String workout = "";
        if (model.getTime() == 20){  
            int index = 0;
            int numEx = 1;
            //choose exercises from cardio list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(createCardioList20().get(index));
                index++;
            }
        }
        if (model.getTime() == 40){
            int index = 0;
            int numEx = 1;
            //choose exercises from cardio list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(createCardioList40().get(index));
                index++;
            }
        }
        if (model.getTime() != 0 && model.getEquip() != 0 && model.getWrkTemp() != 0){
            view.getbtnGenerate().setDisable(false); //enable go button once all perferences have been set
        }
        return createdWorkout;
    }
    
    //Method to create a bodyweight workout 
    public ArrayList<String> bodyWeightWorkout(workoutModel model, ArrayList<String> createdWorkout, ArrayList<String> BWExercises){
        if (model.getTime() == 20){
            int numEx = 5;
            int index = 0;
            //choose exercises from body weight list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(BWExercises.get(index));
                index++;   
            } 
        }
        if (model.getTime() == 40){
            int index = 0;
            int numEx = 10;
            //choose exercises from body weight list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(BWExercises.get(index));
                index++;
            }                 
        }
        return (createdWorkout);
    }
    
    //Method to create a gym workout
    public ArrayList<String> gymWorkout(workoutModel model, ArrayList<String> createdWorkout, ArrayList<String> GymExercises){
        if (model.getTime() == 20){
            int index = 0;
            int numEx = 5;
            //choose exercises from gym list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(GymExercises.get(index));
                index++;
            } 
        }
        if (model.getTime() == 40){
            int index = 0;
            int numEx = 10;
            //choose exercises from gym list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(GymExercises.get(index));
                index++;
            }                 
        }
        return (createdWorkout);
    }
    
    //Method to actually create and return the entire correct workout based on user preferences 
    public String setWorkout(workoutModel model, ArrayList<String> createdWorkout, ArrayList<String> BWExercises, ArrayList<String> GymExercises, homePageView view){ 
        String output1 = "";
        ArrayList<String> newList = new ArrayList();
        Boolean b40 = true; //Temp variable to signify 40minute workouts 
        //20 MINUTE WORKOUTS
        if (model.getTime() == 20){ 
            if (model.getWrkTemp() == 1){ //CARDIO
                cardioWorkout(model, createdWorkout, view);
                output1 = arrayToString(createdWorkout, b40, true);
            }
            if (model.getWrkTemp() == 2){ //LIFT
                if (model.getEquip() == 1){//BODY WEIGHT
                    bodyWeightWorkout(model, createdWorkout, BWExercises);
                    output1 = arrayToString(createdWorkout, b40, false);
                }if (model.getEquip() == 2){ //GYM
                    gymWorkout(model, createdWorkout, GymExercises);
                    output1 = arrayToString(createdWorkout, b40, false);
                }
            }
        }
        //40 MIN WORKOUT
        if (model.getTime() == 40){
            b40 = false;
            if (model.getWrkTemp() == 1){ //CARDIO
                cardioWorkout(model, createdWorkout, view);
                output1 = arrayToString(createdWorkout, b40, true);
            }if (model.getWrkTemp() == 2){ //LIFT
                if (model.getEquip() == 1){//BODY WEIGHT
                    bodyWeightWorkout(model, createdWorkout, BWExercises);
                    output1 = arrayToString(createdWorkout, b40, false);
                }if (model.getEquip() == 2){ //GYM
                    gymWorkout(model, createdWorkout, GymExercises);
                    output1 = arrayToString(createdWorkout, b40, false);
                }
            }
        }
        return output1;
    }
    
    //Method to convert array to string
    public String arrayToString(ArrayList<String> createdWorkout, Boolean b40, Boolean isCardio){
        String output = "";
        for (int i = 0; i < createdWorkout.size(); i++){
            output += createdWorkout.get(i);
            output += "\n";
            if (b40 == false){
                if (i == 4){
                    output += "______________________________________";
                    output += "\n";
                    output += "x4 ROUNDS! -1 Minute per Exercise";
                    output += "\n"; 
                    output += "\n"; 
                }
            }
        }
        //If not a cardio workout
        if (isCardio == false){
            output += "______________________________________";
            output += "\n";
            output += "x4 ROUNDS! -1 Minute per Exercise";
            output += "\n"; 
        }
        output = "---------------WORKOUT--------------" + "\n" + output;
        
        return output;
    }
    
    //Method to disable buttons
    public Button disableButton(Boolean clickCheck, Button btn){
        if (clickCheck = true){
            btn.setDisable(true);
        }
        return btn;
    }
    
    //Method to reset buttons and allow user to generate a new workout with new preferences 
    public void resetWorkout(homePageView view, workoutModel model, ArrayList<String> BWExercises, ArrayList<String> GymExercises, ArrayList<String> createdWorkout, TextArea newArea){
        newArea.setWrapText(true);
        view.getbtnEqpBody().setDisable(false);
        view.getbtnEqpGym().setDisable(false);
        view.getbtnTime20().setDisable(false);
        view.getbtnTime40().setDisable(false);
        view.getbtnTypeLift().setDisable(false);
        view.getbtnTypeCardio().setDisable(false);
        newArea.setText("");
        model.setTime(0);
        model.setEquip(0);
        model.setWrkTemp(0);
        createdWorkout.clear();
        view.getbtnGenerate().setDisable(true);
    }    
}
