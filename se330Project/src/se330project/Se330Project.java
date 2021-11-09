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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.PasswordField;

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
        
 //-------------------------SETTING UP LOGIN SCENE--------------------------------------      
        //login GridPane 
        GridPane logRoot = new GridPane();
        logRoot.setAlignment(Pos.CENTER);
        logRoot.setHgap(10);
        logRoot.setVgap(10);
        logRoot.setPadding(new Insets(25, 25, 25, 25));
        logRoot.add(logView.getbtnLogin(), 0, 0, 2, 17);
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        logRoot.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        logRoot.add(userName, 0, 1);

        TextField userTextField = new TextField();
        logRoot.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        logRoot.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        logRoot.add(pwBox, 1, 2);
         
//-------------------------SETTING UP MAIN SCENE--------------------------------------

 
        //workout gridpane
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));
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
        
        //creating scenes
        Scene loginScene = new Scene(logRoot, 400, 275);
        Scene scene = new Scene(root, 300, 275); //workout scene
        primaryStage.setTitle("workIT");
        primaryStage.setScene(loginScene);
        primaryStage.show();
        
        
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

        //Button to login
        logView.getbtnLogin().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(userTextField.getText());
                System.out.println(pwBox.getText());
                if (userTextField.getText().isEmpty()){
                    System.out.println("made it");
                    Label noUserName = new Label("Please enter a user name.");
                    logRoot.add(noUserName, 0, 8);
                    System.out.print("You need to enter a user name.");
                }else if (pwBox.getText().isEmpty()){
                    Label noPwBox = new Label("Please enter a password.");
                    logRoot.add(noPwBox, 0, 9);
                    System.out.print("You need to enter a password.");
                }
                else{
                    primaryStage.setScene(scene);
                    primaryStage.show();
                }

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
