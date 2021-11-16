/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project.Views;

import javafx.scene.control.Button;

/**
 *
 * @author jrrou
 */
public class browseView {
    Button btnBack = new Button ("Back");
    Button btnC = new Button ("Cardio");
    Button btnG = new Button ("Gym Lift");
    Button btnB = new Button ("Bodyweight Workout");
    
    
    //Getters for buttons
    public Button getbtnBack() {
        return btnBack;
    }
    
    public Button getbtnC() {
        return btnC;
    }
    
    public Button getbtnG() {
        return btnG;
    }
    
    public Button getbtnB() {
        return btnB;
    }
}
