module vera.infhotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens vera.infhotel to javafx.fxml;
    exports vera.infhotel;
}