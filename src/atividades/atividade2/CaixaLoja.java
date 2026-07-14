package atividades.atividade2;

import java.util.Scanner;

class Calculo{

    public void imprimir(double valorCompra, double poupado, double montante){
        System.out.println(
                "Valor Original: " + valorCompra +
                        "\nValor Poupado: " + poupado +
                        "\nMontante Final:  " + montante
        );
    }
}

public class CaixaLoja {

    public static void main(String[] args) {

        double poupado;
        double montante;
        double valorCompra;
        String valorCompraStr;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da compra?");
        valorCompraStr = sc.nextLine();
        valorCompra = Double.parseDouble(valorCompraStr);

        Calculo c = new Calculo();

        if(valorCompra < 100.0){
            poupado = 0.0 * valorCompra;
            montante = valorCompra - poupado;
            c.imprimir(valorCompra, poupado, montante);
        } else if (valorCompra < 299.99){
            poupado = 0.1 * valorCompra;
            montante = valorCompra - poupado;
            c.imprimir(valorCompra, poupado, montante);
        } else {
            poupado = 0.2 * valorCompra;
            montante = valorCompra - poupado;
            c.imprimir(valorCompra, poupado, montante);
        }
    }
}
