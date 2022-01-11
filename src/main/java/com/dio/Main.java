package com.dio;

public class Main {
    public static void main(String[] args) {
        Banco b01 = new Banco("IBankCashMoney", "100", "0001");

        Cliente cli01 = new Cliente("João", "15246879575");
        Conta con01 = new Conta(b01 , cli01, "CC", "01001");
        cli01.setConta(con01);

        Cliente cli02 = new Cliente("Joaquina", "15246879588");
        Conta con02 = new Conta(b01 , cli02, "CC", "01002");
        System.out.println(b01);
        System.out.println("---------------------------------------");
        System.out.println(cli01);
        System.out.println("---------------------------------------");
        System.out.println(con01);
        System.out.println("---------------------------------------");
        con01.depositar(150d);
        System.out.println(con01);
        System.out.println("---------------------------------------");
        con01.transferir(50, con02);
        System.out.println(con02);
        System.out.println("---------------------------------------");
        con01.sacar(25);
        System.out.println(con01);
        System.out.println("---------------------------------------");
        con02.extrato();
    }
}
