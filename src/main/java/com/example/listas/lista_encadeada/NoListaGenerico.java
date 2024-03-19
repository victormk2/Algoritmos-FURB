package com.example.listas.lista_encadeada;

public class NoListaGenerico<T> {
    
    private T info;
    private NoListaGenerico<T> proximo;

    public void setInfo(T value){
        this.info = value;
    }

    public T getInfo(){
        return this.info;
    }

    public void setProximo(NoListaGenerico<T> proximo) {
        this.proximo = proximo;
    }

    public NoListaGenerico<T> getProximo(){
        return this.proximo;
    }
}
