package Aulas;

import java.util.Scanner;

public class SegundaAula {
    public static void main(String[] args) {

        String valorStr;
        int valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        valorStr = sc.nextLine();
        valor = Integer.parseInt(valorStr);

        if (valor < 10){
            System.out.println("Menor que 10");
        } else {
            System.out.println("Maior ou Igual a 10");
        }

        switch (valor){
            case 1:
                System.out.println("Escolheu 1");
                break;
            default:
                System.out.println("Não escolheu um das opções");
                break;
        }
    }
}
