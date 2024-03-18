package com.example.listas.lista_estatica;

// Lista Estática
public class ListaEstatica {

    public int[] info;
    public int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    private void redimensionar() {
        int[] novaInfo = new int[info.length + 10];

        for (int i = 0; i < info.length; i++) {
            novaInfo[i] = info[i];
        }

        info = novaInfo;
    }

    public int buscar(int valor) {
        int position = -1;

        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                position = i;
            }
        }

        return position;
    }

    public void remover(int valor) {
        int position = buscar(valor);

        if (position > -1) {
            for (int i = position; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }

            tamanho--;
        }
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

}
