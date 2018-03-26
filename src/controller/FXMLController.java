/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Person;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class FXMLController implements Initializable {

    @FXML
    private TableView<Person> tableViewTabela;

    @FXML
    private TableColumn<Person, String> tablecolumnId;

    @FXML
    private TableColumn<Person, String> tablecolumnNome;

    @FXML
    private TableColumn<Person, String> tablecolumnQtd;
    
    @FXML
    private TableColumn<Person, String>  tableColumnValor;

    @FXML
    private Button buttonAdd1;

    @FXML
    private Button buttonAdd2;

    final ObservableList<Person> data = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data.add(new Person(0, "ads"));
        tablecolumnId.setCellValueFactory(
                new PropertyValueFactory<>("firstName"));

        tablecolumnNome.setCellValueFactory(
                new PropertyValueFactory<>("lastName"));

        tablecolumnQtd.setCellValueFactory(
                new PropertyValueFactory<>("postalCode"));
        tableColumnValor.setCellValueFactory(
                new PropertyValueFactory<>("city"));
        buttonAdd1.setOnAction((event) -> {
            Person at = new Person(5, "Gonçalves", 1);
            boolean checker = true;
            for (Person person : data) {
                if (Objects.equals(at.getFirstName(), person.getFirstName())) {
                    person.setPostalCode(at.getPostalCode() + person.getPostalCode());
                    person.setCity(person.getFirstName()*person.getPostalCode());
                    checker = false;
                    break;
                }
            }
            if (checker) {                
                at.setCity(at.getFirstName()*at.getPostalCode());
                data.add(at);
            }
        });
        buttonAdd2.setOnAction((event) -> {
            Person at = new Person(2, "Gonçalves", 1);
            boolean ver = true;
            for (Person person : data) {
                if (person.getFirstName() == at.getFirstName()) {
                    person.setPostalCode(at.getPostalCode() + person.getPostalCode());
                    ver = false;
                    break;
                }
            }
            if (ver) {
                data.add(at);
            }
        });
        tableViewTabela.setItems(data);

    }
}
