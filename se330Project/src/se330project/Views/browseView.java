/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Imports and Packages
package se330project.Views;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author jrrou
 */
//This class stands as the view for the browse scene
public class browseView {
    //Creating buttons
    Button btnBack = new Button ("Back");
    Button btnC = new Button ("Warm up");
    Button btnG = new Button ("Cool Down");
    Button btnB = new Button ("Health Tips");
    
    
    //Getters for buttons
    public Button getbtnBack() {
        btnBack.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnBack;
    }
    
    public Button getbtnC() {
        btnC.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnC;
    }
    
    public Button getbtnG() {
        btnG.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnG;
    }
    
    public Button getbtnB() {
        btnB.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnB;
    }
}
