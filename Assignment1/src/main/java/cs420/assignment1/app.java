package cs420.assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class app extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));

        // Create the scene with the loaded FXML layout
        Scene scene = new Scene(root);

        // Set the title of the window (Stage)
        primaryStage.setTitle("Dashboard");

        // Set the scene on the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the application
        launch(args);
    }
}
