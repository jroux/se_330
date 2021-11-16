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
import Controller.loginController;
import Controller.browseController;
import se330project.Views.browseView;
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
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.control.ScrollPane;
import javafx.scene.shape.Rectangle;


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
        loginController logController = new loginController();
        browseView browseView = new browseView();

        
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
         
//-------------------------SETTING UP BROWSE SCENE--------------------------------------
        //GridPane browseRoot = new GridPane();
        
        // HBox example
        TextArea preRec = new TextArea();
        preRec.setPrefHeight(300);
        preRec.setPrefWidth(190);
        VBox vb1 = new VBox(browseView.getbtnC(), browseView.getbtnG(), browseView.getbtnB(), browseView.getbtnBack());
        VBox vb2 = new VBox(preRec);
        vb1.setSpacing(50);
        //vb1.setPadding(new Insets(10, 50, 50, 50));
        vb1.setPadding(new Insets(20, 20, 20, 20));
        vb2.setPadding(new Insets(15, 15, 15, 15));
        HBox browseRoot = new HBox(vb1, vb2);
        browseRoot.setSpacing(10);

        
//        ScrollPane s1 = new ScrollPane();
//        s1.setPrefSize(300, 175);
//        s1.setContent(browseRoot);
//        ScrollPane scrollPane = new ScrollPane(browseRoot);
//        scrollPane.setPrefSize(600, 200);
//        scrollPane.setContent(browseRoot);
//        scrollPane.setFitToHeight(true);
//        scrollPane.setFitToWidth(true);
//        scrollPane.setPannable(true);
//        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        
//        browseRoot.setAlignment(Pos.CENTER);
//        browseRoot.setHgap(10);
//        browseRoot.setVgap(10);
//        browseRoot.setPadding(new Insets(25, 25, 25, 25));
//        browseRoot.add(browseView.getbtnBack(), 0, 0, 1, 1);


        
        
        
 //-------------------------SETTING UP MAIN SCENE--------------------------------------
        //workout gridpane
        GridPane root = new GridPane();
        VBox vbox = new VBox(root, wrkLabel);
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));
        //root.add(wrkLabel, 0, 5, 1, 1);
        
        //Adding buttons to gridpane
        root.add(view.getbtnTime20(), 0, 0, 1, 1);
        root.add(view.getbtnTime40(), 1, 0, 1, 1);
        root.add(view.getbtnTypeCardio(), 1, 1, 1, 1);  
        root.add(view.getbtnTypeLift(), 0, 1, 1, 1);
        root.add(view.getbtnEqpBody(), 1, 2, 1, 1);
        root.add(view.getbtnEqpGym(), 0, 2, 1, 1);
        root.add(view.getbtnGenerate(), 0, 3, 1, 1);
        root.add(view.getbtnReset(), 1, 3, 1, 1);
        root.add(view.getbtnBrowse(), 1, 4, 1, 1);
        view.getbtnGenerate().setDisable(true);
        
        //creating scenes
        Scene loginScene = new Scene(logRoot, 400, 275);
        //loginScene.setBackground(Color.RED);
        //loginScene.setBackground(new Background(new BackgroundFill(Color.WHITE)));
        //loginScene.setStyle("-fx-background-color: #FFFFFF;");
        Scene scene = new Scene(vbox, 300, 275); //workout scene
        Scene browseScene = new Scene(browseRoot, 400, 300);
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
                //this code prevents user from spamming the go button
                clickCheck = true;
                controller.disableButton(clickCheck, view.getbtnGenerate());
            }
        });
        
        //Button to reset buttons
        view.getbtnReset().setOnAction(new EventHandler<ActionEvent>() {       
            @Override
            public void handle(ActionEvent event) {
                controller.disableButton(false, view.getbtnGenerate()); //need to enable go button again
                controller.resetWorkout(view, model, controller.createBWExercises(), controller.createGymExercises(), createdWorkout);
            }
        });

        //Button to login
        logView.getbtnLogin().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                logController.userPassCheck(userTextField, logRoot, pwBox, primaryStage, scene);
            }
        });
        
        //Button to browse premade workouts
        view.getbtnBrowse().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(browseScene);
                primaryStage.show();
            }
        });
        
        //Button to go back to home scene
        browseView.getbtnBack().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        });
        
        //Button to view preset cardio workouts
        browseView.getbtnC().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                browseController.cardioPreSet(preRec);
            }
        });
        
        //Button to view preset gym workouts
        browseView.getbtnG().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                browseController.gymPreSet(preRec);
            }
        });
       
        
        //Button to view preset bodyweight workouts
        browseView.getbtnB().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                browseController.bwPreSet(preRec);
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
