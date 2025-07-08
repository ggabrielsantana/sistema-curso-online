package com.sistemacursoonline;

import java.time.Duration;

import com.sistemacursoonline.curso.Aula;
import com.sistemacursoonline.curso.Curso;
import com.sistemacursoonline.curso.Modulo;
import com.sistemacursoonline.usuarios.Aluno;
import com.sistemacursoonline.usuarios.Instrutor;
import com.sistemacursoonline.usuarios.Usuario;

public class Main {
    public static void main(String[] args) throws Exception {
        Usuario instrutor1 = new Instrutor(111, "Alexandre Mendes",
                "alexandremendes@gmail.com", "Licenciatura em Computação",
                "Especialização em Desenvolvimento de Sistemas Web",
                "Professor de Informática, Escola Técnica Estadual",
                "Professor de Tecnologia da Informação com experiência no ensino técnico e superior");

        Usuario aluno1 = new Aluno(1112, "Fabiana Alencar", "fabiana@gmail.com", "987456",
                "99 999999999", "Rua 99, Casa 99. Bairo 99, Fortaleza", "05/08/2003", 9.0);

        if (instrutor1.podeCriarCurso() && instrutor1 instanceof Instrutor) {
            Curso c = ((Instrutor) instrutor1).adicionarCurso("Banco de Dados1");

            Modulo modulo1 = new Modulo("Introdução");

            Aula aula1 = new Aula("Dados", "Primeira parte da aula", Duration.ofMinutes(60));
            Aula aula2 = new Aula("Tabelas", "Assunto novo", Duration.ofMinutes(30));

            modulo1.adicionarAula(aula1);
            modulo1.adicionarAula(aula2);

            c.adicionarModulo(modulo1);

            if (aluno1 instanceof Aluno aluno) {
                aluno.inscreverCurso(c);
                aula1.assistirAula(aluno);
            }
        }
    }
}
