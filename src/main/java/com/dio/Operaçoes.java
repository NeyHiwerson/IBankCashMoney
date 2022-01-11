package com.dio;

interface Operacoes {
    void extrato();
    void depositar();
    void sacar();
    void transferir();

    void depositar(double valorDeposito);

    void sacar(double valorSaque);

    void transferir(double valorTransferencia, Conta conta);
}
