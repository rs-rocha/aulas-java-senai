package atividades.atividade3;

import java.util.Scanner;

public class SaudacaoPersonalizada {

    static void imprimirSaudacao(String nome){

        System.out.println("Olá, " + nome +
                "! \nBem-vindo(a) à nossa aula de métodos."
                );
    }

    public static void main(String[] args) {
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        nome = sc.nextLine();
        imprimirSaudacao(nome);
    }
}
