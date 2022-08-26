/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package circleprogram;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author vfuen
 */
public abstract class CircleProgram extends Application {



    public static void main(String[] args) {

        Ball ball1 = new Ball(1080, 1120, 88, 88, 80);
        CircleController2 controller= new CircleController2();
        
Thread thread1 = new Thread(ball1);
Thread thread2 = new Thread(controller);



        //ExecutorService executorService = Executors.newCachedThreadPool();
                // executorService.execute(ball1);
thread1.setDaemon(false);
        thread1.start();
        thread2.start();
    }

    
    }


