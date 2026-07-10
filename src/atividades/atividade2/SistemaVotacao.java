package atividades.atividade2;

import java.util.Scanner;

public class SistemaVotacao {
    public static void main(String[] args) {
        int idade;
        String idadeStr;


        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        idadeStr = sc.nextLine();
        idade = Integer.parseInt(idadeStr);

        if(idade < 16){
            System.out.println("Não pode votar.");
        } else if (idade <= 17 || idade > 70){
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto Obrigatório");
        }

        }
}
