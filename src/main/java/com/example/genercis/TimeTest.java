package com.example.genercis;

import com.example.listas.lista_encadeada.ListaEncadeadaGenerica;
import com.example.listas.lista_encadeada.NoListaGenerico;

public class TimeTest {
    public static <T> void listaEncadeadaTest(ListaEncadeadaGenerica<T> listaEncadeadaGenerica, T example, int numberOfElements) {
        long startTime = System.nanoTime();

        for (int i = 0; i < numberOfElements; i++) {
            listaEncadeadaGenerica.inserir(example);
        }

        for (int i = 0; i < numberOfElements; i++) {
            NoListaGenerico<T> elementoEncontrado = listaEncadeadaGenerica.buscar(example);
            T elemento = elementoEncontrado.getInfo();
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para lista encadeada: " + duration + "ms");
    }
}
