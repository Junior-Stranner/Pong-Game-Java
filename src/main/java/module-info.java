module br.com.judev.ponggame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens br.com.judev.ponggame to javafx.fxml;
    exports br.com.judev.ponggame;
}