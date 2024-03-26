package com.example.exercicios.exec03_01;

import java.sql.Date;

import com.example.listas.lista_estatica.ListaEstaticaGenerica;

public class DiarioDeClasse {
    public static void main(String[] args) {
        ListaEstaticaGenerica<Aluno> listaEstaticaGenerica = new ListaEstaticaGenerica<>();

        System.out.println("Exercicio 1");
        inserir1000(listaEstaticaGenerica);
        Aluno aluno = new Aluno();
        aluno.setDataNascimento(new Date(0));
        aluno.setNome("Nome");
        inserir1(listaEstaticaGenerica, aluno);
        buscar1(listaEstaticaGenerica, aluno);
        remover1(listaEstaticaGenerica, aluno);
        obterQuantidade(listaEstaticaGenerica);
    }

    private static void inserir1000(ListaEstaticaGenerica<Aluno> listaEstaticaGenerica) {
        System.out.println("INSERIR 1000 ELEMENTOS");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            Aluno aluno = new Aluno();
            aluno.setDataNascimento(new Date(0));
            aluno.setNome("Nome" + i);
            listaEstaticaGenerica.inserir(aluno);
        }
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para lista estatica com 1000 registros: " + duration + "ms");
        System.out.println("Memória usada pela lista estatica com 1000 registros: " + memoryUsed + " bytes");
    }

    private static void inserir1(ListaEstaticaGenerica<Aluno> listaEstaticaGenerica, Aluno aluno) {
        System.out.println("INSERIR 1 ELEMENTO");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        listaEstaticaGenerica.inserir(aluno);
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para lista estatica com 1 registro: " + duration + "ms");
        System.out.println("Memória usada pela lista estatica com 1 registro: " + memoryUsed + " bytes");
    }

    private static void buscar1(ListaEstaticaGenerica<Aluno> listaEstaticaGenerica, Aluno aluno) {
        System.out.println("BUSCAR 1 ELEMENTO");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        listaEstaticaGenerica.buscar(aluno);
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para buscar na lista estatica com 1 registro: " + duration + "ms");
        System.out.println("Memória usada pela lista estatica para buscar 1 registro: " + memoryUsed + " bytes");
    }

    private static void remover1(ListaEstaticaGenerica<Aluno> listaEstaticaGenerica, Aluno aluno) {
        System.out.println("REMOVER 1 ELEMENTO");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        listaEstaticaGenerica.remover(aluno);
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para remover na lista estatica com 1 registro: " + duration + "ms");
        System.out.println("Memória usada pela lista estatica para remover 1 registro: " + memoryUsed + " bytes");
    }

    private static void obterQuantidade(ListaEstaticaGenerica<Aluno> listaEstaticaGenerica){
        System.out.println("OBTER QUANTIDADE");
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        listaEstaticaGenerica.getTamanho();
        long endTime = System.nanoTime();
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total pela lista estatica para obter quantidade: " + duration + "ms");
        System.out.println("Memória usada pela lista estatica para obter a quantidade: " + memoryUsed + " bytes");
    }
}
