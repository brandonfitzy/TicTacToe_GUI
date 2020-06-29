module com.fitzpatrick {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fitzpatrick to javafx.fxml;
    exports com.fitzpatrick;
}