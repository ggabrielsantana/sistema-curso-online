package com.sistemacursoonline.avaliacao;

import java.util.List;

public class QuizMultiplaEscolha extends Quiz {

    private List<String> opcoes;

    public QuizMultiplaEscolha(String pergunta, List<String> opcoes, String respostaCorreta) {
        super(pergunta, respostaCorreta);
        this.opcoes = opcoes;
    }

    @Override
    public boolean avaliar(String resposta) {
        return respostaCoreta.equals(resposta);
    }
}
