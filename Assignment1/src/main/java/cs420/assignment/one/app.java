package cs420.assignment.one;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class app extends Application {

    @Override
    public void start(Stage primaryStage) {

        //creates container for selection
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("option 1", "option 2");

        //creates textarea for status messages
        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        //creates buttons
        Button selectButton = new Button("Select");
        Button deleteButton = new Button("Delete");
        selectButton.setOnAction(event -> {
            String selectedOption = comboBox.getSelectionModel().getSelectedItem();
            if (selectedOption!= null) {
                textArea.appendText(selectedOption + " selected\n");
            }
        });

        //adds functionality to buttons
        deleteButton.setOnAction(event -> {
            String selectedOption = comboBox.getSelectionModel().getSelectedItem();
            if (selectedOption!= null) {
                textArea.appendText(selectedOption + " deleted\n");
            }
        });

        //creates the layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(
                new Label("Select an option:"),
                comboBox,
                selectButton,
                deleteButton,
                new Label("Messages:"),
                textArea
        );
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        //creates the scene and stage
        Scene scene = new Scene(layout, 300, 400);
        primaryStage.setTitle("Dashboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}