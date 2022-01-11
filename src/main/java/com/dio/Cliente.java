package com.dio;

import java.util.Objects;

public class Cliente {
    public String nome;
    public String cpf;
    public Conta conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getConta() {
        return this.conta.getNumeroConta();
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return nome.equals(cliente.nome) && cpf.equals(cliente.cpf) && conta.equals(cliente.conta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, conta);
    }

    @Override
    public String toString() {
         return "Cliente " + nome + " cpf " + cpf + " conta " + this.conta.numeroConta;

    }


}
