package atividades.atividade2;

import java.util.Scanner;

public class DetetiveNumeros {

    public static void main(String[] args) {

        boolean par;
        boolean positivo;
        boolean negativo;
        int numero;
        String numeroStr;


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numeroStr = sc.nextLine();
        numero = Integer.parseInt(numeroStr);

        par = numero % 2 == 0;
        positivo = numero > 0;
        negativo = numero < 0;

        if (par){
            if(positivo){
                System.out.println("O numero é Par\n" +
                        "O numero é Positivo");
            } else if (negativo){
                System.out.println("O numero é Par\n" +
                        "O numero é Negativo");
            } else {
                System.out.println("O número é zero!");
            }
        } else {
            if(positivo){
                System.out.println("O numero é Impar\n" +
                        "O numero é Positivo");
            } else if (negativo) {
                System.out.println("O numero é Impar\n" +
                        "O numero é Negativo");
            } else {
                System.out.println("O número é zero!");
            }
        }
    }
}
