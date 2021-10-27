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
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




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
    ArrayList<String> printWorkout = new ArrayList<String>();
    Label wrkLabel = new Label();

    
    @Override
    public void start(Stage primaryStage) {
        
        homePageView view = new homePageView();
        workoutModel model = new workoutModel();
        
        
        
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
        
        //Shuffle exercises to mix up order
        Collections.shuffle(BWExercises);
        Collections.shuffle(GymExercises);

        
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
                clickCheck = true;
                disableButton(clickCheck, view.getbtnTypeCardio());
            }
        });
        
        //Button for body weight workout
        view.getbtnEqpBody().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setEquip(1);
                clickCheck = true;
                disableButton(clickCheck, view.getbtnEqpGym());
            }
        });
        
        //Button for gym workout
        view.getbtnEqpGym().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                model.setEquip(2);
                clickCheck = true;
                disableButton(clickCheck, view.getbtnEqpBody());
            }
        });
        
        //Button to generate workout
        view.getbtnGenerate().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                //setWorkout(model, createdWorkout, BWExercises, GymExercises);
                wrkLabel.setText(setWorkout(model, createdWorkout, BWExercises, GymExercises).toString());
//                if (model.getTime() == 20){
//                    numEx = 2; 
//                if (model.getWrkTemp() == 1){ //CARDIO
//                    cardioWorkout(model, Time);
//                }
//                if (model.getWrkTemp() == 2){ //LIFT
//                    if (model.getEquip() == 1){//body weight
//                        bodyWeightWorkout(model, Time, createdWorkout, BWExercises);
//                }else if (model.getEquip() == 2){ //gym
//                    gymWorkout(model, Time, createdWorkout, GymExercises);
//                    }
//                }
//                }
//                //40 MIN WORKOUT
//                if (model.getTime() == 40){
//                    numEx = 3;
//                if (model.getWrkTemp() == 1){ //CARDIO
//                    cardioWorkout(model, Time);
//                }else if (model.getWrkTemp() == 2){ //LIFT
//                    if (model.getEquip() == 1){//body weight
//                        bodyWeightWorkout(model, Time, createdWorkout, BWExercises);
//                    }else if (model.getEquip() == 2){ //gym
//                        gymWorkout(model, Time, createdWorkout, GymExercises);
//                    }
//                    }
//                }
            }
        });
        
        //Button to reset buttons
//        view.getbtnReset().setOnAction(new EventHandler<ActionEvent>() {       
//            @Override
//            public void handle(ActionEvent event) {
//                int Time = 0;
//                int equip = 0;
//                int wrkTemp = 0;;
//                view.getbtnEqpBody().setDisable(false);
//                view.getbtnEqpGym().setDisable(false);
//                view.getbtnTime20().setDisable(false);
//                view.getbtnTime40().setDisable(false);
//                view.getbtnTypeLift().setDisable(false);
//                view.getbtnTypeCardio().setDisable(false);
//                Collections.shuffle(BWExercises);
//                Collections.shuffle(GymExercises);
//            }
//        });
        
        //creating gridpane
        GridPane root = new GridPane();
        root.setHgap(20);
        root.setVgap(20);
        
        root.add(wrkLabel, 0, 4, 1, 1);
        
        //Label wrkLabel = new Label("hi");
        
        
//        TextArea text = new TextArea();
//        text.setWrapText(true);

        
        //Adding buttons to gridpane
        root.add(view.getbtnTime20(), 0, 0, 1, 1);
        root.add(view.getbtnTime40(), 1, 0, 1, 1);
        root.add(view.getbtnTypeCardio(), 1, 1, 1, 1);  
        root.add(view.getbtnTypeLift(), 0, 1, 1, 1);
        root.add(view.getbtnEqpBody(), 1, 2, 1, 1);
        root.add(view.getbtnEqpGym(), 0, 2, 1, 1);
        root.add(view.getbtnGenerate(), 0, 3, 1, 1);
//        root.add(view.getbtnReset(), 1, 3, 1, 1);

        //creating scene
        Scene scene = new Scene(root, 240, 100);
        primaryStage.setTitle("workIT");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
 //METHODS FOR LOGIC------------------------------------------------------
    public String cardioWorkout(workoutModel model, int Time){
        if (model.getTime() == 20){
            workout = "Go for a 20 minute run outside.";
        }
        if (model.getTime() == 40){
            workout = "Go for a 40 minute run outside.";
        }
        System.out.println(workout);
        return workout;
    }
    
    public ArrayList<String> bodyWeightWorkout(workoutModel model, int Time, ArrayList<String> createdWorkout, ArrayList<String> BWExercises){
        if (model.getTime() == 20){
            int index = 0;
            //choose exercises from body weight list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(BWExercises.get(index));
                index++;
            } 
        }
        if (model.getTime() == 40){
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
    
    public ArrayList<String> gymWorkout(workoutModel model, int Time, ArrayList<String> createdWorkout, ArrayList<String> GymExercises){
        if (model.getTime() == 20){
            int index = 0;
            //choose exercises from gym list
            while (createdWorkout.size() < numEx){
                createdWorkout.add(GymExercises.get(index));
                index++;
            } 
        }
        if (model.getTime() == 40){
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
    
    public ArrayList<String> setWorkout(workoutModel model, ArrayList<String> createdWorkout, ArrayList<String> BWExercises, ArrayList<String> GymExercises){ 
        if (model.getTime() == 20){
            numEx = 2; 
        if (model.getWrkTemp() == 1){ //CARDIO
            cardioWorkout(model, Time);
        }
        if (model.getWrkTemp() == 2){ //LIFT
            if (model.getEquip() == 1){//body weight
                bodyWeightWorkout(model, Time, createdWorkout, BWExercises);
        }else if (model.getEquip() == 2){ //gym
            gymWorkout(model, Time, createdWorkout, GymExercises);
        }
        }
        }
        //40 MIN WORKOUT
        if (model.getTime() == 40){
            numEx = 3;
        if (model.getWrkTemp() == 1){ //CARDIO
            cardioWorkout(model, Time);
        }else if (model.getWrkTemp() == 2){ //LIFT
            if (model.getEquip() == 1){//body weight
                bodyWeightWorkout(model, Time, createdWorkout, BWExercises);
            }else if (model.getEquip() == 2){ //gym
                gymWorkout(model, Time, createdWorkout, GymExercises);
            }
            }
        }
        return createdWorkout;
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
    
//    public ArrayList<String> getWorkout(){
//        return printWorkout;
//    }
    
//    public int getType(){
//        return wrkTemp;
//    }
//    
//    public int getEquip(){
//        return equip;
//    }
//    
//    public int getTime(){
//        return Time;
//    }
    
    

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
