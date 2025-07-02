package com.sistemacursoonline.usuarios;

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
    
}
