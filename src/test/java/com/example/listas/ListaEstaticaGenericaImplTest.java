package com.example.listas;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import com.example.listas.lista_estatica.ListaEstaticaGenerica;
import com.example.listas.lista_estatica.ListaEstaticaGenericaImpl;

public class ListaEstaticaGenericaImplTest {

    private ListaEstaticaGenerica<Integer> listaTest;

    @Before
    public void setUp(){
        listaTest = new ListaEstaticaGenericaImpl().setLista();
    }

    @Test
    public void caso01(){
        listaTest.inserir(5);
        listaTest.inserir(10);
        listaTest.inserir(15);
        listaTest.inserir(20);

        listaTest.inverter();

        Assertions.assertThat(listaTest.toString()).isEqualTo("20,15,10,5");
    }

    @Test
    public void caso02(){
        listaTest.inserir(5);
        listaTest.inserir(10);
        listaTest.inserir(15);
        listaTest.inserir(20);
        listaTest.inserir(25);

        listaTest.inverter();

        Assertions.assertThat(listaTest.toString()).isEqualTo("25,20,15,10,5");
    }
}
