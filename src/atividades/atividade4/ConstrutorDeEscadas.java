package atividades.atividade4;

import java.util.Scanner;

public class ConstrutorDeEscadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdEscadas;
        String simbolo;
        System.out.println("Digite o simbolo para construir a escada: ");
        simbolo = sc.nextLine();
        System.out.println("Digite a quantidade de escadas: ");
        qtdEscadas = sc.nextInt();

        for(int i = 1; i <= qtdEscadas; i++){
            for(int j = 1; j <= qtdEscadas; j++) {
                if (j < i)
                    System.out.printf("%s", simbolo);
            }
            System.out.printf("%s\n", simbolo);
        }

    }
}
