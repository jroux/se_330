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
        preRec.setText("Jog \n\n Calf Sweeps \n\n Quad Stretch \n\n Side Lunge Stretch \n\n Groin Stretch \n\n Pidgeon Stretch \n\n Child's Pose");
    }
    
    public static void healthyTipsSet(TextArea preRec){
        preRec.setText("1. Drink lots of water \n\n 2. Get Sleep \n\n 3. Eat well balanced meals \n\n 4. Make sure to stretch \n\n 5. Set goals \n\n 6. Incorporate Rest Days \n\n 7. Create a Routine");
    }

    public static void warmupSet(TextArea preRec) {
        preRec.setText("Jog \n\n Highknees \n\n Butt Kickers \n\n Kareokee \n\n Side Shuffle \n\n Open/Close the Gate \n\n Leg Kicks");
    }
}
