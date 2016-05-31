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
    
    @Override
    public void start(Stage stage){
        

   
        VBox root = new Vbox(5);
        
        Label label = new Label("label");
        TextArea text = new TextArea();
        text.setPrefRowCount(10);
        text.setPrefColumnCount(20);
        text.setWrapText(true);
        
        Button printText = new Button("Prompt Question");
        printText.setOnAction(e -> print(text));
        
        HBox buttonBox = new HBox(5, printText);
        
        root.getChildren().addAll(label, text, buttonBox);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Defuse this");
        stage.show();
        //final PasswordField pb = new PasswordField();
        //TextField enterNumber = new TextField ();
        //enterNumber.setOnKeyPressed(new EventHandler <KeyEvent>(){
            /* public void handle(KeyEvent e){
                if(e.getCode() -- KeyCode.ENTER) {
                    //compare the textfield with the answer field.getText 
            }
        } */
            
            //private Label label;

        
    }
}
    
 
         

    

//override handle keyevent e, e.getcode --keycode.enter
//https://www.youtube.com/watch?v=R8Qx_UiG18I
//fxid is "enterNumber" http://code.makery.ch/blog/javafx-8-event-handling-examples/
