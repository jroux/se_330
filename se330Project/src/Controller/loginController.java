/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
/**
 *
 * @author jrrou
 */
public class loginController {
    
    //This method ensures that a user enters a username and password before they can login
    public void userPassCheck(TextField userTextField, GridPane logRoot, PasswordField pwBox, Stage primaryStage, Scene scene){
        if (userTextField.getText().isEmpty()){
                    System.out.println("made it");
                    Label noUserName = new Label("Please enter a user name.");
                    logRoot.add(noUserName, 0, 8);
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
    
}
