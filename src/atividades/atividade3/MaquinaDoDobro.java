package atividades.atividade3;

import java.util.Scanner;

public class MaquinaDoDobro {
    static int calcularDobro(int valor){
        return 2 * valor;
    }

    public static void main(String[] args) {
        String valorStr;
        int valor;
        int dobro;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        valorStr = sc.nextLine();
        valor = Integer.parseInt(valorStr);
        dobro = calcularDobro(valor);

        System.out.println("O dobro do número é: " + dobro);
    }
}
