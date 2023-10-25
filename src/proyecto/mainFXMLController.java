/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author danie
 */
public class mainFXMLController implements Initializable {
    public pila pila = new pila();
    public static String fecha;
    
    @FXML
    private TableView<producto> tabla;
    @FXML
    private TableColumn<producto, String> id;
    @FXML
    private TableColumn<producto, String> nom;
    @FXML
    private TableColumn<producto, String> fechal;
    @FXML
    private TableColumn<producto, String> fechav;
    @FXML
    private TableColumn<producto, Float> precio;
    
    public static ObservableList<producto> lista = FXCollections.observableArrayList();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        id.setCellValueFactory(new PropertyValueFactory<producto, String>("id"));
        nom.setCellValueFactory(new PropertyValueFactory<producto, String>("nom"));
        fechal.setCellValueFactory(new PropertyValueFactory<producto, String>("fechal"));
        fechav.setCellValueFactory(new PropertyValueFactory<producto, String>("fechav"));
        precio.setCellValueFactory(new PropertyValueFactory<producto, Float>("precio"));
        tabla.setItems(lista);
        // TODO
    }    
    
}
