/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//imports and packages
package se330project;
import se330project.Models.workoutModel;
import se330project.Views.homePageView;
import se330project.Views.loginView;
import Controller.controller;
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
    boolean clickCheck = false; //used to disable buttons
    Label wrkLabel = new Label(); //used to display workout

    
    @Override
    public void start(Stage primaryStage) {
        
        //create model, view, and controller
        homePageView view = new homePageView();
        loginView logView = new loginView();
        workoutModel model = new workoutModel();
        controller controller = new controller();

        
        //New created workout list
        ArrayList<String> createdWorkout = new ArrayList<String>(); 
         
        
        
//--------------------------BUTTON ON CLICK EVENT-------------------------------------------------



        //Button for 20 minute workout
        view.getbtnTime20().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setTime(20);
                clickCheck = true;
                controller.disableButton(clickCheck, view.getbtnTime40());
            }
        });
        
        //Button for 40 minute workout 
        view.getbtnTime40().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setTime(40);
                clickCheck = true;
                controller.disableButton(clickCheck, view.getbtnTime20());
            }
        });
        
        //Button for cardio workout
        view.getbtnTypeCardio().setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
                model.setWrkTemp(1);
                controller.turnGoOn(model, view);
                clickCheck = true;
                controller.disableButton(clickCheck, view.getbtnTypeLift());
                controller.disableButton(clickCheck, view.getbtnEqpBody());
                controller.disableButton(clickCheck, view.getbtnEqpGym());
            }
        });
        
        //Button for lift workout
        view.getbtnTypeLift().setOnAction(new EventHandler<ActionEvent>() {          
            @Override
            public void handle(ActionEvent event) {
                model.setWrkTemp(2);
                controller.turnGoOn(model, view);
                clickCheck = true;
                controller.disableButton(clickCheck, view.getbtnTypeCardio());
            }
        });
        
        //Button for body weight workout
        view.getbtnEqpBody().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setEquip(1);
                controller.turnGoOn(model, view);
                clickCheck = true;
                controller.disableButton(clickCheck, view.getbtnEqpGym());
            }
        });
        
        //Button for gym workout
        view.getbtnEqpGym().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                model.setEquip(2);
                controller.turnGoOn(model, view);
                clickCheck = true;
                controller.disableButton(clickCheck, view.getbtnEqpBody());
            }
        });
        
        //Button to generate workout
        view.getbtnGenerate().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                wrkLabel.setText(controller.setWorkout(model, createdWorkout, controller.createBWExercises(), controller.createGymExercises(), view));
               
            }
        });
        
        //Button to reset buttons
        view.getbtnReset().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                controller.resetWorkout(view, model, controller.createBWExercises(), controller.createGymExercises(), createdWorkout);
            }
        });

//-------------------------SETTING UP SCENE--------------------------------------
        //login GridPane 
        GridPane logRoot = new GridPane();
        
       

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
        
        logRoot.add(logView.getbtnLogin(), 0, 0, 1, 1);

        //creating scene
        Scene loginScene = new Scene(logRoot, 240, 100);
        Scene scene = new Scene(root, 240, 100);
        primaryStage.setTitle("workIT");
        primaryStage.setScene(loginScene);
        primaryStage.show();
        
        
        //Button to login
        logView.getbtnLogin().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        });
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }   
}
