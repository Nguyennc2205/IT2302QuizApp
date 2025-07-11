/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ncn.quizapp;

import com.ncn.pojo.Category;
import com.ncn.pojo.Level;
import com.ncn.services.CategoryServices;
import com.ncn.services.LevelServices;
import com.ncn.utils.JdbcConnector;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionController implements Initializable {

    @FXML
    private ComboBox<Category> cbCates;
    @FXML
    private ComboBox<Level> cbLevels;

    private final static CategoryServices cateService = new CategoryServices();
    private final static LevelServices levelService = new LevelServices();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.cbCates.setItems(FXCollections.observableList(cateService.getCates()));
            this.cbLevels.setItems(FXCollections.observableList(levelService.getLevels()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
