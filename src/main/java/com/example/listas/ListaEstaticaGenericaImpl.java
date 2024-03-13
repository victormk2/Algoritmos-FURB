package com.example.listas;

public class ListaEstaticaGenericaImpl  {
    
    private ListaEstaticaGenerica<Integer> lista;

    public ListaEstaticaGenerica<Integer> setLista(){
        this.lista = new ListaEstaticaGenerica<Integer>();

        return lista;
    }
}
