package com.dio;

public class ContaPoupança extends Conta implements Operacoes{
    private String tipoConta;
    private String nomeCliente;
    private static int sequencialCP = 1;

    public ContaPoupança(Banco banco, Cliente cliente) {
        nomeCliente = cliente.nome;
        tipoConta = "CP";
        this.banco = banco;
        this.cliente = cliente;
        this.numeroConta = sequencialCP;
        this.agencia = banco.numeroAgencia;
        this.saldo = 0d;
        sequencialCP += 1;
    }
    protected void vincularConta(Cliente cli, ContaPoupança con){
        this.cliente.setContaPoupança(con);
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
