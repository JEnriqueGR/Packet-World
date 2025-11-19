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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author cocoq
 */
public class XMLAdminClienteController implements Initializable {

    @FXML
    private TextField tfBuscar;
    @FXML
    private TableView<?> TabProf;
    @FXML
    private TableColumn<?, ?> colTel;
    @FXML
    private TableColumn<?, ?> colNom;
    @FXML
    private TableColumn<?, ?> colApt;
    @FXML
    private TableColumn<?, ?> colAmat;
    @FXML
    private TableColumn<?, ?> colDir;
    @FXML
    private TableColumn<?, ?> colEmail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ClickIDRegistrar(ActionEvent event) {
    }

    @FXML
    private void ClickIDEditar(ActionEvent event) {
    }

    @FXML
    private void ClickEliminar(ActionEvent event) {
    }
    
}
