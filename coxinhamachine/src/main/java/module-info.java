module main {
    requires javafx.controls;
    requires javafx.fxml;

    opens construtoresdamaquina to javafx.fxml;
    exports construtoresdamaquina;
}
