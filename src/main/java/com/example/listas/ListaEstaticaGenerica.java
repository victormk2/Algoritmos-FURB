package com.example.listas;

public class ListaEstaticaGenerica<T> {
    T[] info;
    int tamanho;

    public ListaEstaticaGenerica() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    private void redimensionar() {
        T[] novaInfo = (T[]) new Object[info.length + 10];

        for (int i = 0; i < info.length; i++) {
            novaInfo[i] = info[i];
        }

        info = novaInfo;
    }

    public int buscar(T valor) {
        int position = -1;

        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                position = i;
            }
        }

        return position;
    }

    public void remover(T valor) {
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

    public T obterElemento(int position) throws Exception {
        if (position > tamanho) {
            throw new IndexOutOfBoundsException();
        }

        return info[position];
    }

    public void liberar() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(info[i]);

            if (i != tamanho -1) {
                stringBuilder.append(",");
            }
        }

        return stringBuilder.toString();
    }

    public void inverter(){
        int inicio = 0;
        int fim = tamanho - 1;
        while (inicio < fim) {
            T temp = info[inicio];
            info[inicio] = info[fim];
            info[fim] = temp;
            inicio++;
            fim--;
        }
    }
}
