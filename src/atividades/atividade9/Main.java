package atividades.atividade9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        ArrayList<Cadastro> listaCadastroIncompleto = new ArrayList<>();
        List<Cadastro> listaCadastroCompleto = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade = 0;
        String cargo = "";
        boolean ativo;
        String escolha;
        String padrao = "";

        while(true){
            System.out.println("\nTamanho da Lista de Cadastro INCOMPLETO: " + listaCadastroIncompleto.size());
            System.out.println("\nTamanho da Lista de Cadastro Completo: " + listaCadastroCompleto.size());
            System.out.println(
                    "\n**** CADASTRO DE PESSOAS ****" +
                    "\n1.Cadastro de Pessoa: " +
                    "\n0.Sair\n"
            );
            System.out.println("Digite uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao != 0) {
                System.out.println("Digite um nome: ");
                nome = sc.nextLine();
                System.out.println("Deseja digitar a idade? (s ou n)");
                escolha = sc.nextLine();

                if (escolha.equalsIgnoreCase("s")){
                    System.out.println("Digite a idade: ");
                    idade = Integer.parseInt(sc.nextLine());
                    padrao += escolha;

                } else if(escolha.equalsIgnoreCase("n")){
                    padrao += escolha;

                } else {
                    System.out.println("Apenas s ou n!");
                }

                System.out.println("Deseja digitar a cargo? (s ou n)");
                escolha = sc.nextLine();

                if (escolha.equalsIgnoreCase("s")) {
                    System.out.println("Digite a cargo: ");
                    cargo = sc.nextLine();
                    padrao += escolha;

                } else if(escolha.equalsIgnoreCase("n")){
                    padrao += escolha;

                } else {
                    System.out.println("Apenas s ou n!");
                }

                if(padrao.equalsIgnoreCase("ss")){
                    //System.out.println("ss: "+padrao.equalsIgnoreCase("ss"));
                    Cadastro pessoa = new Cadastro(nome, idade, cargo, true);
                    listaCadastroCompleto.add(pessoa);
                }
                if(padrao.equalsIgnoreCase("sn")) {
                    //System.out.println("sn: "+padrao.equalsIgnoreCase("sn"));
                    Cadastro pessoa = new Cadastro(nome, idade, false);
                    listaCadastroIncompleto.add(pessoa);
                }
                if(padrao.equalsIgnoreCase("ns")){
                    //System.out.println("ns: "+padrao.equalsIgnoreCase("ns"));
                    Cadastro pessoa = new Cadastro(nome, cargo, false);
                    listaCadastroIncompleto.add(pessoa);
                }
                if(padrao.equalsIgnoreCase("nn")){
                    //System.out.println("nn: "+padrao.equalsIgnoreCase("nn"));
                    Cadastro pessoa = new Cadastro(nome, false);
                    listaCadastroIncompleto.addLast(pessoa);
                }

                padrao = "";

            } else {

                return;
            }
            for (int j = 0; j < listaCadastroIncompleto.size(); j++) {
                Cadastro n = listaCadastroIncompleto.get(j);
                System.out.println(n);
            }
        }
    }
}
class Menu {
    void menuNome(String nome){
        System.out.println("digite o nome: ");
    }
}

class Cadastro {
    private static int i = 0;
    private String nome;
    private int idade;
    private String cargo;
    private boolean ativo;

    public Cadastro (String nome, int idade, String cargo, boolean ativo){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.ativo = ativo;

    }

    public Cadastro (String nome, int idade, boolean ativo){
        this.nome = nome;
        this.idade = idade;
        this.ativo = ativo;

    }

    public Cadastro (String nome, String cargo, boolean ativo) {
        this.nome = nome;
        this.cargo = cargo;
        this.ativo = ativo;

    }

    public Cadastro (String nome, boolean ativo){
        this.nome = nome;
        this.ativo = ativo;

    }

    public Cadastro (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "[ " +
                "nome: " + nome +
                ", idade: " + idade +
                ", cargo: " + cargo +
                ", ativo: " + ativo +
                " ]";
    }
}
