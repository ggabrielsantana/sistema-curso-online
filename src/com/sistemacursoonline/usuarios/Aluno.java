package com.sistemacursoonline.usuarios;

public class Aluno extends Usuario {

    private String matricula;
    private String telefone;
    private String endereco;
    private String dataDeNascimento;
    private double notaMedia;

    public Aluno(int id, String nome, String email, String matricula, String telefone, 
    String endereco, String dataDeNascimento, double notaMedia) {
        super(id, nome, email);
        this.matricula = matricula;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
        this.notaMedia = notaMedia;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public double getNotaMedia() { 
        return notaMedia; }

    @Override
    public boolean podeCriarCurso() { return false; }

    @Override
    public boolean podeAssistirAula() { return true; }

}