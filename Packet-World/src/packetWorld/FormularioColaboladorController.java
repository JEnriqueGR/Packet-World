/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package packetWorld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author cocoq
 */
public class FormularioColaboladorController implements Initializable {

    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfApPaterno;
    @FXML
    private TextField tfApMaterno;
    @FXML
    private TextField tfPassword;
    @FXML
    private ComboBox<?> cbRol;
    @FXML
    private TextField tfCURP;
    @FXML
    private TextField tfEmail;
    @FXML
    private TextField tfNoPer;
    @FXML
    private ComboBox<?> cbSucursal;
    @FXML
    private TextField tfNoLic;
    @FXML
    private ImageView ivFoto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clicBtnGuardar(ActionEvent event) {
    }

    @FXML
    private void clicBtnCancelar(ActionEvent event) {
    }

    @FXML
    private void clickSeleccionar(ActionEvent event) {
    }
    
}
