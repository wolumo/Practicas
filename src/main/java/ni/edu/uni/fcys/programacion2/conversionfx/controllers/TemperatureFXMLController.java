/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import paketaso.TemperatureConversion;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class TemperatureFXMLController implements Initializable {
    //botones
    @FXML
    public Button btnCompute; 
    @FXML
    public Button btnClean;
    
    //text fields
    @FXML
    public TextField txtCelcius;
    @FXML 
    public TextField txtFah;
    @FXML
    public TextField txtResult;
    
    //rbtn
    @FXML
    public RadioButton rbtnCelcius;
    @FXML
    public RadioButton rbtnFah;
    
    //actions
    @FXML
    public void btnComputeAction(){
        float c, f=0;
        if(rbtnCelcius.isSelected()){
            c =Float.parseFloat(txtCelcius.getText());
            f =  TemperatureConversion.FromCelciusToFarengeit(c);
            
        }
        else if(rbtnFah.isSelected()){
            c = Float.parseFloat(txtFah.getText());
            f = TemperatureConversion.FromfarenheintTOcelcisu(c);
            
        }
        else {
//            JOptionPane.showMessageDialog(null,"Selecciona un radio button");
//            return;
        }
        txtResult.setText(String.valueOf(f));
    }
    @FXML
    public void btnCleanAction(){
        
    }
    @FXML
    public void rbtnCelciusAction(){
        activateTextFiel();
    }
    @FXML
    public void  rbtnFarenheitAction(){
        activateTextFiel();
    } 
    private void activateTextFiel(){
        if(rbtnCelcius.isSelected()){
            txtCelcius.setEditable(true);
            txtCelcius.requestFocus();
            txtFah.setEditable(false);
        }
        else if (rbtnFah.isSelected()){
            txtFah.setEditable(true);
            txtFah.requestFocus();
            txtCelcius.setEditable(false);
        }
        cleanTextFiel();
    }
    private void cleanTextFiel(){
        txtCelcius.setText("");
        txtFah.setText("");
        txtResult.setText("");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
