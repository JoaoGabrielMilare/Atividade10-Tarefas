package com.example.Tarefas.Model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_Tarefas")
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    private LocalDate dataDeVencimento;

    @Column(name = "STATUS")
    private Boolean concluido;


    public TarefaModel(long id, String descricao, LocalDate dataDeVencimento, Boolean concluido) {
        this.id = id;
        this.descricao = descricao;
        this.dataDeVencimento = dataDeVencimento;
        this.concluido = concluido;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
