package com.example.listas.lista_encadeada;

public class NoLista {
    
    private int info;
    private NoLista proximo;

    public void setInfo(int value){
        this.info = value;
    }

    public int getInfo(){
        return this.info;
    }

    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }

    public NoLista getProximo(){
        return this.proximo;
    }
}
