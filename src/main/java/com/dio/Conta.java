package com.dio;



public class Conta implements Operacoes {
    Banco banco;
    Cliente cliente;
    String nomeCliente;
    String tipoConta;
    String numeroConta;
    String agencia;
    double saldo;

    public Conta(Banco banco, Cliente cliente, String tipoConta, String numeroConta) {
        this.banco = banco;
        this.cliente = cliente;
        this.nomeCliente = cliente.getNome();
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.agencia = this.banco.numeroAgencia;
        this.saldo = 0d;

    }
    public void vincularConta(Cliente cli, Conta con){
        this.cliente.setConta(con);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void extrato() {
        System.out.println(toString());
    }

    @Override
    public void depositar() {

    }

    @Override
    public void sacar() {

    }

    @Override
    public void transferir() {

    }

    @Override
    public void depositar(double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
    }

    @Override
    public void sacar(double valorSaque) {
        this.saldo = this.saldo - valorSaque;

    }

    @Override
    public void transferir(double valorTransferencia, Conta conta) {
        this.sacar(valorTransferencia);
        conta.depositar(valorTransferencia);

    }

    @Override
    public String toString() {
        return "Extrato " +
                "Cliente: " + nomeCliente + '\n' +
                "Tipo da conta: " + tipoConta + '\n' +
                "Número da conta: " + numeroConta + '\n' +
                "Agencia: " + agencia + '\n' +
                "Saldo: R$" + saldo + "reais";
    }
}
