
package bcs.pkg345.assignment.pkg4;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

 
public class BCS345Assignment4 extends Application {

   
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    
    public void start(Stage primaryStage) throws Exception {
        Parent gp = FXMLLoader.load(getClass().getResource("CalculatorGUI.fxml"));
        
        primaryStage.setScene(new Scene(gp));
        
        primaryStage.show();
        
        primaryStage.setTitle("Simple Calculator");  
    }
}
