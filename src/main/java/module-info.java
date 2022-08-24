module com.example.trocajanelalive {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trocajanelalive to javafx.fxml;
    exports com.example.trocajanelalive;
}