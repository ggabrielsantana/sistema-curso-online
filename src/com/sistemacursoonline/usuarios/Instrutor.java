package com.sistemacursoonline.usuarios;

import com.sistemacursoonline.curso.Curso;

public class Instrutor extends Usuario {

    private String formacao;
    private String areaDeEspecializacao;
    private String experiencia;
    private String bio;

    public Instrutor(int id, String nome, String email, String formacao,
            String areaDeEspecializacao, String experiencia, String bio) {
        super(id, nome, email);
        this.formacao = formacao;
        this.areaDeEspecializacao = areaDeEspecializacao;
        this.experiencia = experiencia;
        this.bio = bio;

    }

    public String getFormacao() {
        return formacao;
    }

    public String getAreaDeEspecializacao() {
        return areaDeEspecializacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public String getBio() {
        return bio;
    }

    @Override
    public boolean podeCriarCurso() { return true; }

    @Override
    public boolean podeAssistirAula() { return true; }

    public Curso adicionarCurso(String titulo) {
        return new Curso(titulo, this);

    }

}
