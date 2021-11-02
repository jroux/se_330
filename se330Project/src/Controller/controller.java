/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jrrou
 */
public class controller {
    
        public ArrayList<String> createBWExercises(){
        ArrayList<String> BWExercises = new ArrayList<String>(); 
        BWExercises.add("push ups");
        BWExercises.add("squats");
        BWExercises.add("pull ups");
        BWExercises.add("calf raises");
        BWExercises.add("pulsing squats");
        Collections.shuffle(BWExercises); //shuffle for random order
        return BWExercises;
    }
}
