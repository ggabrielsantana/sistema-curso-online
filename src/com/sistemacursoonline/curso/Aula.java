package com.sistemacursoonline.curso;

import java.time.Duration;
import java.util.Objects;

public class Aula {

    private String titulo;
    private String descricao;
    private Duration duracao;

    public Aula(String titulo, String descricao, Duration duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public void assistirAula() {
        //colocar o aluno aqui para confirmar se le está vendo a aula
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Duration getDuracao() {
        return duracao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aula)) return false;
        Aula other = (Aula) obj;
        return Objects.equals(titulo, other.titulo) && Objects.equals(descricao, other.descricao) 
        && Objects.equals(duracao, other.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, duracao);
    }

}
