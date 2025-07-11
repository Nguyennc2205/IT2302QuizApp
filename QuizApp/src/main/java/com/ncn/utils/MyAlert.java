/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncn.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlert {
    private static MyAlert instance;
    private final Alert alert;
    
    private MyAlert(){
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        this.alert.setHeaderText("QuizApp");
    }
    
    public static MyAlert getInstance(){
        if (instance == null)
            instance = new MyAlert();
        return instance;
    }
    
    public void showMsg(String message){
        this.alert.setContentText(message);
        this.alert.showAndWait();
    }
}
