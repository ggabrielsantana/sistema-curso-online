package com.sistemacursoonline.curso;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
    
    private String titulo;
    private List<Aula> aulas = new ArrayList<>();

    public Modulo(String titulo) {
        this.titulo = titulo;
    }
}
