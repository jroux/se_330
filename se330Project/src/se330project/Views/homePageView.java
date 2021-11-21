/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */
//Imports and packages
package se330project.Views;
import se330project.Se330Project;
import se330project.Models.workoutModel;
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
//This class stands as the view for the home page
public class homePageView{
    
    //Creating buttons
    Button btnTime20 = new Button("20 Minutes");
    Button btnTime40 = new Button("40 Minutes");
    Button btnTypeLift = new Button("Lift");
    Button btnTypeCardio = new Button("Cardio");
    Button btnEqpBody = new Button("Body Weight");
    Button btnEqpGym = new Button("Gym");
    Button btnGenerate = new Button ("GO");
    Button btnReset = new Button ("RESET");
    Button btnBrowse = new Button ("More >>");
    
    //Getters for buttons
    public Button getbtnBrowse() {
        btnBrowse.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnBrowse;
    }
    public Button getbtnGenerate() {
        btnGenerate.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnGenerate;
    }
    
    public Button getbtnReset() {
        btnReset.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnReset;
    }
    
    public Button getbtnTime20() {
        btnTime20.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnTime20;
    }
    
    public Button getbtnTime40() {
        btnTime40.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnTime40;
    }
    
    public Button getbtnTypeLift() {
        btnTypeLift.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnTypeLift;
    }
    
    public Button getbtnTypeCardio() {
        btnTypeCardio.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnTypeCardio;
    }
    
    public Button getbtnEqpBody() {
        btnEqpBody.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnEqpBody;
    }
    
    public Button getbtnEqpGym() {
        btnEqpGym.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnEqpGym;
    }   
}


