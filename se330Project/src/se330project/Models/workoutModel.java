/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Imports and packages
package se330project.Models;
import java.util.ArrayList;
import se330project.Se330Project;

/**
 *
// * @author jrrou
// */
//This class stands as the model for the workout
//A workout is made up of time, equipment used (gym or body weight), and the type (lift or cardio)
public class workoutModel {
    //Variables
    int Time = 0;
    int equip = 0;
    int wrkTemp = 0;
    
    //Getters and setters
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
    
    public void setEquip(int equip){
        this.equip = equip;
    }
}
