module org.example.cst4finalproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.example.cst4finalproject to javafx.fxml;
    exports org.example.cst4finalproject;
}