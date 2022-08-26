/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package mousemovescircle;

import static java.awt.Color.black;
import static java.awt.Color.red;
import static java.util.Arrays.fill;
import java.util.HashSet;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import static javafx.scene.layout.Border.stroke;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polyline;
import static javax.swing.Spring.width;

public class MouseMovesCircle {
    
    

@FXML private Polyline polyline;
 @FXML private Path path;
 
  
 
 
    

    
    @FXML
    private Pane pane;

    @FXML
    private Circle circle;

    @FXML
    private Polyline poLline;

    @FXML
    void movesCircle(MouseEvent event) {
circle.setCenterX(event.getX());
circle.setCenterY(event.getY());
poLline.getPoints();




    //@FXML
   // void movesLine(MouseEvent event) {

    
   // }

    
    
    
    
    }  
}


