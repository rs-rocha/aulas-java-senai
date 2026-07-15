package atividades.atividade4;

import java.util.Scanner;

public class SistemaCorrigido {
    public static void main(String[] args) {

        //nome de variaveis nao podem começar com numeros;
        int valor = 10;
        //toda instrução deve terminar com ;
        int contador = 5;

        //1.Metodos nao estáticos nao podem ser referenciados de um contexto estático, por isso foi colocado
        //static depois do modificador public na implementaçao da função exibirMensagens()
        //2.O número de paramtros usados na chamada da função era menor que a qtd de argumentos da função implementada,
        //por isso foi acrescido o argumento valor
        exibirMensagens("Bem-vindo ao Sistema", valor);

        //aqui temos um loop infinito, pois não temos uma condição que possa ser falsiada, acrescentou-se
        //um decremento para contador;
        while(contador > 0) {
            System.out.println("Iniciado em: " + contador);
            contador--;
        }
    }
    public static void exibirMensagens(String texto, int repeticoes){
        for (int i = 0; i < repeticoes; i++){
            System.out.println(texto);
        }
    }
}
