package aulas.encapsulamento.banco.principal;

import aulas.encapsulamento.banco.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria pessoa1 = new ContaBancaria("joao");
        ContaBancaria pessoa2 = new ContaBancaria("robso");
        ContaBancaria pessoa3 = new ContaBancaria("felipe");
        ContaBancaria pessoa4 = new ContaBancaria("Zezinho");

        pessoa1.depositar(100);
        pessoa2.depositar(20);
        pessoa3.depositar(300);
        pessoa4.depositar(350);

        pessoa2.sacar(5);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
        System.out.println(pessoa4);

    }
}
