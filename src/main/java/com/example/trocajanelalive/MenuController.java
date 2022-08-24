package com.example.trocajanelalive;

import java.util.function.Function;

public class MenuController {

    Function<String,Void> callBack;
    public void janela1(){
        if(callBack != null){
            callBack.apply("olaMundo");
        }
    }

    public void janela2(){
        if(callBack != null){
            callBack.apply("tabela");
        }
    }
}
