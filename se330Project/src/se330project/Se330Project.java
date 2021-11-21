/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Imports and packages
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
import javafx.scene.text.TextAlignment;


/**
 *
 * @author jrrou
 */
//This class stands as the application class, setting up the scenes and running main
public class Se330Project extends Application {
    
    //Variables
    boolean clickCheck = false; //used to disable buttons
    Label wrkLabel = new Label(); //used to display workout

    @Override
    public void start(Stage primaryStage) {
        
        //create instances of model, view, and controller
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
        logRoot.setHgap(5);
        logRoot.setVgap(5);
        logRoot.add(logView.getbtnLogin(), 0, 5, 2, 17);
        
        //Creating labels and texts
        Text scenetitle = new Text("Welcome to WorkIT!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        Label userName = new Label("User Name:");
        TextField userTextField = new TextField();
        Label pw = new Label("Password:");
        PasswordField pwBox = new PasswordField();
        
        //Adding labels, and texts to gridpane
        logRoot.add(scenetitle, 0, 0, 2, 1);
        logRoot.add(userName, 0, 3);
        logRoot.add(userTextField, 1, 3);
        logRoot.add(pw, 0, 5);
        logRoot.add(pwBox, 1, 5);
         
        
//-------------------------SETTING UP BROWSE SCENE--------------------------------------
        //Creating gridpane to organize buttons
        GridPane browseRootGP = new GridPane();
        browseRootGP.setAlignment(Pos.CENTER);
        
        //Creating text area
        TextArea preRec = new TextArea();
        preRec.setEditable(false);
        preRec.setPrefHeight(320);
        preRec.setPrefWidth(215);
        
        //Creating text titles
        Text tipsTitle = new Text("Health Tips and Tricks");
        tipsTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        Text tipsSmall = new Text("Look below for recovery-prevention & tips");  
        tipsSmall.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        
        //Creating Vboxs
        VBox vb1 = new VBox(tipsTitle, tipsSmall, browseRootGP, browseView.getbtnBack());
        VBox vb2 = new VBox(preRec);
        vb1.setSpacing(15);
        vb1.setPadding(new Insets(20, 20, 20, 20));
        vb2.setPadding(new Insets(15, 15, 15, 15));
        
        //Creating Hbox
        HBox browseRoot = new HBox(vb1, vb2);
        browseRootGP.add(browseView.getbtnC(), 0, 0, 1, 1);
        browseRootGP.add(browseView.getbtnG(), 0, 1, 1, 1);
        browseRootGP.add(browseView.getbtnB(), 0, 2, 1, 1);
        browseRootGP.setHgap(10);
        browseRootGP.setVgap(30);
        browseRootGP.setPadding(new Insets(25, 25, 25, 25));

        
 //-------------------------SETTING UP MAIN SCENE--------------------------------------
        //Creating textarea
        TextArea newArea = new TextArea();
        newArea.setEditable(false);
        newArea.setPrefHeight(320);
        newArea.setPrefWidth(215);
        
        //Creating text labels
        Text hellotitle = new Text("Let's Go WorkIT!");
        hellotitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        hellotitle.setTextAlignment(TextAlignment.CENTER);
        Text preferences = new Text("Please select you preferences below.");
        preferences.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        
        //Creating gridpane to organize buttons
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));
        root.add(view.getbtnTime20(), 0, 0, 1, 1);
        root.add(view.getbtnTime40(), 1, 0, 1, 1);
        root.add(view.getbtnTypeCardio(), 1, 1, 1, 1);  
        root.add(view.getbtnTypeLift(), 0, 1, 1, 1);
        root.add(view.getbtnEqpBody(), 1, 2, 1, 1);
        root.add(view.getbtnEqpGym(), 0, 2, 1, 1);
        root.add(view.getbtnGenerate(), 0, 3, 1, 1);
        root.add(view.getbtnReset(), 1, 3, 1, 1);
        
        //Creating Vbox
        VBox vbox = new VBox(hellotitle, preferences, root, view.getbtnBrowse());
        VBox vboxTwo = new VBox(newArea);
        vboxTwo.setPadding(new Insets(15, 15, 15, 15));
        vbox.setSpacing(15);
        vbox.setPadding(new Insets(20, 20, 20, 20));

        //Creating Hbox
        HBox hBox = new HBox(vbox, vboxTwo);

        //Setting browse button size and disabling go button to start
        view.getbtnBrowse().setPrefSize(200, 40);
        view.getbtnGenerate().setDisable(true);
        
        //Creating scenes
        Scene loginScene = new Scene(logRoot, 520, 350); //Login scene
        Scene scene = new Scene(hBox, 520, 350); //Homepage scene
        Scene browseScene = new Scene(browseRoot, 520, 350); //Browse scene
        primaryStage.setTitle("workIT");
        primaryStage.setScene(loginScene);
        primaryStage.show();
        
        
//--------------------------BUTTON ON CLICK EVENTS-------------------------------------------------
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
                newArea.setText(controller.setWorkout(model, createdWorkout, controller.createBWExercises(), controller.createGymExercises(), view));
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
                controller.resetWorkout(view, model, controller.createBWExercises(), controller.createGymExercises(), createdWorkout, newArea);
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
        
        //Button to view preset warmup
        browseView.getbtnC().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                browseController.warmupSet(preRec);
            }
        });
        
        //Button to view preset cool down
        browseView.getbtnG().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                browseController.cooldownSet(preRec);
            }
        });
       
        
        //Button to view preset health tips
        browseView.getbtnB().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                browseController.healthyTipsSet(preRec);
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
