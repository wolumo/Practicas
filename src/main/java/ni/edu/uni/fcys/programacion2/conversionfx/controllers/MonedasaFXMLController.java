/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import paketaso.MonedaConversion;

/**
 * FXML Controller class
 *
 * @author JADPA18
 */
public class MonedasaFXMLController implements Initializable {
@FXML
public ComboBox cmbLeft;
@FXML
public ComboBox cmbRight;
@FXML
public TextField txtData;
@FXML 
public TextField txtResult;
       

public ObservableList<String> items;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    // TODO
    items = FXCollections.observableArrayList("Cordobas" , "Dolares" , "Euros");
        cmbLeft.setItems(items);
        cmbRight.setItems(items);
    }
    public void btnCalcularAction (){
        float a , b = 0;
        if (cmbLeft.getValue().equals("Cordobas")){
            if(cmbRight.getValue().equals("Dolares")){
            a = Float.parseFloat(txtData.getText());
            b = MonedaConversion.CordobasToDolares(a);    
            }    
        }
        txtResult.setText(String.valueOf(b));
    }

}
