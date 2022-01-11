package com.dio;

import java.util.Objects;

public class Cliente {
    protected String nome;
    protected String cpf;
    protected ContaCorrente contaCorrente;
    protected ContaPoupança contaPoupança;

     protected Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {  this.nome = nome;  }

    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ContaCorrente getContaCorrente() {  return contaCorrente;  }

    protected void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaPoupança getContaPoupança() {  return contaPoupança;  }

    protected void setContaPoupança(ContaPoupança contaPoupança) {
        this.contaPoupança = contaPoupança;
    }

    @Override
    public String toString() {
         return "Cliente " + nome + " cpf " + cpf + "\n" +
                 " Conta Corrente " + this.contaCorrente + "\n" +
                 " Conta Poupança " + this.contaPoupança;


    }


}
