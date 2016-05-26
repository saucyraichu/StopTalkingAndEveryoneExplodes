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
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Group;

/**
 *
 * @author csstudent
 */
public class FXMLDocumentController implements Initializable {
    @Override
    public void start(Stage stage){
        //private Label label;
        Group root = new Group();
        Scene scene = new Scene(root, 260, 80);
        stage.setScene(scene);
        stage.setTitle("Defuse this");

        VBox vb = new VBox();
        vb.setPadding(new Insets(10, 0, 0, 10));
        vb.setSpacing(10);
        HBox hb = new HBox();
        hb.setSpacing(10);
        hb.setAlignment(Pos.CENTER_LEFT);

        Label label = new Label("keycode");
        //final PasswordField pb = new PasswordField();
        TextField enterNumber = new TextField ();
        enterNumber.setOnKeyPressed(new EventHandler <KeyEvent>(){
            /* public void handle(KeyEvent e){
                if(e.getCode() -- KeyCode.ENTER) {
                    //compare the textfield with the answer field.getText 
            }
        } */
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

