/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everyoneexplodesstoptalking;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.Scene;

/**
 *
 * @author csstudent
 */
public class FXMLDocumentController implements Initializable {

    
    @FXML
    
    private Integer secondsLeft = 60;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {        
        bomb_tile_numpad blah = new bomb_tile_numpad();
        
        Label label = new Label("label");
        TextArea text = new TextArea();
        text.setPrefRowCount(10);
        text.setPrefColumnCount(20);
        text.setWrapText(true);
        
        Button printText = new Button("Prompt Question");
        printText.setText(blah.question()); 
        
        
        
    }
    
      @Override
    /* public void initialize(URL url, ResourceBundle rb) {
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), this)); 
        timeline.setCycleCount(25);
        timeline.play();
    }    */
    
    @Override
    public void handle(ActionEvent event){
        secondsLeft--;
        label.setText(secondsLeft.toString());
    }
}
    
 
         

    

//override handle keyevent e, e.getcode --keycode.enter
//https://www.youtube.com/watch?v=R8Qx_UiG18I
//fxid is "enterNumber" http://code.makery.ch/blog/javafx-8-event-handling-examples/
