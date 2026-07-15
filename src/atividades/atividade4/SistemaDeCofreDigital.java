package atividades.atividade4;

import java.util.Scanner;

public class SistemaDeCofreDigital {

    public static void abrirCofre() {
        int codigo;
        int tentativas = 1;

        while (tentativas <= 5) {
            Scanner sc = new Scanner(System.in);
            codigo = sc.nextInt();
            if (tentativas < 5) {
                if (codigo != 9999) {
                    System.out.println("Codigo Errado. ");
                    tentativas++;
                    System.out.println("Restam " + (6 - tentativas));

                } else {
                    System.out.println("Cofre Aberto!");
                    return;
                }
            } else {
                System.out.println("Cofre Bloqueado!");
                return;
            }
        }
    }

    public static void main(String[] args) {
        abrirCofre();
    }
}
