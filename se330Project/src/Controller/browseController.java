/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import se330project.Views.browseView;

/**
 *
 * @author jrrou
 */
public class browseController {
    
    
    public static void cooldownSet(TextArea preRec){
        preRec.setText("----------COOL DOWN----------\n\n Jog \n\n Calf Sweeps \n\n Quad Stretch \n\n Side Lunge Stretch \n\n Hamstring Stretch \n\n Groin Stretch \n\n Pidgeon Stretch \n\n Child's Pose");
        
    }
    
    public static void healthyTipsSet(TextArea preRec){
        preRec.setText("----------HEALTH TIPS---------- \n \n 1. Drink Lots of Water \n\n 2. Get Sleep \n\n 3. Eat Well Balanced Meals \n\n 4. Make Sure to Stretch \n\n 5. Set Goals \n\n 6. Incorporate Rest Days \n\n 7. Create a Routine \n\n 8. Find Accountability Friends");
    }

    public static void warmupSet(TextArea preRec) {
        preRec.setText("------------WARMUP------------ \n\n Jog \n\n Highknees \n\n Butt Kickers \n\n Kareokee \n\n Side Shuffle \n\n Open/Close the Gate \n\n Leg Kicks \n\n Quick Sprint");
    }
}
