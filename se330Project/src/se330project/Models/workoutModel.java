/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project.Models;

import java.util.ArrayList;
import se330project.Se330Project;

/**
 *
// * @author jrrou
// */
public class workoutModel {
    int Time = 0;
    int equip = 0;
    int wrkTemp = 0;
    
    public int getTime(){
        return Time;
    }
    
    public void setTime(int Time){
        this.Time = Time;
    }
    
    public int getWrkTemp(){
        return wrkTemp;
    }
    
    public void setWrkTemp(int wrkTemp){
        this.wrkTemp = wrkTemp;
    }
    
    
    public int getEquip(){
        return equip;
    }
    
    public void setEquip(int equipment){
        this.equip = equip;
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
