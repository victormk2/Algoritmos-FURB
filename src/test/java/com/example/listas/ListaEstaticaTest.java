package com.example.listas;


import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import com.example.listas.lista_estatica.ListaEstatica;

public class ListaEstaticaTest {

    ListaEstatica listaEstatica;

    @Before
    public void setUp(){
        listaEstatica = new ListaEstatica();
    }

    @Test
    public void inserir(){
        listaEstatica.inserir(10);

        Assertions.assertThat(listaEstatica.info[0]).isEqualTo(10);
    }

    @Test
    public void redimensionar(){
        for(int i = 0; i < 10; i++) {
            listaEstatica.inserir(i);
        }

        Assertions.assertThat(listaEstatica.info.length).isEqualTo(10);
        Assertions.assertThat(listaEstatica.tamanho).isEqualTo(10);        

        listaEstatica.inserir(10);

        Assertions.assertThat(listaEstatica.info.length).isEqualTo(20);
        Assertions.assertThat(listaEstatica.tamanho).isEqualTo(11);        
    }
}
