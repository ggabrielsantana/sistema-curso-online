package com.sistemacursoonline.curso;

import java.time.LocalDateTime;

import com.sistemacursoonline.usuarios.Instrutor;

public class Curso {
    
    private String titulo;
    private Instrutor instrutor;
    private LocalDateTime dataDeCriacao;
    private int numeroDeAulas;

    public Curso(String titulo, Instrutor instrutor, LocalDateTime dataDeCriacao, 
    int numeroDeAulas) {
        this.titulo = titulo;
        this.instrutor = instrutor;
        this.dataDeCriacao = dataDeCriacao;
        this.numeroDeAulas = numeroDeAulas;
    }

}
