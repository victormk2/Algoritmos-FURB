package com.example.exercicios.exec03_01;

import java.sql.Date;

import com.example.listas.lista_encadeada.ListaEncadeadaGenerica;

public class RedeSocial {
    public static void main(String[] args) {
        ListaEncadeadaGenerica<Publicacao> listaEncadeadaGenerica = new ListaEncadeadaGenerica<>();

        System.out.println("Exercicio 1");
        inserir1000(listaEncadeadaGenerica);
        Publicacao publicacao = new Publicacao();
        publicacao.setData(new Date(0));
        publicacao.setTextoPublicacao("Texto");
        inserir1(listaEncadeadaGenerica, publicacao);
        buscar1(listaEncadeadaGenerica, publicacao);
        remover1(listaEncadeadaGenerica, publicacao);
        obterQuantidade(listaEncadeadaGenerica);
    }

    private static void inserir1000(ListaEncadeadaGenerica<Publicacao> listaEncadeadaGenerica) {
        System.out.println("INSERIR 1000 ELEMENTOS");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            Publicacao publicacao = new Publicacao();
            publicacao.setData(new Date(0));
            publicacao.setTextoPublicacao("Texto" + i);
            listaEncadeadaGenerica.inserir(publicacao);
        }
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para lista encadeada com 1000 registros: " + duration + "ms");
        System.out.println("Memória usada pela lista encadeada com 1000 registros: " + memoryUsed + " bytes");
    }

    private static void inserir1(ListaEncadeadaGenerica<Publicacao> listaEncadeadaGenerica, Publicacao publicacao) {
        System.out.println("INSERIR 1 ELEMENTO");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        listaEncadeadaGenerica.inserir(publicacao);
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para lista encadeada com 1 registro: " + duration + "ms");
        System.out.println("Memória usada pela lista encadeada com 1 registro: " + memoryUsed + " bytes");
    }

    private static void buscar1(ListaEncadeadaGenerica<Publicacao> listaEncadeadaGenerica, Publicacao publicacao) {
        System.out.println("BUSCAR 1 ELEMENTO");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        listaEncadeadaGenerica.buscar(publicacao);
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para buscar na lista encadeada com 1 registro: " + duration + "ms");
        System.out.println("Memória usada pela lista encadeada para buscar 1 registro: " + memoryUsed + " bytes");
    }

    private static void remover1(ListaEncadeadaGenerica<Publicacao> listaEncadeadaGenerica, Publicacao publicacao) {
        System.out.println("REMOVER 1 ELEMENTO");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        listaEncadeadaGenerica.retirar(publicacao);
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para remover na lista encadeada com 1 registro: " + duration + "ms");
        System.out.println("Memória usada pela lista encadeada para remover 1 registro: " + memoryUsed + " bytes");
    }

    private static void obterQuantidade(ListaEncadeadaGenerica<Publicacao> listaEncadeadaGenerica){
        System.out.println("OBTER QUANTIDADE");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        listaEncadeadaGenerica.obterComprimento();
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total pela lista encadeada para obter quantidade: " + duration + "ms");
        System.out.println("Memória usada pela lista encadeada para obter a quantidade: " + memoryUsed + " bytes");
    }
}
