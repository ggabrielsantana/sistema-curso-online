package com.sistemacursoonline.curso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.sistemacursoonline.usuarios.Aluno;
import com.sistemacursoonline.usuarios.Instrutor;

public class Curso {

    String titulo;
    private Instrutor instrutor;
    private LocalDateTime dataDeCriacao;
    private int numeroDeAulas;
    private List<Modulo> modulos = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String titulo, Instrutor instrutor) {
        this.titulo = titulo;
        this.instrutor = instrutor;
        this.dataDeCriacao = LocalDateTime.now();
        this.numeroDeAulas = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public LocalDateTime getDataDeCriacao() {
        return dataDeCriacao;
    }

    public int getNumeroDeAulas() {
        return numeroDeAulas;
    }

    public void adicionarModulo(Modulo modulo) {
        modulos.add(modulo);
        numeroDeAulas += modulo.getAulas().size();
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }
}
