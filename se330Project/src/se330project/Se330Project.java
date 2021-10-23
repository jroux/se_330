/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project;
import se330project.Models.workoutModel;
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
    int numEx = 0;
    int wrkTemp = 0;
    String type = "";
    int equip = 0;
    String word = "";
    boolean checkTime20 = false;
    boolean checkTime40 = false;

    
    @Override
    public void start(Stage primaryStage) {
        
        //Body weight exercises list
        ArrayList<String> BWExercises = new ArrayList<String>(); 
        BWExercises.add("push ups");
        BWExercises.add("squats");
        BWExercises.add("pull ups");
        BWExercises.add("calf raises");
        BWExercises.add("pulsing squats");
        
        ArrayList<String> GymExercises = new ArrayList<String>(); 
        GymExercises.add("machine 1");
        GymExercises.add("machine 2");
        GymExercises.add("machine 3");
        GymExercises.add("machine 4");
        GymExercises.add("machine 5");
        ArrayList<String> createdWorkout = new ArrayList<String>(); 

        
        //Button for 20 minute workout
        Button btnTime20 = new Button("20 Minutes");
        btnTime20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Time = 20;
                System.out.println("Hello World!!");
                System.out.println(Time);
                checkTime20 = true;
            }
        });
        
        //Button for 40 minute workout 
        Button btnTime40 = new Button("40 Minutes");
        btnTime40.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Time = 40;
                checkTime40 = true;
                System.out.println(Time);
            }
        });
        
        //Button for cardio workout
        Button btnTypeCardio = new Button("Cardio");
        btnTypeCardio.setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
                wrkTemp = 1;
                System.out.println(wrkTemp);
            }
        });
        
        //Button for lift workout
        Button btnTypeLift = new Button("Lift");
        btnTypeLift.setOnAction(new EventHandler<ActionEvent>() {          
            @Override
            public void handle(ActionEvent event) {
                wrkTemp = 2;
                System.out.println(wrkTemp);
            }
        });
        
        //Button for body weight workout
        Button btnEqpBody = new Button("Body weight");
        btnEqpBody.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                equip = 1;
                System.out.println(equip);
            }
        });
        
        //Button for gym workout
        Button btnEqpGym = new Button("Gym");
        btnEqpGym.setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                equip = 2;
                System.out.println(equip);
            }
        });
        
        //logic
        Time = 20; 
        wrkTemp = 2;
        equip = 2;
        
        Collections.shuffle(BWExercises);
        Collections.shuffle(GymExercises);
        
        if (Time == 20){
            numEx = 2; 
            if (wrkTemp == 1){ //cardio
                System.out.println("Run");
            }else if (wrkTemp == 2){ //lift
                if (equip == 1){//bodyweight
                    //choose ex from bodyweight list
                    while (createdWorkout.size() < numEx){
                        int index = 0;
                        createdWorkout.add(BWExercises.get(index));
                        ++index;
                        System.out.println(createdWorkout);
                    }
                }else if (equip == 2){ //gym
                    //choose ex from gym list
                    while (createdWorkout.size() < numEx){
                        int index = 0;
                        createdWorkout.add(GymExercises.get(index));
                        index++;
                        System.out.println(createdWorkout);
                    }
                }
            }
        }
        if (Time == 40){
            numEx = 3;
            if (wrkTemp == 1){ //cardio
                System.out.println("Run");
            }else if (wrkTemp == 2){ //lift
                if (equip == 1){//bodyweight
                    //choose ex from bodyweight list
                    while (createdWorkout.size() < numEx){
                        int index = 0;
                        createdWorkout.add(BWExercises.get(index));
                        index++;
                        System.out.println(createdWorkout);
                    }
                }else if (equip == 2){ //gym
                    //choose ex from gym list
                    while (createdWorkout.size() < numEx){
                        int index = 0;
                        createdWorkout.add(GymExercises.get(index));
                        index++;
                        System.out.println(createdWorkout);
                    }
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
        root.add(btnTime20, 0, 0, 1, 1);
        root.add(btnTime40, 1, 0, 1, 1);
        root.add(btnTypeCardio, 1, 1, 1, 1);  
        root.add(btnTypeLift, 0, 1, 1, 1);
        root.add(btnEqpBody, 1, 2, 1, 1);
        root.add(btnEqpGym, 0, 2, 1, 1);

        //creating scene
        Scene scene = new Scene(root, 240, 100);
        primaryStage.setTitle("workIT");
        primaryStage.setScene(scene);
        primaryStage.show();
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
    
    public String getType(){
        return type;
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
