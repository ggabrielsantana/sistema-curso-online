package com.sistemacursoonline.curso;

import java.time.LocalDateTime;

import com.sistemacursoonline.usuarios.Instrutor;

public class Curso {
    
    private String titulo;
    private Instrutor instrutor;
    private LocalDateTime dataDeCriacao;
    private int numeroAulas;

    public Curso(String titulo, Instrutor instrutor, LocalDateTime dataDeCriacao, 
    int numeroAulas) {
        this.titulo = titulo;
        this.instrutor = instrutor;
        this.dataDeCriacao = dataDeCriacao;
        this.numeroAulas = numeroAulas;
    }

}
