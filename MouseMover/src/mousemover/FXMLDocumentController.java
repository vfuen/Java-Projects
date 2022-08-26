/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mousemover;

import javafx.scene.layout.HBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;

public class FXMLDocumentController {

    @FXML
    private Circle circle;

    @FXML
    private Polyline polyLine;

    @FXML
    void moveCircleWithMouse(MouseEvent event) {
        
        circle.setFill(Color.YELLOW);
circle.setStroke(Color.BLUE);
circle.setStrokeWidth(2.0);
    }

    @FXML
    void movePolylineWithMouse(MouseEvent event) {
        
    

    }
}