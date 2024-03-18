package com.example.listas.lista_encadeada;

// Lista Simplismente Encadeada
public class ListaEncadeada {

    private NoLista primeiro;

    public void inserir(int value) {
        NoLista novo = new NoLista();
        novo.setInfo(value);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
    }

    public void exibir() {
        NoLista nodo = this.primeiro;

        while (nodo != null) {
            System.out.println(nodo.getInfo());
            nodo = nodo.getProximo();
        }
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public NoLista buscar(int valor) {
        NoLista nodo = this.primeiro;

        while (nodo != null) {
            if (nodo.getInfo() == valor) {
                return nodo;
            }

            nodo = nodo.getProximo();
        }

        return null;
    }

    public void retirar(int valor){
        NoLista anterior = null;
        NoLista atual = this.primeiro;
        
        while (atual != null && atual.getInfo() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null){
            if (atual.equals(this.primeiro)) {
                this.primeiro = atual.getProximo();
            }else {
                anterior.setProximo(atual);
            }
        }
    }
}
