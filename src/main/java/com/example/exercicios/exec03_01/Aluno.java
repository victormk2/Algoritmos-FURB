package com.example.exercicios.exec03_01;
import java.util.Date;

public class Aluno {
    private String nome;
    private Date dataNascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDataNascimento(Date data) {
        this.dataNascimento = data;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }
}