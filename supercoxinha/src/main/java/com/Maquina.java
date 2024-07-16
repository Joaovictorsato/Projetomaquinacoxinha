
package com;

public class Maquina {
    private int estoque;
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public Maquina(){
        estoque = 0;
        quantidade = 0;
    }
    public void abastecer(int quantidade){
        this.quantidade = quantidade;
        if(quantidade>0){
             estoque +=quantidade;
        }
       
    }
    public void venderCoxinha(){
        if(estoque>0){
            estoque --;
        }
    }
    public void venderCoxinha(int quantidade){
        this.quantidade = quantidade;
        if(estoque>0){
            estoque -=quantidade;
        }
       
    }
    public void zerarMaquina(){
        estoque = 0;
    }
}


