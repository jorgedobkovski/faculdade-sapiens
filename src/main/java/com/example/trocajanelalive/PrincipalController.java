package com.example.trocajanelalive;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.FlowPane;

public class PrincipalController {
    @FXML
    private FlowPane menu;
    @FXML
    private FlowPane conteudo;

    public Void trocarJanela(String nomeTela) {
        Node tela = new ViewBuilder(nomeTela).gerarTela();
        conteudo.getChildren().removeAll(conteudo.getChildren());
        conteudo.getChildren().add(tela);
        return null;
    }


    @FXML
    private void initialize() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalController.class.getResource("menu.fxml"));
            Node menuCarregado = fxmlLoader.load();
            menu.getChildren().add(menuCarregado);
            Object variavelMenuControle = fxmlLoader.getController();
            if(variavelMenuControle instanceof MenuController)
                ((MenuController) variavelMenuControle).callBack = this::trocarJanela;

            fxmlLoader = new FXMLLoader(PrincipalController.class.getResource("inicio.fxml"));
            Node principal = fxmlLoader.load();
            conteudo.getChildren().add(principal);
        }catch (Throwable t){
            t.printStackTrace();
        }

    }

}