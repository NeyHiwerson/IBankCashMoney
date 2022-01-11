package com.dio;

public class Main {
    public static void main(String[] args) {
        Banco b01 = new Banco("IBankCashMoney", "100", "0001");
        System.out.println(b01);
        Cliente cli01 = new Cliente("João", "15246879575");
        Cliente cli02 = new Cliente("Joaquina", "15246879588");
        Cliente cli03 = new Cliente("Filisberto", "15246751465");
        Cliente cli04 = new Cliente("Ney", "54298756423");
        Cliente cli05 = new Cliente("Priscila", "36975315588");
        Cliente cli06 = new Cliente("Santos", "15256458188");
        System.out.println("---------------------------------------");
        ContaCorrente CC01 = new ContaCorrente(b01, cli01);
        CC01.vincularConta(cli01, CC01);
        System.out.println(CC01);
        System.out.println("---------------------------------------");
        ContaPoupança CP01 = new ContaPoupança(b01, cli01);
        CP01.vincularConta(cli01, CP01);
        System.out.println(CP01);
        System.out.println("---------------------------------------");
        System.out.println(cli01);
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        ContaCorrente CC02 = new ContaCorrente(b01 , cli02);
        CC02.vincularConta(cli02,CC02);
        System.out.println(CC02);
        System.out.println("---------------------------------------");
        ContaPoupança CP02 = new ContaPoupança(b01, cli02);
        CP02.vincularConta(cli02,CP02);
        System.out.println(CP02);
        System.out.println("---------------------------------------");
        System.out.println(cli02);
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("TRANSAÇÕES");
        CC01.depositar(900);
        CC01.sacar(250.50);
        CC01.transferir(145.25, CC02);
        CC01.transferir(117.45, CP01);
        CC01.extrato();
        CP01.extrato();
        CC02.extrato();




    }
}
