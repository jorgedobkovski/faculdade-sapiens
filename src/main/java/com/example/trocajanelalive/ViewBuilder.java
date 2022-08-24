package com.example.trocajanelalive;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;

public class ViewBuilder {
    private String nomeTela;

    public ViewBuilder(String nomeTela){
        this.nomeTela = nomeTela;
    }

    public Node gerarTela(){
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalController.class.getResource(nomeTela + ".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
