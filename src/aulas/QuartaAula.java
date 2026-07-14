package aulas;

import java.util.Scanner;

public class QuartaAula {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        int limite = sc.nextInt();

        int numero = 1;
        while(numero <= 10){
            System.out.println(numero);
            numero++;
        }
        */
        char simbolo = '#';
        for(int x=0; x<10; x++){
            for(int y=0; y<10; y++){
                System.out.print(simbolo + " ");
            }
            System.out.println(simbolo + " ");
        }
    }
}
