package com.ncn.quizapp;

import com.ncn.pojo.Level;
import com.ncn.utils.MyAlert;
import com.ncn.utils.MyStage;
import com.ncn.utils.theme.DarkFactory;
import com.ncn.utils.theme.DefaultFactory;
import com.ncn.utils.theme.LightFactory;
import com.ncn.utils.theme.Theme;
import com.ncn.utils.theme.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class PrimaryController implements Initializable {

    @FXML private ComboBox<Theme> cbThemes;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(Theme.values()));
    }

    public void changeTheme(ActionEvent event) {
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }

    public void handleQuestionManagement(ActionEvent event) throws IOException {
        MyStage.getInstace().showStage("question.fxml");
    }

    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Coming soon...");
    }

    public void handleExam(ActionEvent event) {
        MyAlert.getInstance().showMsg("Coming soon...");
    }

    public void handleRegister(ActionEvent event) {
        MyAlert.getInstance().showMsg("Coming soon...");
    }

}
