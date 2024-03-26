package com.example.genercis;

import com.example.listas.lista_encadeada.ListaEncadeadaGenerica;

public class MemoryTest {

    public static <T> void listaEncadeadaTest(ListaEncadeadaGenerica<T> listaEncadeadaGenerica, T example, int numberOfElements) {
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        for (int i = 0; i < numberOfElements; i++) {
            listaEncadeadaGenerica.inserir(example);
        }

        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada pela lista encadeada: " + memoryUsed + " bytes");
    }

}