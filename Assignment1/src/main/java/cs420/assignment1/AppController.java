package cs420.assignment1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class AppController {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextArea textArea;

    @FXML
    private Button select;

    @FXML
    private Button delete;

    @FXML
    public void initialize() {
        comboBox.getItems().addAll("option 1", "option 2");
    }

    @FXML
    public void handleSelect() {
        String selectedOption = comboBox.getSelectionModel().getSelectedItem();
        if (selectedOption != null) {
            textArea.appendText(selectedOption + " selected\n");
        }
    }

    @FXML
    public void handleDelete() {
        String selectedOption = comboBox.getSelectionModel().getSelectedItem();
        if (selectedOption != null) {
            textArea.appendText(selectedOption + " deleted\n");
        }
    }
}
