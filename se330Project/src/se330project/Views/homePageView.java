/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */

package se330project.Views;

import se330project.Se330Project;
import se330project.Models.workoutModel;
//import se330project.Controllers.workoutController;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.geometry.VPos;
import javafx.scene.layout.Priority;
import javafx.scene.layout.ColumnConstraints;
import javafx.geometry.HPos;
import javafx.scene.layout.HBox;
import javafx.scene.Parent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;    
/**
 *
 * @author jrrou
 */

public class homePageView{
    
    //creating buttons
    Button btnTime20 = new Button("20 Minutes");
    Button btnTime40 = new Button("40 Minutes");
    Button btnTypeLift = new Button("Lift");
    Button btnTypeCardio = new Button("Cardio");
    Button btnEqpBody = new Button("Body weight");
    Button btnEqpGym = new Button("Gym");
    
    //Getters for buttons
    public Button getbtnTime20() {
        return btnTime20;
    }
    
    public Button getbtnTime40() {
        return btnTime40;
    }
    
    public Button getbtnTypeLift() {
        return btnTypeLift;
    }
    
    public Button getbtnTypeCardio() {
        return btnTypeCardio;
    }
    
    public Button getbtnEqpBody() {
        return btnEqpBody;
    }
    
    public Button getbtnEqpGym() {
        return btnEqpGym;
    }   
}
//        StackPane root = new StackPane();
//
//        Scene scene = new Scene(root, 500, 250);
//
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//}



//public class homePageView {
//    
//    Button timeButton20 = new Button("20 Minutes");
//    Parent view;
//    
//    public homePageView(){
//        view = createView();
//}
//    
//    public Button getTimeButton20() {
//        return timeButton20;
//    }
//    
//    private VBox createView(){
//        VBox vBox = new VBox(15);
//        vBox.setPrefWidth(300);
//        vBox.setPrefHeight(250);
//        vBox.setPadding(new Insets(15));
//        vBox.getStylesheets().addAll(Se330Project.class.getResource("/css/styles.css").toExternalForm());
//        vBox.getChildren().add(createTitle());
//        vBox.getChildren().add(createAccountDetails());
//        vBox.getChildren().add(createDepositWithdrawalButtons());
//        return vBox;
//    }
//    
//    
//    private Node createTitle(){
//        Label titleLabel = new Label("Workout");
//        titleLabel.getStyleClass().add("title");
//        titleLabel.setMaxWidth(600);
//        return titleLabel;
//    }
//    
//    
//    private Node createAccountDetails() {
//        GridPane gridPane = new GridPane();
//        Label timeLabel = new Label("Time:");
//        timeLabel.getStyleClass().add("bold");
//        GridPane.setRowIndex(timeLabel, 1);
//        gridPane.getChildren().addAll(timeLabel);
//        
//        gridPane.getRowConstraints().addAll(new RowConstraints(30, 100, 500, Priority.SOMETIMES, VPos.BASELINE, true));
//        gridPane.getColumnConstraints().addAll(new ColumnConstraints(10, 100, 500, Priority.SOMETIMES, HPos.CENTER, true));
//    
//    return gridPane;}
//    
//    
//    private Node createDepositWithdrawalButtons() {
//        HBox hBox = new HBox(15);
//        hBox.getChildren().addAll(timeButton20);
//        return hBox;
//    }
//    
//    public Parent getView() {
//        return view;
//    }
//}
    
//     int Time;
//     int wrkTemp;
//     
//     public void start(Stage primaryStage) {
//
//        //If user selects a 20min workout 
//     Button btn = new Button();
//     btn.setText("20 Minutes");
//     btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//     @Override
//
//     public void handle(ActionEvent event) {
//        Time = 1;
//        System.out.println("Hello World!!");
//        System.out.println(Time);
//        }
//     });
//    
//    
//    
//    
//    public void printWorkoutDetails(int time, String type, String equipment)
//    {
//        System.out.println("Equipment: " + equipment);
//        System.out.println("Time: " + time);
//        System.out.println("Type: " + type);}
//        
//        
//        
//      StackPane root = new StackPane();
//      btn.setLayoutX(100);
//      btn.setLayoutY(200);
//        
//      root.getChildren().add(btn);
//
//    
//
//        
//      Scene scene = new Scene(root, 500, 250);
//
//      primaryStage.setTitle("Hello World!");
//      primaryStage.setScene(scene);
//      primaryStage.show();
//    
//    }
//}



//
//public class homePageView {
//   
//    public void printWorkoutDetails(int time, String type, String equipment)
//    {
//        System.out.println("Equipment: " + equipment);
//        System.out.println("Time: " + time);
//        System.out.println("Type: " + type);}

//



