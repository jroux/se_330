/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Imports and packages
package se330project.Views;
import javafx.scene.control.Button;

/**
 *
 * @author jrrou
 */
//This class stands as the view for the login scene
public class loginView {
    //Creating buttons
    Button btnLogin = new Button("Login");
    
    //Getters for buttons
    public Button getbtnLogin() {
        btnLogin.setStyle("-fx-background-color: tan; -fx-text-fill: white;"); 
        return btnLogin;
    } 
}
