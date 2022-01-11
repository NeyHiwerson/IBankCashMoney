package com.dio;

public class ContaCorrente extends Conta implements Operacoes{
    private String tipoConta;
    private String nomeCliente;
    private static int sequencialCC = 1;

    public ContaCorrente(Banco banco, Cliente cliente) {
        nomeCliente = cliente.nome;
        tipoConta = "CC";
        this.banco = banco;
        this.cliente = cliente;
        this.numeroConta = sequencialCC;
        this.agencia = banco.numeroAgencia;
        this.saldo = 0d;
        sequencialCC += 1;
    }
    protected void vincularConta(Cliente cli, ContaCorrente con){
        this.cliente.setContaCorrente(con);
    }

    @Override
    public String toString() {
        return "*** Extrato ***" + '\n' +
                "Cliente: " + nomeCliente + '\n' +
                "Tipo da conta: " + tipoConta + '\n' +
                "Número da conta: " + numeroConta + '\n' +
                "Agencia: " + agencia + '\n' +
                "Saldo: R$" + saldo + "reais";
    }


    @Override
    public void extrato() {
        System.out.println(this.toString());
    }
}
