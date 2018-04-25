/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocom_final.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Geek-Programmer
 */
public class HomeController implements Initializable {
    
    @FXML
    private Button btn_login;
    @FXML
    private Button btn_signup;
    @FXML
    private AnchorPane view_login;
    @FXML
    private AnchorPane view_signup;
    @FXML
    private Label txtErrLogin, txtErrorRegistre;
    @FXML
    private Button btn_registre, btn_exit;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btn_login) {
            view_login.toFront();
        }
        else
            if (event.getSource() == btn_signup) {
            view_signup.toFront();
        }
    }
    
    @FXML
    private void loginUserAction(ActionEvent event) throws IOException
    {
        txtErrLogin.setText("Se ha producido un error");
        Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void registreUserAction(ActionEvent event)
    {
        txtErrorRegistre.setText("No se puede registrar");
    }
    
    @FXML
    private void exitActionEvent(ActionEvent event)
    {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Codigo de inicio
    }    
    
}
