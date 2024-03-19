package com.example.listas.lista_encadeada;

import static org.junit.Assert.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ListaEncadeadaTest {

    private ListaEncadeadaGenerica<Integer> listaEncadeada;

    @Before
    public void setUp(){
        listaEncadeada = new ListaEncadeadaGenerica<Integer>();
    }


    @Test
    public void caso01(){
        Assertions.assertThat(listaEncadeada.estaVazia()).isTrue();
    }

    @Test
    public void caso02(){
        listaEncadeada.inserir(5);
    
        Assertions.assertThat(listaEncadeada.estaVazia()).isFalse();
    }
    @Test
    public void caso03(){
        listaEncadeada.inserir(5);
    
        NoListaGenerico<Integer> firstGenerico = listaEncadeada.getPrimeiro();
        Assertions.assertThat(firstGenerico.getInfo()).isEqualTo(5);
        Assertions.assertThat(listaEncadeada.obterComprimento()).isEqualTo(1);
    }

    @Test
    public void caso04() throws Exception {
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);

        NoListaGenerico<Integer> firstGenerico = listaEncadeada.obterNo(0);
        NoListaGenerico<Integer> secondGenerico = listaEncadeada.obterNo(1);
        NoListaGenerico<Integer> thirdGenerico = listaEncadeada.obterNo(2);

        Assertions.assertThat(firstGenerico.getInfo()).isEqualTo(15);
        Assertions.assertThat(secondGenerico.getInfo()).isEqualTo(10);
        Assertions.assertThat(thirdGenerico.getInfo()).isEqualTo(5);

        Assertions.assertThat(listaEncadeada.obterComprimento()).isEqualTo(3);
    }

    @Test
    public void caso05() throws Exception {
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);

        NoListaGenerico generico = listaEncadeada.buscar(20);

        Assertions.assertThat(listaEncadeada.obterComprimento()).isEqualTo(4);
        Assertions.assertThat(generico.getInfo()).isEqualTo(20);
    }

    @Test
    public void caso06() throws Exception {
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);

        NoListaGenerico generico = listaEncadeada.buscar(15);

        Assertions.assertThat(listaEncadeada.obterComprimento()).isEqualTo(4);
        Assertions.assertThat(generico.getInfo()).isEqualTo(15);
    }
 
    @Test
    public void caso07() throws Exception {
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);

        NoListaGenerico generico = listaEncadeada.buscar(50);

        Assertions.assertThat(listaEncadeada.obterComprimento()).isEqualTo(4);
        Assertions.assertThat(generico).isNull();
    }

    @Test
    public void caso08() throws Exception {
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);
        listaEncadeada.retirar(20);

        NoListaGenerico generico5 = listaEncadeada.buscar(5);
        NoListaGenerico generico10 = listaEncadeada.buscar(10);
        NoListaGenerico generico15 = listaEncadeada.buscar(15);
        NoListaGenerico generico20 = listaEncadeada.buscar(20);

        Assertions.assertThat(generico5.getInfo()).isEqualTo(5);
        Assertions.assertThat(generico10.getInfo()).isEqualTo(10);
        Assertions.assertThat(generico15.getInfo()).isEqualTo(15);
        Assertions.assertThat(generico20).isNull();
    }

    @Test
    public void caso09(){
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);
        listaEncadeada.retirar(15);

        NoListaGenerico generico5 = listaEncadeada.buscar(5);
        NoListaGenerico generico10 = listaEncadeada.buscar(10);
        NoListaGenerico generico15 = listaEncadeada.buscar(15);
        NoListaGenerico generico20 = listaEncadeada.buscar(20);

        Assertions.assertThat(generico5.getInfo()).isEqualTo(5);
        Assertions.assertThat(generico10.getInfo()).isEqualTo(10);
        Assertions.assertThat(generico20.getInfo()).isEqualTo(20);
        Assertions.assertThat(generico15).isNull();
    }

    @Test
    public void caso10() throws Exception {
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);

        NoListaGenerico generico =  listaEncadeada.obterNo(0);

        Assertions.assertThat(generico.getInfo()).isEqualTo(20);
    }

    @Test
    public void caso11() throws Exception {
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);

        NoListaGenerico generico =  listaEncadeada.obterNo(3);

        Assertions.assertThat(generico.getInfo()).isEqualTo(5);
    }

    @Test
    public void caso12() throws Exception {
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            listaEncadeada.obterNo(10);
        });
    }

    @Test
    public void caso13(){
        Assertions.assertThat(listaEncadeada.obterComprimento()).isEqualTo(0);
    }
    
    @Test
    public void caso14(){
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);
        
        Assertions.assertThat(listaEncadeada.obterComprimento()).isEqualTo(4);
    }
}
