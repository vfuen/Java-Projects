/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 *
 * @author vfuen
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label1;
    
    @FXML

    private TextField textField1 ;
    
        @FXML

 private TextField textField2 ;
        
    
    @FXML
    public void handleButtonAction(ActionEvent event) {
        System.out.println("claculated");
        
        //textField1.getText();
        //textField2.getText();
    String result1 = textField1.getText();
    String result2 = textField2.getText();
    
    
    
int value1 = Integer.valueOf(result1);
int value2 = Integer.valueOf(result2);
int sumValue= value1 + value2;
label1.setText("  =  "+sumValue);
        

    }
        

    
    @FXML
    public void clearButtonAction(ActionEvent event){
                System.out.println("Cleared");

        textField1.setText("");
        textField2.setText("");
        label1.setText("");
    
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
