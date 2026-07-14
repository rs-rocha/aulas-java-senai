package atividades.atividade3;

import java.util.Scanner;

public class CalculadoraComMetodosEncadeados {

    static int subtrairNumeros(int x, int y){
        return x - y;
    }

    static void imprimirResultado(int resultado){
        System.out.println("O resultado da operação é: " + resultado);
    }
    public static void main(String[] args) {

        String Numero1Str;
        int Numero1;
        String Numero2Str;
        int Numero2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Numero1Str = sc.nextLine();
        Numero1 = Integer.parseInt(Numero1Str);

        System.out.println("Digite o segundo número: ");
        Numero2Str = sc.nextLine();
        Numero2 = Integer.parseInt(Numero2Str);

        imprimirResultado(subtrairNumeros(Numero1, Numero2));
    }
}
