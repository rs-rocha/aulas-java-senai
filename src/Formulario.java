import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {

        String nomeCompleto;
        String idadeStr;
        int idade;
        String alturaStr;
        double altura;
        String cargo;
        String periodo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        nomeCompleto = sc.nextLine();

        System.out.println("Idade: ");
        idadeStr = sc.nextLine();
        idade = Integer.parseInt(idadeStr);

        System.out.println("Altura: ");
        alturaStr = sc.nextLine();
        altura = Double.parseDouble(alturaStr);

        System.out.println("Cargo: ");
        cargo = sc.nextLine();

        System.out.println("Periodo: ");
        periodo = sc.nextLine();

        System.out.println(
                "**************************" +
                "\nInformações do Cadastro: \n" +
                "**************************" +
                "\nNome Completo: " + nomeCompleto +
                "\nIdade: " + idade +
                "\nAltura: " + altura +
                "\nCargo: " + cargo +
                "\nPeriodo: " + periodo +
                "\n**************************"
        );
    }
}
