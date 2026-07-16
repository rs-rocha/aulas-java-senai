package atividades.atividade5;

import java.util.Scanner;

public class SomaDeElementosNumVetor {
    public static void main(String[] args) {
        int[] arraySoma = new int[5];
        int soma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para a posição do Vetor: ");
        for (int i = 0; i < 5; i++){
            System.out.print("Vetor[" + i + "] = ");
            arraySoma[i] = sc.nextInt();
        }

        System.out.print("Vetor preenchido: [");
        for (int i = 0; i < 5; i++){
            if (i == 4) {
                System.out.print(arraySoma[i] + "]\n");
            } else {
                System.out.print(arraySoma[i] + ",");
            }
        }

        for (int i = 0; i < 5; i++){
            soma += arraySoma[i];
        }

        System.out.println("A soma de todos os elementos é: " + soma);

    }
}
