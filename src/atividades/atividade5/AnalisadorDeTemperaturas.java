package atividades.atividade5;

import java.util.Scanner;

public class AnalisadorDeTemperaturas {
    public static void main(String[] args) {
        double[] temperaturas = new double[6];
        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 6 temperaturas: ");

        for(int i = 0; i < 6; i++){
            System.out.print("Temperatura[" + i + "] = ");
            temperaturas[i] = Double.parseDouble(valor.nextLine());
        }

        System.out.print("Temperaturas: [");

        for(double temperatura : temperaturas){
            if (temperatura != temperaturas[5])
                System.out.print(temperatura + ", " );
            else
                System.out.print(temperatura + "]");
        }

        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for(int i = 1; i < 6; i++){
            if(maior < temperaturas[i]){
                maior = temperaturas[i];
            }
            if(menor > temperaturas[i]){
                menor = temperaturas[i];
            }
        }
        System.out.println("\nmaior: " + maior + "ºC");
        System.out.println("menor: " + menor + "ºC");

    }
}
