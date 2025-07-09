# Plataforma de Cursos Online

Este repositório contém um sistema simplificado de cursos online, desenvolvido em Java, com foco em modularidade, orientação a objetos e extensibilidade.

---

## 📋 Sumário

* [Descrição](#descrição)
* [Funcionalidades](#funcionalidades)
* [Tecnologias Utilizadas](#tecnologias-utilizadas)
* [Estrutura do Projeto](#estrutura-do-projeto)
* [Como Executar](#como-executar)
* [Uso e Exemplos](#uso-e-exemplos)
* [Contribuição](#contribuição)
* [Licença](#licença)

---

## Descrição

O sistema implementa uma plataforma de cursos online, onde instrutores podem criar cursos e módulos, adicionar aulas e aplicar quizzes de avaliação. Alunos podem se inscrever em cursos, assistir aulas e consultar notas.

### Principais conceitos:

* **Orientação a Objetos**: classes e interfaces bem definidas.
* **Extensibilidade**: abstrações permitem adição de novos tipos de quizzes e usuários.
* **Registro de progresso**: controle de aulas e notas.

---

## Funcionalidades

* Cadastro de usuários: **Instrutor** e **Aluno**
* Criação de cursos e módulos
* Adição de aulas e quizzes de múltipla escolha
* Inscrição de alunos em cursos
* Registro e consulta de notas pelos instrutores
* Controle de equivalência de aulas com `equals` e `hashCode`

---

## Tecnologias Utilizadas

* Linguagem: **Java 17+**
* Java Time API (`java.time.*`) para datas e durações
* Coleções Java (`List`, `Set`, `LinkedHashSet`)

---

## Estrutura do Projeto

```
com.plataforma
│
├─ Avaliavel.java           # Interface de avaliação
├─ Quiz.java                # Classe abstrata para quizzes
├─ QuizMultiplaEscolha.java # Quiz de múltipla escolha
│
├─ Usuario.java             # Classe abstrata de usuário
├─ Aluno.java               # Implementação de usuário aluno
├─ Instrutor.java           # Implementação de usuário instrutor
│
├─ Curso.java               # Representa curso com módulos e alunos
├─ Modulo.java              # Representa módulo com conjunto de aulas
├─ Aula.java                # Representa aula, registra duração e conteúdo
└─ (exemplo) Main.java      # Classe de testes e exemplos (opcional)
```

### Descrição das classes

* **Avaliavel**: interface com método `avaliar(String resposta)`;
* **Quiz**: abstrata, armazena pergunta e resposta correta;
* **QuizMultiplaEscolha**: lista de opções e validação da resposta;
* **Usuario**: abstrata, define permissões (`podeCriarCurso`, `podeAssistirAula`);
* **Aluno**: estende `Usuario`, permite assistir, inscrever-se, consultar nota;
* **Instrutor**: estende `Usuario`, permite criar curso, atribuir nota;
* **Curso**: título, instrutor, data de criação, lista de módulos e alunos;
* **Modulo**: título e conjunto de aulas (mantém ordem de inserção);
* **Aula**: titulo, descrição, duração; implementa `equals`/`hashCode`.

---

## Como Executar

1. **Clone o repositório**

   ```bash
   git clone https://github.com/SEU_USUARIO/plataforma-cursos-online.git
   cd plataforma-cursos-online
   ```

2. **Compile**

   ```bash
   javac com/plataforma/*.java
   ```

3. **Execute** (caso tenha um `Main.java` de exemplo)

   ```bash
   java com.plataforma.Main
   ```

> Se preferir usar uma IDE (Eclipse, IntelliJ IDEA, VSCode), importe o projeto como projeto Java e execute as classes de teste.

---

1. Fork deste repositório
2. Crie uma branch com sua funcionalidade: `git checkout -b feature/nova-funcionalidade`
3. Commite suas mudanças: `git commit -m 'Adiciona nova funcionalidade'`
4. Faça push: `git push origin feature/nova-funcionalidade`
5. Abra um pull request

---

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).