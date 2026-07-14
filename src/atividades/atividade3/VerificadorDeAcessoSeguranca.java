package atividades.atividade3;

import java.util.Scanner;

public class VerificadorDeAcessoSeguranca {

    static boolean verificadorMaioridade(int idade){
        return idade >= 18;
    }

    public static void main(String[] args) {
        String idadeStr;
        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        idadeStr = sc.nextLine();
        idade = Integer.parseInt(idadeStr);

        if (verificadorMaioridade(idade))
            System.out.println("Acesso Liberado");
        else
            System.out.println("Acesso Negado");
    }
}
