package com.sistemacursoonline.usuarios;

import com.sistemacursoonline.curso.Curso;

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
        return notaMedia;
    }

    @Override
    public boolean podeCriarCurso() {
        return false;
    }

    @Override
    public boolean podeAssistirAula() {
        return true;
    }

    public void inscreverCurso(Curso curso) {
        curso.adicionarAluno(this);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

}