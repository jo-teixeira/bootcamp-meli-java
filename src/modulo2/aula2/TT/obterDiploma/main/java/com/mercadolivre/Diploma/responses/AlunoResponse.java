package com.mercadolivre.Diploma.responses;

import com.mercadolivre.Diploma.models.Aluno;

public class AlunoResponse {

    private String mensagem;
    private Double mediaNotas;
    private String nomeAluno;

    public AlunoResponse() {
    }

    public AlunoResponse(String mensagem, Double mediaNotas, String nomeAluno) {
        this.mensagem = mensagem;
        this.mediaNotas = mediaNotas;
        this.nomeAluno = nomeAluno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(Double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
