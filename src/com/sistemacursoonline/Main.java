package com.sistemacursoonline;

import com.sistemacursoonline.curso.Curso;
import com.sistemacursoonline.usuarios.Instrutor;
import com.sistemacursoonline.usuarios.Usuario;

public class Main {
    public static void main(String[] args) throws Exception {
        Usuario instrutor1 = new Instrutor(111, "Alexandre Mendes", 
        "alexandremendes@gmail.com", "Licenciatura em Computação", 
        "Especialização em Desenvolvimento de Sistemas Web", 
        "rofessor de Informática – Escola Técnica Estadual", 
        "Professor de Tecnologia da Informação com experiência no ensino técnico e superior");

        if (instrutor1.podeCriarCurso() && instrutor1 instanceof Instrutor) {
            Curso c = ((Instrutor) instrutor1).adicionarCurso("Banco de Dados1");

            c.adicionarModulo("null");
        }
    }
}
