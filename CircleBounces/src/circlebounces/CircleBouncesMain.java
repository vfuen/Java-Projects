/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package circlebounces;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author vfuen
 */
public class CircleBouncesMain extends Application {
    
  @Override

   public void start(Stage stage) throws Exception {

      Parent root =

         FXMLLoader.load(getClass().getResource("CircleDocument.fxml"));

     

      Scene scene = new Scene(root);

      stage.setTitle("Draw Polylines, Polygons and Paths");

      stage.setScene(scene);

      stage.show();

   }

 

   public static void main(String[] args) {

      launch(args);

   }

}
