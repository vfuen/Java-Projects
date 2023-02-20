/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package project;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author vfuen
 */
public class Project extends Application {
         //String urlHome;

    @Override
    public void start(Stage stage) throws Exception {
    Parent root =  FXMLLoader.load(getClass().getResource("FXMLProject.fxml"));
    stage.setResizable(true);
    stage.setTitle(":) o.o -.- (:");
    stage.setScene(new Scene(root,Color.DEEPSKYBLUE));
    stage.initStyle(StageStyle.DECORATED);
    stage.show();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
    