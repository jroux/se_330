/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//imports and packages
package se330project;
import se330project.Models.workoutModel;
import se330project.Views.homePageView;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

/**
 *
 * @author jrrou
 */
public class Se330Project extends Application {
    
    //Variables
    String word = ""; //used to unit test aWord
    boolean clickCheck = false; //used to disable buttons
    ArrayList<String> printWorkout = new ArrayList<String>();
    Label wrkLabel = new Label(); //label to display workout on ui

    
    @Override
    public void start(Stage primaryStage) {
        
        //create view and model
        homePageView view = new homePageView();
        workoutModel model = new workoutModel();
        
        //New created workout list
        ArrayList<String> createdWorkout = new ArrayList<String>(); 
         
        
        
//--------------------------BUTTON ON CLICK EVENT-------------------------------------------------
        //Button for 20 minute workout
        view.getbtnTime20().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setTime(20);
                clickCheck = true;
                disableButton(clickCheck, view.getbtnTime40());
            }
        });
        
        //Button for 40 minute workout 
        view.getbtnTime40().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setTime(40);
                clickCheck = true;
                disableButton(clickCheck, view.getbtnTime20());
            }
        });
        
        //Button for cardio workout
        view.getbtnTypeCardio().setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
                model.setWrkTemp(1);
                turnGoOn(model, view);
                clickCheck = true;
                disableButton(clickCheck, view.getbtnTypeLift());
                disableButton(clickCheck, view.getbtnEqpBody());
                disableButton(clickCheck, view.getbtnEqpGym());
            }
        });
        
        //Button for lift workout
        view.getbtnTypeLift().setOnAction(new EventHandler<ActionEvent>() {          
            @Override
            public void handle(ActionEvent event) {
                model.setWrkTemp(2);
                turnGoOn(model, view);
                clickCheck = true;
                disableButton(clickCheck, view.getbtnTypeCardio());
            }
        });
        
        //Button for body weight workout
        view.getbtnEqpBody().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setEquip(1);
                turnGoOn(model, view);
                clickCheck = true;
                disableButton(clickCheck, view.getbtnEqpGym());
            }
        });
        
        //Button for gym workout
        view.getbtnEqpGym().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                model.setEquip(2);
                turnGoOn(model, view);
                clickCheck = true;
                disableButton(clickCheck, view.getbtnEqpBody());
            }
        });
        
        //Button to generate workout
        view.getbtnGenerate().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                wrkLabel.setText(setWorkout(model, createdWorkout, createBWExercises(), createGymExercises(), view));
               
            }
        });
        
        //Button to reset buttons
        view.getbtnReset().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                resetWorkout(view, model, createBWExercises(), createGymExercises(), createdWorkout);
            }
        });

//-------------------------SETTING UP SCENE--------------------------------------
        //creating gridpane
        GridPane root = new GridPane();
        root.setHgap(20);
        root.setVgap(20);
        root.add(wrkLabel, 0, 4, 1, 1);
        
        //Adding buttons to gridpane
        root.add(view.getbtnTime20(), 0, 0, 1, 1);
        root.add(view.getbtnTime40(), 1, 0, 1, 1);
        root.add(view.getbtnTypeCardio(), 1, 1, 1, 1);  
        root.add(view.getbtnTypeLift(), 0, 1, 1, 1);
        root.add(view.getbtnEqpBody(), 1, 2, 1, 1);
        root.add(view.getbtnEqpGym(), 0, 2, 1, 1);
        root.add(view.getbtnGenerate(), 0, 3, 1, 1);
        root.add(view.getbtnReset(), 1, 3, 1, 1);
        view.getbtnGenerate().setDisable(true);

        //creating scene
        Scene scene = new Scene(root, 240, 100);
        primaryStage.setTitle("workIT");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
 //-----------------------METHODS FOR CREATING EXERCISE LISTS-------------------------------------   
    //creating body weight exercise list
    public ArrayList<String> createBWExercises(){
        ArrayList<String> BWExercises = new ArrayList<String>(); 
        BWExercises.add("push ups");
        BWExercises.add("squats");
        BWExercises.add("pull ups");
        BWExercises.add("calf raises");
        BWExercises.add("pulsing squats");
        Collections.shuffle(BWExercises); //shuffle for random order
        return BWExercises;
    }
    
    //create gym exercise list
    public ArrayList<String> createGymExercises(){
        //Gym exercises list
        ArrayList<String> GymExercises = new ArrayList<String>(); 
        GymExercises.add("machine 1");
        GymExercises.add("machine 2");
        GymExercises.add("machine 3");
        GymExercises.add("machine 4");
        GymExercises.add("machine 5");
        Collections.shuffle(GymExercises); //shuffle for random order
        return GymExercises;
    }
    
    
 //-----------------------------------METHODS FOR LOGIC------------------------------------------------------
    
    public void turnGoOn(workoutModel model, homePageView view){
        if (model.getTime() != 0 && model.getEquip() != 0 && model.getWrkTemp() != 0){
            view.getbtnGenerate().setDisable(false);
        }if (model.getTime() != 0 && model.getWrkTemp() == 1){
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
            int numEx = 2;
            int index = 0;
            //choose exercises from body weight list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(BWExercises.get(index));
                index++;
                
            } 
        }
        if (model.getTime() == 40){
            int index = 0;
            int numEx = 3;
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
            int numEx = 2;
            //choose exercises from gym list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(GymExercises.get(index));
                index++;
            } 
        }
        if (model.getTime() == 40){
            int index = 0;
            int numEx = 3;
            //choose exercises from gym list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(GymExercises.get(index));
                index++;
            }                 
        }
        return (createdWorkout);
    }
    
    public String setWorkout(workoutModel model, ArrayList<String> createdWorkout, ArrayList<String> BWExercises, ArrayList<String> GymExercises, homePageView view){ 
        String output = ""; 
        if (model.getTime() == 20){ 
            if (model.getWrkTemp() == 1){ //CARDIO
                cardioWorkout(model, createdWorkout, view);
            }
            if (model.getWrkTemp() == 2){ //LIFT
                if (model.getEquip() == 1){//body weight
                    System.out.println("amde it");
                    bodyWeightWorkout(model, createdWorkout, BWExercises);
                }if (model.getEquip() == 2){ //gym
                    gymWorkout(model, createdWorkout, GymExercises);
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
        for (int i = 0; i < createdWorkout.size(); i++){
            output += createdWorkout.get(i);
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
    
    public void resetWorkout(homePageView view, workoutModel model, ArrayList<String> BWExercises, ArrayList<String> GymExercises, ArrayList<String> createdWorkout){
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
    
//--------------------------------PRACTICE UNIT TESTS-------------------------------------
    public static int addNums(int a, int b){
        return a + b;
    }
    
    public Boolean aWord(String word){
        if (word.contains("a")){
           return true;
        }
        else{
            return false;
        }
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }   
}
