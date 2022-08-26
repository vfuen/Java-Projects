/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circleprogram;


import java.security.SecureRandom;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public final class Circle implements Runnable {

    private int x;//X axis
    private int y;//Y axis
    private final int w;//Window with
//Window with
    private static final SecureRandom generator= new SecureRandom();
    //private final boolean hitsBottom;//Axis at the bottom of the screen -y
    // private final boolean hitsTop;//Axis at the top of the screen y
    // private final boolean hitsLeftSide;// before the end of the screen
    //private final boolean hitsRightSide;//before right side end of screen
    //Random location
    private final int randomXAxis;//Random x axis
    private final int randomYAxis;//Random y axis
    private final int timeToSleep;//Sleep timer for Circle thread
    private int wholeCircle;
    private final Random generateRandomNum;
    private final int h;//Window Height
    
    private boolean movingUpOrDown;
        private boolean movingLeftOrRight;

    
    private final Color circleColor;
    
    
    
    public Circle(int w,int x, int y, int h, Circle circle) { 
    circleColor= Color.BLUE;

    this.w = w;    
    this.x = x;
    this.y=y;
    this.h=h;
    generateRandomNum= new Random();
    timeToSleep = generator.nextInt(300); 
    randomXAxis = 1 + generateRandomNum.nextInt(2);
    randomYAxis = 1 + generateRandomNum.nextInt(2);
    setWindowWidth(w);
    setWindowHeight(h);
    movingLeftOrRight= true;
    movingUpOrDown= true;
    
    }
    
    
   


    
    

    
    

    @Override
    public void run() {
    
while(true){
  
  
  try{
      Thread.sleep(10);
             
  if(movingUpOrDown){
  
  
  y+= randomYAxis;
  
   if (y >= h)
movingUpOrDown= false;
  }else{
      
      y-= randomYAxis;
      
      
      if (y<=0)
      movingUpOrDown = true;
      
  }
      
    if(movingLeftOrRight){
  
  
  x+= randomXAxis;
  
   if (x >= w)
movingLeftOrRight= false;
  }else{
      
      x-= randomXAxis;
      
      
      if (x <= 0)
      movingLeftOrRight= true;  
      
   
    }
  
  }
          
          
 catch (InterruptedException exception) {
                // InterruptedException encountered
                System.out.println("Interrupted exception in Ball");
            }
 
}}



 public void setWindowWidth(int width) {
        width = w;
    }

    // set method for the max height of the bouncing area
    // could be used to update the max height if window is resized
    public void setWindowHeight(int hieght) {
        hieght = h;
    }

    // set method for the ball colour
    //public void setCircleColour(Color cColor) {
       // cColor = circleColor;
    //}

    // get method for ball diameter
    public int getwholeCircle() {
        return wholeCircle;
    }

    // get method for horizontal position of the ball
    public int getXaxis() {
        return x;
    }

    // get method for vertical position of the ball
    public int getYaxis() {
        return y;
    }

    // get method for the colour of the ball
    public Color getCircleColor() {
        return circleColor;
    }
}