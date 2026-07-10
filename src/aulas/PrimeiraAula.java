package aulas;

import java.util.Scanner;

public class PrimeiraAula {
    /**
     * Documentacao
     */
    public static void main(String[] args) {
        /*
        Comentario varias linhas
         */
        //Comentario de uma linha

        String nome = "Joao";
        int idade = 22;
        boolean professor = true;
        int anoNascimento = 2026 - idade;
        String novonome;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(professor);
        System.out.println(anoNascimento);

        Scanner entrada = new Scanner(System.in);
        novonome = entrada.nextLine();

        System.out.println(novonome);

    }
}
