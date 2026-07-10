package atividades.atividade2;

import java.util.Scanner;

public class CalculadoraMediaEscolar {

    public static void main(String[] args) {

        double primeiraNota;
        double segundaNota;
        double terceiraNota;
        String primeiraNotaStr;
        String segundaNotaStr;
        String terceiraNotaStr;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a primeira nota?");
        primeiraNotaStr = sc.nextLine();
        primeiraNota = Double.parseDouble(primeiraNotaStr);

        System.out.println("Qual a segunda nota?");
        segundaNotaStr = sc.nextLine();
        segundaNota = Double.parseDouble(segundaNotaStr);

        System.out.println("Qual a terceira nota?");
        terceiraNotaStr = sc.nextLine();
        terceiraNota = Double.parseDouble(terceiraNotaStr);

        media = (primeiraNota + segundaNota + terceiraNota)/3.0;

        if (media < 5.0){
            System.out.println("Reprovado!");
        } else if (media < 7.0){
            System.out.println("Em recuperação!");
        } else {
            System.out.println("Aprovado!");
        }
    }
}
