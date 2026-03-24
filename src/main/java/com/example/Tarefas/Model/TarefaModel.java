package com.example.Tarefas.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "tbl_Tarefas")
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    private String dataDeVencimento;

    @Column(name = "STATUS")
    private Boolean concluido;


    public TarefaModel(long id, String descricao, String dataDeVencimento, Boolean concluido) {
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

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
