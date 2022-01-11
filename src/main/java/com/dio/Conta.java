package com.dio;


abstract class Conta implements Operacoes {
    protected Banco banco;
    protected Cliente cliente;
    protected int numeroConta;
    protected String agencia;
    protected double saldo;


    protected int getNumeroConta() { return numeroConta; }

    protected String getAgencia() { return agencia; }

    protected double getSaldo() { return saldo; }

    @Override
    public void extrato(){
        System.out.println(this.toString());
    }

    @Override
    public void depositar(double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
        System.out.println("--Depósito de R$" + valorDeposito +
                " reais efetuado com Sucesso--");
    }

    @Override
    public void sacar(double valorSaque) {
        this.saldo = this.saldo - valorSaque;
        System.out.println("--Saque de R$" + valorSaque +
                " reais efetuado com Sucesso--");

    }

    @Override
    public void transferir(double valorTransferencia, Conta conta) {
        this.sacar(valorTransferencia);
        conta.depositar(valorTransferencia);

    }


}
