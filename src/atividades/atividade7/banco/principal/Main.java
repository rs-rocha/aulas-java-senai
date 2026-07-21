package atividades.atividade7.banco.principal;

import atividades.atividade7.banco.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria pessoa1 = new ContaBancaria("joao");
        ContaBancaria pessoa2 = new ContaBancaria("robso");
        ContaBancaria pessoa3 = new ContaBancaria("felipe");

        pessoa1.depositar(100);
        pessoa2.depositar(20);
        pessoa3.depositar(300);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

    }
}
