/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project;
import se330project.Models.workoutModel;
import se330project.Views.homePageView;
//import se330project.Views.homePageView;
//import se330project.Controllers.workoutController;

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




//public class Se330Project extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        homePageView view = new homePageView();
//        workoutController controller = new workoutController(view);
//        primaryStage.setTitle("WorkIT");
//        primaryStage.getIcons().add(new Image(getClass().getResource("/img/EdenCodingIcon.png").toExternalForm()));
//        primaryStage.setScene(new Scene(view.getView()));
//        primaryStage.show();
//    }
//    
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//}









/**
 *
 * @author jrrou
 */
public class Se330Project extends Application {
    
    //Variables that will hold time, type and equipment of the workout
    int Time = 0;
    int equip = 0;
    int wrkTemp = 0;
    int numEx = 0;
    String word = "";
    String workout = "";
    boolean clickCheck = false;
    //boolean checkTime20 = false;
    //boolean checkTime40 = false;

    
    @Override
    public void start(Stage primaryStage) {
        
        homePageView view = new homePageView();
        
        //Body weight exercises list
        ArrayList<String> BWExercises = new ArrayList<String>(); 
        BWExercises.add("push ups");
        BWExercises.add("squats");
        BWExercises.add("pull ups");
        BWExercises.add("calf raises");
        BWExercises.add("pulsing squats");
        
        //Gym exercises list
        ArrayList<String> GymExercises = new ArrayList<String>(); 
        GymExercises.add("machine 1");
        GymExercises.add("machine 2");
        GymExercises.add("machine 3");
        GymExercises.add("machine 4");
        GymExercises.add("machine 5");
        
        //New created workout list
        ArrayList<String> createdWorkout = new ArrayList<String>(); 

        
        //Button for 20 minute workout
        view.getbtnTime20().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Time = 20;
                System.out.println("Hello World!!");
                System.out.println(Time);
                //checkTime20 = true;
                clickCheck = true;
                disableButton(clickCheck, view.getbtnTime40());
            }
        });
        
        //Button for 40 minute workout 
        view.getbtnTime40().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Time = 40;
                //checkTime40 = true;
                System.out.println(Time);
            }
        });
        
        //Button for cardio workout
        view.getbtnTypeCardio().setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
                wrkTemp = 1;
                System.out.println(wrkTemp);
            }
        });
        
        //Button for lift workout
        view.getbtnTypeLift().setOnAction(new EventHandler<ActionEvent>() {          
            @Override
            public void handle(ActionEvent event) {
                wrkTemp = 2;
                System.out.println(wrkTemp);
            }
        });
        
        //Button for body weight workout
        view.getbtnEqpBody().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                equip = 1;
                System.out.println(equip);
            }
        });
        
        //Button for gym workout
        view.getbtnEqpGym().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                equip = 2;
                System.out.println(equip);
            }
        });
        
//-----------------LOGIC-----------------------------
        Time = 20; 
        wrkTemp = 2;
        equip = 1;
        
        //Shuffle exercises to mix up order
        Collections.shuffle(BWExercises);
        Collections.shuffle(GymExercises);
        
        //20 MIN WORKOUT
        if (Time == 20){
            numEx = 2; 
            if (wrkTemp == 1){ //CARDIO
                cardioWorkout(Time);
            }
            if (wrkTemp == 2){ //LIFT
                if (equip == 1){//body weight
                    bodyWeightWorkout(Time, createdWorkout, BWExercises);
                }else if (equip == 2){ //gym
                    gymWorkout(Time, createdWorkout, GymExercises);
                }
            }
        }
        //40 MIN WORKOUT
        if (Time == 40){
            numEx = 3;
            if (wrkTemp == 1){ //CARDIO
                cardioWorkout(Time);
            }else if (wrkTemp == 2){ //LIFT
                if (equip == 1){//body weight
                    bodyWeightWorkout(Time, createdWorkout, BWExercises);
                }else if (equip == 2){ //gym
                    gymWorkout(Time, createdWorkout, GymExercises);
                }
            }
        }
        
//Code for disabling buttons after clicks
//        if (checkTime20 == true){
//            System.out.println("made it");
//            btnTime40.setDisable(true);
//        }else{
//            System.out.println("made it2");
//            btnTime40.setDisable(false);
//        }
//        
//        if (checkTime40 == true){
//            System.out.println("made i3t");
//            btnTime20.setDisable(true);
//        }else{
//            System.out.println("made i4t");
//            btnTime20.setDisable(false);
//        }
        
        //creating gridpane
        GridPane root = new GridPane();
        root.setHgap(20);
        root.setVgap(20);
        
        //Adding buttons to gridpane
        root.add(view.getbtnTime20(), 0, 0, 1, 1);
        root.add(view.getbtnTime40(), 1, 0, 1, 1);
        root.add(view.getbtnTypeCardio(), 1, 1, 1, 1);  
        root.add(view.getbtnTypeLift(), 0, 1, 1, 1);
        root.add(view.getbtnEqpBody(), 1, 2, 1, 1);
        root.add(view.getbtnEqpGym(), 0, 2, 1, 1);

        //creating scene
        Scene scene = new Scene(root, 240, 100);
        primaryStage.setTitle("workIT");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
 //METHODS FOR LOGIC------------------------------------------------------
    public String cardioWorkout(int Time){
        if (Time == 20){
            workout = "Go for a 20 minute run outside.";
        }
        if (Time == 40){
            workout = "Go for a 40 minute run outside.";
        }
        System.out.println(workout);
        return workout;
    }
    
    public ArrayList<String> bodyWeightWorkout(int Time, ArrayList<String> createdWorkout, ArrayList<String> BWExercises){
        if (Time == 20){
            int index = 0;
            //choose exercises from body weight list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(BWExercises.get(index));
                index++;
            } 
        }
        if (Time == 40){
            int index = 0;
            //choose exercises from body weight list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(BWExercises.get(index));
                index++;
            }                 
        }
        System.out.println(createdWorkout);
        return (createdWorkout);
    }
    
    public ArrayList<String> gymWorkout(int Time, ArrayList<String> createdWorkout, ArrayList<String> GymExercises){
        if (Time == 20){
            int index = 0;
            //choose exercises from gym list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(GymExercises.get(index));
                index++;
            } 
        }
        if (Time == 40){
            int index = 0;
            //choose exercises from gym list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(GymExercises.get(index));
                index++;
            }                 
        }
        System.out.println(createdWorkout);
        return (createdWorkout);
    }
    
    public Button disableButton(Boolean clickCheck, Button btn){
        if (clickCheck = true){
            btn.setDisable(true);
        }
        return btn;
    }
    
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
    
    public int getType(){
        return wrkTemp;
    }
    
    public int getEquip(){
        return equip;
    }
    
    public int getTime(){
        return Time;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }
    
}





//package se330project;
//import se330project.Models.workoutModel;
//import se330project.Views.homePageView;
//import se330project.Controllers.workoutController;
//
//
//public class Se330Project{
//
//    public static void main(String[] args){
//        workoutModel model = retriveWorkoutFromDatabase();
//        homePageView view = new homePageView();
//        workoutController controller = new workoutController(model, view);
//        controller.updateView();
//    }
//   
//    public static workoutModel retriveWorkoutFromDatabase(){
//        workoutModel model = new workoutModel();
//        model.setTime(3);
//        model.setType("Lift");
//        model.setEquipment("Body Weight");
//        return model;
//    }
// //launch(args);
//    
//}
