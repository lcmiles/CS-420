module cs420.cs420_final_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens cs420.cs420_final_project to javafx.fxml;
    exports cs420.cs420_final_project;
}