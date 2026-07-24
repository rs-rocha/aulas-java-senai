package aulas.polimorfismo.exemplos.formularios;

import java.util.Scanner;

/**
 * FALHA NO MEU CADASTRO
 *
 * Nesse cadastro, estou criando pessoas sem
 * todas as informações
 *
 * ATIVIDADE
 *
 * 1. Permitir a criação de pessoas cadastradas
 *    sem todas as informações.
 *    Essas pessoas, tem que entrar
 *    numa lista de DADOS INCOMPLETOS
 *
 * 2. Permitir que as pessoas que tem os
 *    dados incompletos, preencham os
 *    dados que faltam no seu cadastro.
 *
 */

public class Main {
    public static void main(String[] args) {
        int opcao;

        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();

        m.menuPrincipal();
        m.digiteUmaOpcao();
        opcao = Integer.parseInt(sc.nextLine());
        m.selecionarOpcao(opcao);




    }
}
