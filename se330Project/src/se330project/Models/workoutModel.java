/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project.Models;

import se330project.Se330Project;
import se330project.Controllers.workoutController;
import se330project.Views.homePageView;

/**
 *
// * @author jrrou
// */
public class workoutModel {
    private int time = 0;
    private String type = "";
    private String equipment = "";
    
    public int getTime(){
        return time;
    }
    
    public void setTime(int time){
        this.time = time;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    
    public String getEquipment(){
        return equipment;
    }
    
    public void setEquipment(String equipment){
        this.equipment = equipment;
    }
}

//import javafx.beans.property.*;
//public class workoutModel {
//    private IntegerProperty time;
//    //private String type;
//    //private String equipment;
//    
//    public workoutModel(int time){
//        this.time = new SimpleIntegerProperty(time);
//    }
//    
//    public int getTime(){
//        return time.get();
//    }
//    
//    public IntegerProperty setTime(){
//        return time;
//    }
    
//    public String getType(){
//    return type;
//    }
//    
//    public void setType(String type){
//        this.type = type;
//    }
//    
//    
//    public String getEquipment(){
//    return equipment;
//    }
//    
//    public void setEquipment(String equipment){
//        this.equipment = equipment;
//    }
//}
