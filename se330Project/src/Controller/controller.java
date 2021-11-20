/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.util.Random;
/**
 *
 * @author jrrou
 */
public class controller {
    
    
        public ArrayList<String> createBWExercises(){
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
        
        Collections.shuffle(BWExercises); //shuffle for random order
        return BWExercises;
    }
        
 //-----------------------METHODS FOR CREATING EXERCISE LISTS-------------------------------------   
    //creating body weight exercise list
    
    //create gym exercise list
    public ArrayList<String> createGymExercises(){
        //Gym exercises list
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
        
        Collections.shuffle(GymExercises); //shuffle for random order
        return GymExercises;
    }
    
    public ArrayList<String> createCardioList20(){
        ArrayList<String> cardioList = new ArrayList<String>(); 
        cardioList.add("5 Min Walk \n 5 Min Jog \n 5 min Walk \n 5 Min Jog");
        cardioList.add("5 Min Walk \n 20 Burpees \n 5 Min Walk \n 20 Burpees \n 5 Min Walk");
        cardioList.add("5 Min Jog \n 5 Min Walk \n 20 Squats \n 20 Burpees \n 20 Push Ups \n 2 Min Jog");
        cardioList.add("20 Squats \n 20 Burpees \n 20 Push Ups \n 10 Min Run \n 20 Squats \n 20 Burpees \n 20 Push Ups \n 5 Min Run");
        Collections.shuffle(cardioList);
        return cardioList;
    }
    
        public ArrayList<String> createCardioList40(){
        ArrayList<String> cardioList40 = new ArrayList<String>(); 
        cardioList40.add("10 Min Walk \n 20 Squats \n 20 Push Ups \n 5 Burpees \n 10 Min Walk \n 20 Squats \n 20 Push Ups \n 5 Burpees");
        cardioList40.add("5 Min Walk \n 20 Squats \n 20 Push Ups \n 10 Burpees \n 10 Min Jog \n 5 Min Walk \n 20 Squats \n 20 Push Ups \n 10 Burpees \n 5 Min Walk \n 5 Min Jog");
        cardioList40.add("5 Min Jog \n 20 Squats \n 20 Push Ups \n 20 Burpees \n 10 Min Jog \n 20 Squats \n 20 Push Ups \n 20 Burpees \n 10 Min Jog \n 5 Min Walk \n 20 Squats \n 20 Push Ups \n 20 Burpees");
        Collections.shuffle(cardioList40);
        return cardioList40;
    }
    
    
 //-----------------------------------METHODS FOR LOGIC------------------------------------------------------
    
    public void turnGoOn(workoutModel model, homePageView view){
        if (model.getTime() != 0 && model.getEquip() != 0 && model.getWrkTemp() != 0){
            view.getbtnGenerate().setDisable(false);
        }else if (model.getTime() != 0 && model.getWrkTemp() == 1){
            view.getbtnGenerate().setDisable(false);
        }
    }
    
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
            view.getbtnGenerate().setDisable(false);
        }
        return createdWorkout;
    }
    
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
    
    public String setWorkout(workoutModel model, ArrayList<String> createdWorkout, ArrayList<String> BWExercises, ArrayList<String> GymExercises, homePageView view){ 
        String output1 = ""; 
        ArrayList<String> newList = new ArrayList();
        Random rand = new Random();
        Boolean b40 = true;
        if (model.getTime() == 20){ 
            if (model.getWrkTemp() == 1){ //CARDIO
                cardioWorkout(model, createdWorkout, view);
                output1 = arrayToString(createdWorkout, b40, true);
            }
            if (model.getWrkTemp() == 2){ //LIFT
                if (model.getEquip() == 1){//body weight
                    bodyWeightWorkout(model, createdWorkout, BWExercises);
                    output1 = arrayToString(createdWorkout, b40, false);
                }if (model.getEquip() == 2){ //gym
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
                if (model.getEquip() == 1){//body weight
                    bodyWeightWorkout(model, createdWorkout, BWExercises);
                    output1 = arrayToString(createdWorkout, b40, false);
                }if (model.getEquip() == 2){ //gym
                    gymWorkout(model, createdWorkout, GymExercises);
                    output1 = arrayToString(createdWorkout, b40, false);
                }
            }
        }
        return output1;
    }
    
    public String arrayToString(ArrayList<String> createdWorkout, Boolean b40, Boolean isCardio){
        String output = "";
        for (int i = 0; i < createdWorkout.size(); i++){
            output += createdWorkout.get(i);
            output += "\n";
            if (b40 == false){
                if (i == 4){
                    System.out.println("old");
                    System.out.println(output);
                    output += "______________________________________";
                    output += "\n";
                    output += "x4 ROUNDS! -1 Minute per Exercise";
                    output += "\n"; 
                    output += "\n"; 
                    System.out.println("new");
                    System.out.println(output);
                }
            }
        }
        if (isCardio == false){
            output += "______________________________________";
            output += "\n";
            output += "x4 ROUNDS! -1 Minute per Exercise";
            output += "\n"; 
        }
        
        return output;
    }
    
    public Button disableButton(Boolean clickCheck, Button btn){
        if (clickCheck = true){
            btn.setDisable(true);
        }
        return btn;
    }
    
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
