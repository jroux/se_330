/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project;
import se330project.Models.workoutModel;
import se330project.Views.homePageView;
import se330project.Controllers.workoutController;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;



//public class Se330Project extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        homePageView view = new homePageView();
//        workoutController controller = new workoutController(view);
//        primaryStage.setTitle("WorkIT");
//        primaryStage.getIcons().add(new Image(getClass().getResource("/img/EdenCodingIcon.png").toExternalForm()));
//        primaryStage.setScene(new Scene(view.getView()));
//        primaryStage.show();
//    }
//    
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//}









/**
 *
 * @author jrrou
 */
public class Se330Project extends Application {
    int Time = 0;
    int wrkTemp = 0;
    String type = "";
    String equip = "";
    String word = "";
    boolean checkTime20 = false;
    boolean checkTime40 = false;

    
    @Override
    public void start(Stage primaryStage) {
        
        //If user selects a 20min workout 
        Button btnTime20 = new Button("20 Minutes");
        //btn.setText("20 Minutes");
        btnTime20.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override

            public void handle(ActionEvent event) {
                Time = 20;
                System.out.println("Hello World!!");
                System.out.println(Time);
                checkTime20 = true;
            }
        });
        
        //If user selects a 20min workout 
        Button btnTime40 = new Button("40 Minutes");
//        btn.setText("200 Minutes");
        btnTime40.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override

            public void handle(ActionEvent event) {
                Time = 40;
                checkTime40 = true;
                System.out.println(Time);
            }
        });
        
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
        
//        //IF user selects a lift worjout
//        Button cardio = new Button();
//        workout.setText("Cardio");
//        workout.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            //If user selects a 20min workout 
//            public void handle(ActionEvent event) {
//                wrkTemp = 2;
//                System.out.println(wrkTemp);
//            }
//        });
        
//        //IF user selects a 40 min worjout
//        Button time40 = new Button();
//        workout.setText("40 Minutes");
//        workout.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            //If user selects a 20min workout 
//            public void handle(ActionEvent event) {
//                Time = 40;
//                time40.setDisable(false);
//                System.out.println(Time);
//            }
//        });

        System.out.println(checkTime20);
        System.out.println(checkTime40);
        
        if (checkTime20 == true){
            System.out.println("made it");
            btnTime40.setDisable(true);
        }else{
            System.out.println("made it2");
            btnTime40.setDisable(false);
        }
        
        if (checkTime40 == true){
            System.out.println("made i3t");
            btnTime20.setDisable(true);
        }else{
            System.out.println("made i4t");
            btnTime20.setDisable(false);
        }
        
        StackPane root = new StackPane();
        
//        time40.setTranslateX(40);
//        time40.setTranslateY(40);
        btnTime40.setTranslateX(10);
        btnTime40.setTranslateY(10);
        btnTime20.setTranslateX(70);
        btnTime20.setTranslateY(70);
//        cardio.setTranslateX(100);
//        cardio.setTranslateY(100);
//        
        root.getChildren().add(btnTime20);
        root.getChildren().add(btnTime40);
//        root.getChildren().add(cardio);
//        root.getChildren().add(workout);
//        root.getChildren().add(time40);

        
        Scene scene = new Scene(root, 500, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    public static int addNums(int a, int b){
        return a + b;
    }
    
    public Boolean aWord(String word){
        if (word.contains("a")){
           return true;
        }
        else{
            return false;
        }
    }
    
    public String getType(){
        return type;
    }
    
    public String getEquip(){
        return equip;
    }
    
    public int getTime(){
        return Time;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        launch(args);
    }
    
}





//package se330project;
//import se330project.Models.workoutModel;
//import se330project.Views.homePageView;
//import se330project.Controllers.workoutController;
//
//
//public class Se330Project{
//
//    public static void main(String[] args){
//        workoutModel model = retriveWorkoutFromDatabase();
//        homePageView view = new homePageView();
//        workoutController controller = new workoutController(model, view);
//        controller.updateView();
//    }
//   
//    public static workoutModel retriveWorkoutFromDatabase(){
//        workoutModel model = new workoutModel();
//        model.setTime(3);
//        model.setType("Lift");
//        model.setEquipment("Body Weight");
//        return model;
//    }
// //launch(args);
//    
//}
