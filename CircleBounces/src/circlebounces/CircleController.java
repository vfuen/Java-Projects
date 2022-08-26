/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
 



package circlebounces;


import javafx.fxml.FXML;

import javafx.scene.input.MouseEvent;

import javafx.scene.layout.Pane;

import javafx.scene.shape.Circle;

import javafx.scene.shape.Polyline;


 

public class CircleController{

  
    
    
    
    

    @FXML
    private Circle circle;

    @FXML
    private Polyline polyline;

    @FXML
    void mouseMoved(MouseEvent event) {
 circle.setCenterX(event.getX());

      circle.setCenterY(event.getY());
 polyline.getPoints().addAll(event.getX(), event.getY());

     

      if (polyline.getPoints().size() > 100) { // larger than 50 points

         polyline.getPoints().remove(0, 2);

    }

}
    
    
} 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   


  


    
    
    

