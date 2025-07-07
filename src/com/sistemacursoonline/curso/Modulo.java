package com.sistemacursoonline.curso;

import java.util.LinkedHashSet;
import java.util.Set;

public class Modulo {
    
    private String titulo;
    private Set<Aula> aulas = new LinkedHashSet<>();

    public Modulo(String titulo) {
        this.titulo = titulo;
    }


}
