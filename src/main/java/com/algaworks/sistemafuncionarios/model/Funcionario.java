package com.algaworks.sistemafuncionarios.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Funcionario {

    @Id
    private Integer id;

    @Version
    private Integer versao;

    private String nome;

    private Integer bancoDeHoras;

    private BigDecimal salario;

    private BigDecimal valorHoraExtra;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersao() {
        return versao;
    }

    public void setVersao(Integer versao) {
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getBancoDeHoras() {
        return bancoDeHoras;
    }

    public void setBancoDeHoras(Integer bancoDeHoras) {
        this.bancoDeHoras = bancoDeHoras;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(BigDecimal valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario usuario = (Funcionario) o;

        return id.equals(usuario.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
