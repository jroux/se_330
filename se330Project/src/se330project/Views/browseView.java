/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project.Views;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author jrrou
 */
public class browseView {
    Button btnBack = new Button ("Back");
    Button btnC = new Button ("Warm up");
    Button btnG = new Button ("Cool Down");
    Button btnB = new Button ("Health Tips");
    
    
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
