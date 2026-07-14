package atividades.atividade3;

import java.util.Scanner;

public class SistemaDeMonitoramentoClimatico {

    static double converterParaFahrenheit(double celsius){
        return (celsius*1.8)+32;
    }

    static void avaliarClima(double fahrenheit){
        if (fahrenheit < 50)
            System.out.println("Clima Frio.");
        else if (fahrenheit >= 50 && fahrenheit < 79.9)
            System.out.println("Clima Agradável.");
        else
            System.out.println("Clima Quente.");
    }

    public static void main(String[] args) {

        String temperaturaStr;
        double temperatura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celsius?");
        temperaturaStr = sc.nextLine();
        temperatura = Double.parseDouble(temperaturaStr);

        avaliarClima(converterParaFahrenheit(temperatura));
    }
}
