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
/**
 *
 * @author jrrou
 */
public class controller {
    
    
        public ArrayList<String> createBWExercises(){
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
        
        Collections.shuffle(GymExercises); //shuffle for random order
        return GymExercises;
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
            workout = "Go for a 20 minute run outside.";
        }
        if (model.getTime() == 40){
            workout = "Go for a 40 minute run outside.";
        }
        createdWorkout.add(workout);
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
        if (model.getTime() == 20){ 
            if (model.getWrkTemp() == 1){ //CARDIO
                cardioWorkout(model, createdWorkout, view);
            }
            if (model.getWrkTemp() == 2){ //LIFT
                if (model.getEquip() == 1){//body weight
                    bodyWeightWorkout(model, createdWorkout, BWExercises);
                    output1 = arrayToString(createdWorkout);
                    output1 += "\n";
                    output1 += "__________";
                    output1 += "\n";
                    output1 += "x4 ROUNDS! -1 Minute per Exercise";
                }if (model.getEquip() == 2){ //gym
                    gymWorkout(model, createdWorkout, GymExercises);
                    output1 = arrayToString(createdWorkout);
                    output1 += "\n";
                    output1 += "__________";
                    output1 += "\n";
                    output1 += "x4 ROUNDS! -1 Minute per Exercise";
                }
            }
        }
        //40 MIN WORKOUT
        if (model.getTime() == 40){
            if (model.getWrkTemp() == 1){ //CARDIO
                cardioWorkout(model, createdWorkout, view);
            }if (model.getWrkTemp() == 2){ //LIFT
                if (model.getEquip() == 1){//body weight
                    bodyWeightWorkout(model, createdWorkout, BWExercises);
                }if (model.getEquip() == 2){ //gym
                    gymWorkout(model, createdWorkout, GymExercises);
                }
            }
        }
        return output1;
    }
    
    public String arrayToString(ArrayList<String> createdWorkout){
        String output = "";
        for (int i = 0; i < createdWorkout.size(); i++){
            output = createdWorkout.get(i) + output;
            output = "\n" + output;
        }
        return output;
    }
    
    public Button disableButton(Boolean clickCheck, Button btn){
        if (clickCheck = true){
            btn.setDisable(true);
        }
        return btn;
    }
    
    public void resetWorkout(homePageView view, workoutModel model, ArrayList<String> BWExercises, ArrayList<String> GymExercises, ArrayList<String> createdWorkout){
        TextArea wrkLabel = new TextArea();
        wrkLabel.setWrapText(true);
        view.getbtnEqpBody().setDisable(false);
        view.getbtnEqpGym().setDisable(false);
        view.getbtnTime20().setDisable(false);
        view.getbtnTime40().setDisable(false);
        view.getbtnTypeLift().setDisable(false);
        view.getbtnTypeCardio().setDisable(false);
        wrkLabel.setText("");
        model.setTime(0);
        model.setEquip(0);
        model.setWrkTemp(0);
        createdWorkout.clear();
        view.getbtnGenerate().setDisable(true);
    }    
}
