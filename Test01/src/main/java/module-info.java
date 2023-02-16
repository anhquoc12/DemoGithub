module com.mycompany.test01 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.test01 to javafx.fxml;
    exports com.mycompany.test01;
}
