
package com.mycompany.maquinacoxinha;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Coxinha extends Maquina{
    @FXML
    private TextField textestoque;
    @FXML
    private TextField textquantidade;
   
   @FXML
   @Override
   public int abastecer(int quantidade){
       super();
        this.quantidade = quantidade;
        if(quantidade>0){
            return estoque + quantidade;
        }
        return estoque;
    }
    @FXML
    @Override
     public void zerarMaquina(){
       setEstoque(0);
    }
}
