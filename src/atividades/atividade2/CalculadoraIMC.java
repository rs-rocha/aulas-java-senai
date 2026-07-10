package atividades.atividade2;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;
        String pesoStr;
        String alturaStr;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu peso?");
        pesoStr = sc.nextLine();
        peso = Double.parseDouble(pesoStr);

        System.out.println("Qual sua altura?");
        alturaStr = sc.nextLine();
        altura = Double.parseDouble(alturaStr);

        imc = peso/(altura*altura);

        if(imc < 18.5)
            System.out.println("Abaixo do peso.");
        else if (imc < 24.9)
            System.out.println("Peso normal.");
        else if (imc < 29.9)
            System.out.println("Sobrepeso.");
        else
            System.out.println("Obesidade");
    }
}
