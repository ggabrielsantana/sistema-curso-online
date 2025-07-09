package com.sistemacursoonline;

import java.time.Duration;
import java.util.Arrays;

import com.sistemacursoonline.avaliacao.Avaliavel;
import com.sistemacursoonline.avaliacao.QuizMultiplaEscolha;
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
            Curso c = ((Instrutor) instrutor1).adicionarCurso("Banco de Dados");

            Modulo modulo1 = new Modulo("Introdução");

            Aula aula1 = new Aula("Dados", "Primeira parte da aula.", Duration.ofMinutes(60));
            Aula aula2 = new Aula("Tabelas", "Segunda parte da aula.", Duration.ofMinutes(30));

            modulo1.adicionarAula(aula1);
            modulo1.adicionarAula(aula2);

            c.adicionarModulo(modulo1);

            if (aluno1 instanceof Aluno aluno) {
                aluno.inscreverCurso(c);
                aula1.assistirAula(aluno);
            }

            System.out.println("Curso: " + c.getTitulo());
            System.out.println("Instrutor: " + ((Instrutor) instrutor1).getNome());
            System.out.println("Criado em: " + c.getDataDeCriacao());
            System.out.println("Módulo: " + modulo1.getTitulo());
            System.out.println("Aulas: " + c.getNumeroDeAulas());

            System.out.println("Aulas no módulo: ");
            for (Aula aula : modulo1.getAulas()) {
                System.out.println(
                        "Título: " + aula.getTitulo() + ", " + aula.getDescricao() + " Duração: " + aula.getDuracao());
            }

            System.out.println("Alunos inscritos");
            for (Aluno aluno : c.getAlunos()) {
                System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() + ". Email: "
                        + aluno.getEmail());
            }

            Avaliavel quiz = new QuizMultiplaEscolha("Qual é a principal função de um banco de dados?",
                    Arrays.asList("(A) Criar páginas de sites interativos",
                            "B) Armazenar, organizar e recuperar dados de forma eficiente",
                            "C) Editar imagens e vídeos de forma profissional"),
                    "B) Armazenar, organizar e recuperar dados de forma eficiente");

            System.out.println(quiz.avaliar("B) Armazenar, organizar e recuperar dados de forma eficiente"));
            System.out.println(aluno1.getNome() + " acertou a respota ao quiz proposta na primeira aula");
        }
    }
}
