package com.example.listas.lista_encadeada;

// Lista Simplismente Encadeada
public class ListaEncadeadaGenerica<T> {

    private NoListaGenerico<T> primeiro;

    public void inserir(T value) {
        NoListaGenerico<T> novo = new NoListaGenerico<T>();
        novo.setInfo(value);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
    }

    public void exibir() {
        NoListaGenerico<T> nodo = this.primeiro;

        while (nodo != null) {
            System.out.println(nodo.getInfo());
            nodo = nodo.getProximo();
        }
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public NoListaGenerico<T> buscar(T valor) {
        NoListaGenerico<T> nodo = this.primeiro;

        while (nodo != null) {
            if (nodo.getInfo() == valor) {
                return nodo;
            }

            nodo = nodo.getProximo();
        }

        return null;
    }

    public void retirar(T valor){
        NoListaGenerico<T> anterior = null;
        NoListaGenerico<T> atual = this.primeiro;
        
        while (atual != null && atual.getInfo() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null){
            if (atual.equals(this.primeiro)) {
                this.primeiro = atual.getProximo();
            }else {
                anterior.setProximo(atual.getProximo());
            }
        }
    }

    public NoListaGenerico<T> getPrimeiro(){
        return this.primeiro;
    }

    public int obterComprimento(){
        NoListaGenerico<T> nodo = this.primeiro;
        int counter = 0;
        
        while (nodo != null) {
            counter++;
            nodo = nodo.getProximo();
        }

        return counter;
    }

    public NoListaGenerico<T> obterNo(int position) throws Exception{
        if(position < 0){
            throw new IndexOutOfBoundsException();
        }

        NoListaGenerico<T> nodo = this.primeiro;
        int counter = 0;

        while (nodo != null) {
            if (counter == position){
                return nodo;
            }

            counter++;
            nodo = nodo.getProximo();
        }

        throw new IndexOutOfBoundsException();
    }

    public String toString(){
        NoListaGenerico<T> nodo = this.primeiro;
        StringBuilder stringBuilder = new StringBuilder();

        while (nodo != null) {
            stringBuilder.append(nodo.getInfo());
            NoListaGenerico<T> nextNodo = nodo.getProximo();

            if(nextNodo != null){
                stringBuilder.append(",");
            }

            nodo = nextNodo;
        }

        return stringBuilder.toString();
    }
}
