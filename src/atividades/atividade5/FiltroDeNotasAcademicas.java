package atividades.atividade5;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Double.parseDouble;

public class FiltroDeNotasAcademicas {

    public static void main(String[] args) {

        double soma = 0;
        double media;

        ArrayList<Double> notasAprovadas = new ArrayList<>();

        ArrayList<Double> notas = new ArrayList<>();

        while (true){
            System.out.println("Digite uma nota ou -1 para sair: ");
            Scanner sc = new Scanner(System.in);
            double nota = parseDouble(sc.nextLine());

            if(nota < 0){
                System.out.println("Você decidiu sair");
                break;
            } else {
                notas.add(nota);
                if (nota>=5){
                    notasAprovadas.add(nota);
                }
            }
        }
        for (double nota: notas)
            soma += nota;

        int qtd = notas.size();
        media = soma/qtd;

        if(soma>0) {
            System.out.println("Média das notas: " + media);
            System.out.println("Notas aprovadas (>=5): " + notasAprovadas);
        } else {
            System.out.println("Nenhuma nota digitada!");
        }
    }
}
