/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author jrrou
 */
public class Se330Project extends Application {
    int Time;
    int wrkTemp;
    
    @Override
    public void start(Stage primaryStage) {
        
        //If user selects a 20min workout 
        Button btn = new Button();
        btn.setText("20 Minutes");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override

            public void handle(ActionEvent event) {
                Time = 1;
                System.out.println("Hello World!!");
                System.out.println(Time);
            }
        });
        
        //IF user selects a lift worjout
        Button workout = new Button();
        workout.setText("Lift");
        workout.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            //If user selects a 20min workout 
            public void handle(ActionEvent event) {
                wrkTemp = 1;
                System.out.println(wrkTemp);
            }
        });

        
        StackPane root = new StackPane();
        btn.setLayoutX(100);
        btn.setLayoutY(200);
        
        root.getChildren().add(btn);

        root.getChildren().add(workout);

        
        Scene scene = new Scene(root, 500, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
