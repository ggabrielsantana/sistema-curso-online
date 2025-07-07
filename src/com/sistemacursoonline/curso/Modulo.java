package com.sistemacursoonline.curso;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

public class Modulo {

    private String titulo;
    private Set<Aula> aulas = new LinkedHashSet<>();

    public Modulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Aula> getAulas() {
        return new ArrayList<>(aulas);
    }

    public void add(Modulo modulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
