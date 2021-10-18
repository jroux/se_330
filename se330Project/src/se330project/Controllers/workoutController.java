package se330project.Controllers;

import se330project.Models.workoutModel;
import se330project.Views.homePageView;

import javafx.application.Application;
import static javafx.application.Application.launch;
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
public class workoutController{
    int time = 0;
    int wrkTemp;
    workoutModel model;
    
    public workoutController(homePageView view){
        setView(view);
    }
    
    public void setView(homePageView view){
        view.getTimeButton20().setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                time = 1;
                System.out.println(time);
            }   
        });
    }
}
//    
//    @Override
//    public void start(Stage primaryStage) {
//        
//        //If user selects a 20min workout 
//        Button btn = new Button();
//        btn.setText("20 Minutes");
//        btn.setOnAction(
//        
//        //IF user selects a lift worjout
//        Button workout = new Button();
//        workout.setText("Lift");
//        workout.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            //If user selects a 20min workout 
//            public void handle(ActionEvent event) {
//                wrkTemp = 1;
//                System.out.println(wrkTemp);
//            }
//        });
//
//        
//        StackPane root = new StackPane();
//        btn.setLayoutX(100);
//        btn.setLayoutY(200);
//        
//        root.getChildren().add(btn);
//
//        root.getChildren().add(workout);
//
//        
//        Scene scene = new Scene(root, 500, 250);
//
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        launch(args);
//    }
//    
//}


//package se330project.Controllers;
//
//import se330project.Models.workoutModel;
//import se330project.Views.homePageView;
//
//public class workoutController{
//    private workoutModel model;
//    private homePageView view;
//    
//    public workoutController(workoutModel model, homePageView view){
//        this.model = model;
//        this.view = view;
//    }
//    
//    public void setWTime(int time){
//        model.setTime(time);
//    }
//    
//    public int getWTime(){
//        return model.getTime();
//    }
//        
//    public void setWType(String type){
//        model.setType(type);
//    }
//    
//    public String getWType(){
//        return model.getType();
//    }
//    
//        
//    public void setWEquipment(String equipment){
//        model.setEquipment(equipment);
//    }
//    
//    public String getWEquipment(){
//        return model.getEquipment();
//    }
//    
//    public void updateView(){
//        view.printWorkoutDetails(model.getTime(), model.getEquipment(), model.getType());
//    }
//    
//}