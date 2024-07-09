
package com.mycompany.maquinacoxinha;

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
    public int abastecer(int quantidade){
        this.quantidade = quantidade;
        if(quantidade>0){
            return estoque + quantidade;
        }
        return estoque;
    }
    public void venderCoxinha(){
        if(estoque>0){
            estoque --;
        }
    }
    public int venderCoxinha(int quantidade){
        this.quantidade = quantidade;
        if(estoque>0){
           return estoque - quantidade;
        }
        else{
            return estoque;
        }
    }
    public void zerarMaquina(){
        estoque = 0;
    }
}
