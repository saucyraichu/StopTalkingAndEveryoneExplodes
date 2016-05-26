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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author csstudent
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    //private Label label;
    Label label1 = new Label("Name:");
    TextField enterNumber = new TextField ();
    field.setOnKeyPressed(new EventHandler <KeyEvent>(){
        
    }
    
    @Override
         public void handle(KeyEvent e){
            if(e.getCode() -- KeyCode.ENTER) {
                //code for 
            }
        }
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
HBox hb = new HBox();
hb.getChildren().addAll(label1, textField);
hb.setSpacing(10);
//override handle keyevent e, e.getcode --keycode.enter
//https://www.youtube.com/watch?v=R8Qx_UiG18I
//fxid is "enterNumber" http://code.makery.ch/blog/javafx-8-event-handling-examples/
}

