/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package circlecolor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import javafx.event.ActionEvent;
 import javafx.fxml.FXML;
 import javafx.scene.control.RadioButton;
 import javafx.scene.control.ToggleGroup;
 import javafx.scene.input.MouseEvent;
 import javafx.scene.layout.Pane;
 import javafx.scene.paint.Color;
 import javafx.scene.paint.Paint;
 import javafx.scene.shape.Circle;
import javax.swing.Painter;

 public class FXMLDocumentController extends Circle {
  
 private double size;
    private double x;
    private double y;
    



    @FXML
    private Circle myCircle;

 @FXML private RadioButton 
         redRadioButton;
 @FXML private RadioButton
greenRadioButton;
 @FXML private RadioButton
blueRadioButton;

 @FXML private ToggleGroup
colorToggleGroup;

Pane pane;

 private Paint ColorOfCircle = Color.RED;

 public void initialize() {


 redRadioButton.setUserData(Color.RED);

greenRadioButton.setUserData(Color.GREEN);
blueRadioButton.setUserData(Color.BLUE);


}


 @FXML
 private void circleOnMouseClicked(MouseEvent e) {
    
myCircle.setFill(Color.RED);
pane.getChildren().add(myCircle);
}


 @FXML
 private void
colorRadioButtonSelected(ActionEvent e) {

 ColorOfCircle = (Color)
colorToggleGroup.getSelectedToggle().getUserData();
}





 }


 
 

