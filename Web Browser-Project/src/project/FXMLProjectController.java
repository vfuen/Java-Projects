/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package project;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class FXMLProjectController implements Initializable {
  
    
    @FXML

    private TextField textField;
    
    private String urlHome;
    
    private WebEngine webEngine;
    
    private double adjustZoom;
        
    @FXML
    private Button backButton;
    
    
    @FXML
    private Button fowardButton;
    
    @FXML
    private Button ZoomInButton;
        
        
      
    @FXML
    private Button zoomOutButton;   
        
    @FXML
    private Button refreshButton;
    
    private WebHistory webHistory;
    
    
    @FXML
    private WebView displayWeb;

    @FXML
    private Button searchButton;

  
@FXML 
public ProgressBar loadingBar;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        final ProgressBar load = loadingBar;
        load.setVisible(true);
        webEngine = displayWeb.getEngine();
        urlHome="www.nu.edu/";

        adjustZoom=1;
        textField.setText(urlHome);
        loadingBar.progressProperty().bind(
        webEngine.getLoadWorker().progressProperty());
        webEngine.getLoadWorker().stateProperty().addListener(
        (observable, oldValue, newValue) -> {
        if (newValue == Worker.State.SUCCEEDED) {
        System.out.println("Page was successfully loaded!");
        load.setVisible(false);
}       else if (newValue == Worker.State.FAILED) {
        System.out.println("Page loading has failed!");
}
});
        webEngine = displayWeb.getEngine();
        urlHome="www.nu.edu/";

        adjustZoom=1;
        textField.setText(urlHome);


        loadAWebPage();

  
    }

        
    @FXML
    void refreshesPage(ActionEvent event) {
    webEngine.reload();
    final ProgressBar load = loadingBar;
    load.setVisible(true);
    loadingBar.progressProperty().bind(
    webEngine.getLoadWorker().progressProperty());
    webEngine.getLoadWorker().stateProperty().addListener(
    (observable, oldValue, newValue) -> {
    if (newValue == Worker.State.SUCCEEDED) {
    System.out.println("Page was successfully loaded!");
    load.setVisible(false);

}   else if (newValue == Worker.State.FAILED) {
    System.out.println("Page loading has failed!");
}
});
    }

    @FXML
    void showHistory(ActionEvent event) {
        
    webHistory = webEngine.getHistory();
    ObservableList<WebHistory.Entry>webEntries = webHistory.getEntries();



    for(WebHistory.Entry discovery : webEntries){

    System.out.println(discovery.getUrl()+ " ---> " + discovery.getLastVisitedDate() 
        + " ---> " + discovery.titleProperty() );


}
    }
    @FXML
    void goFowardAPage(ActionEvent event) {
    webHistory = webEngine.getHistory();
    ObservableList<WebHistory.Entry>webEntries = webHistory.getEntries();
    webHistory.go(1);
    textField.setText(webEntries.get(webHistory.getCurrentIndex()).getUrl());
    
    final ProgressBar load = loadingBar;
    load.setVisible(true);
    loadingBar.progressProperty().bind(
    webEngine.getLoadWorker().progressProperty());
    webEngine.getLoadWorker().stateProperty().addListener(
    (observable, oldValue, newValue) -> {
    if (newValue == Worker.State.SUCCEEDED) {
    System.out.println("Page was successfully loaded!");
    load.setVisible(false);

}   else if (newValue == Worker.State.FAILED) {
    System.out.println("Page loading has failed!");
}
});
    
    }
    

    @FXML
    void goBackAPage(ActionEvent event) {
    webHistory = webEngine.getHistory();
    ObservableList<WebHistory.Entry>webEntries = webHistory.getEntries();
    webHistory.go(-1);
    textField.setText(webEntries.get(webHistory.getCurrentIndex()).getUrl());
    
    
    final ProgressBar load = loadingBar;
        load.setVisible(true);
    loadingBar.progressProperty().bind(
    webEngine.getLoadWorker().progressProperty());
    webEngine.getLoadWorker().stateProperty().addListener(
    (observable, oldValue, newValue) -> {
    if (newValue == Worker.State.SUCCEEDED) {
    System.out.println("Page was successfully loaded!");
    load.setVisible(false);

}   else if (newValue == Worker.State.FAILED) {
    System.out.println("Page loading has failed!");
}
});
    
    
    }
    
    @FXML
    void ZoomIn(ActionEvent event) {

        adjustZoom+= 0.05;
        displayWeb.setZoom(adjustZoom);
    }

    @FXML
    void ZoomOut(ActionEvent event) {
        
        adjustZoom-= 0.05;
        displayWeb.setZoom(adjustZoom);
    }
    
  

    
    @FXML
    public void loadAWebPage() {
    webEngine.load("https://"+ textField.getText());
    final ProgressBar load = loadingBar;
        load.setVisible(true);
    loadingBar.progressProperty().bind(
    webEngine.getLoadWorker().progressProperty());
    webEngine.getLoadWorker().stateProperty().addListener(
    (observable, oldValue, newValue) -> {
    if (newValue == Worker.State.SUCCEEDED) {
    System.out.println("Page was successfully loaded!");
    load.setVisible(false);

    }else if (newValue == Worker.State.FAILED) {
    System.out.println("Page loading has failed!");
}
});
    
    
    
    
    }
    @FXML

    public void viewWeb(){
    displayWeb.setFontScale(20);
    }
  @FXML  
public void webBar(){

final ProgressBar load = loadingBar;
        load.setVisible(true);
    loadingBar.progressProperty().bind(
    webEngine.getLoadWorker().progressProperty());
    webEngine.getLoadWorker().stateProperty().addListener(
    (observable, oldValue, newValue) -> {
    if (newValue == Worker.State.SUCCEEDED) {
    System.out.println("Page was successfully loaded!");
    load.setVisible(false);

    } else if (newValue == Worker.State.FAILED) {
    System.out.println("Page loading has failed!");
    }
});

       






}
}

    
   
    
    
    



