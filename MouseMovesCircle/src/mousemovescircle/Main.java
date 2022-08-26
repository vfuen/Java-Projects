package mousemovescircle;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


	


public class Main extends Application {
         //String urlHome;

    @Override
    public void start(Stage stage) throws Exception {
    Parent root =  FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
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

