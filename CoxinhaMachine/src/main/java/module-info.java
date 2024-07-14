module main {
    requires javafx.controls;
    requires javafx.fxml;

    opens ConstrutoresdaMaquina to javafx.fxml;
    exports ConstrutoresdaMaquina;
}
