package com.example.exercicios.exec03_01;
import java.sql.Date;

public class Publicacao {

     private Date data;
     private String textoPublicacao;

     public void setData(Date data){
        this.data = data;
     }

     public Date getData(){
        return this.data;
     }

     public void setTextoPublicacao(String texto){
        this.textoPublicacao = texto;
     }

     public String getTextoPublicacao(){
        return this.textoPublicacao;
     }
}