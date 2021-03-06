package gui;

import core.Clavier;
import core.Instruments;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Valoo
 */
public class Melordi extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Melordi!");
        
        Group root = new Group();
        Scene scene = new Scene(root, 400,200,Color.CORAL);
        
        Instruments myInstrument = new Instruments();
        
        
        Clavier myClavier = new Clavier(myInstrument);
        
        root.getChildren().add(myClavier);
        
        myClavier.requestFocus();
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
