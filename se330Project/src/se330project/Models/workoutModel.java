/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//imports and packages
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
    
    //getters and setters
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
