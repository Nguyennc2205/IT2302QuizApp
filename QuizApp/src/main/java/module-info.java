module com.ncn.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;

    opens com.ncn.quizapp to javafx.fxml;
    exports com.ncn.quizapp;
}
