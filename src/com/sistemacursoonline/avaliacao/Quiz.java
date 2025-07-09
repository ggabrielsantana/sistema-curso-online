package com.sistemacursoonline.avaliacao;

public abstract class Quiz implements Avaliavel {

    protected String pergunta;
    protected String respostaCoreta;

    public Quiz(String pergunta, String respostaCorreta) {
        this.pergunta = pergunta;
        this.respostaCoreta = respostaCorreta;
    }
    
}
