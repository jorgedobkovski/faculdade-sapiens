package com.example.trocajanelalive;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListaTest {


    @FXML
    private TableView table;

    @FXML
    public void initialize() {
        table.setEditable(true);

        TableColumn nomeCol = new TableColumn("First Name");
        nomeCol.setMinWidth(100);
        nomeCol.setCellValueFactory(
                new PropertyValueFactory<Pessoa, String>("nome"));


        TableColumn sobreNomeCol = new TableColumn("Last Name");
        sobreNomeCol.setMinWidth(100);
        sobreNomeCol.setCellValueFactory(
                new PropertyValueFactory<Pessoa, String>("sobreNome"));


        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(100);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<Pessoa, String>("email"));

        table.setItems(data);
        table.getColumns().addAll(nomeCol,sobreNomeCol,emailCol);
        table.setEditable(false);
    }

    final ObservableList<Pessoa> data = FXCollections.observableArrayList(
            new Pessoa("Jacob", "Smith", "jacob.smith@example.com"),
            new Pessoa("Isabella", "Johnson", "isabella.johnson@example.com"),
            new Pessoa("Ethan", "Williams", "ethan.williams@example.com"),
            new Pessoa("Emma", "Jones", "emma.jones@example.com"),
            new Pessoa("Michael", "Brown", "michael.brown@example.com")
    );


    public void Salvar() {
        for (Pessoa pessoa : data) {
            System.out.println( pessoa.getNome() + " " + pessoa.getSobreNome() + " " + pessoa.getEmail() );
        }
    }

    public class Pessoa {
        private final SimpleStringProperty nome;
        private final SimpleStringProperty  sobreNome;
        private final SimpleStringProperty  email;

        private Pessoa(String nome, String sobreNome, String email) {
            this.nome = new SimpleStringProperty(nome);
            this.sobreNome = new SimpleStringProperty(sobreNome);
            this.email = new SimpleStringProperty(email);
        }

        public String getNome() {
            return nome.get();
        }

        public String getSobreNome() {
            return sobreNome.get();
        }

        public String getEmail() {
            return email.get();
        }
    }
}
