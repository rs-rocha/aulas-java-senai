package atividades.atividade2;

import java.util.Scanner;

class Calculo{

    public double Desconto(double valorCompra) {
        final double DESCONTO_ZERO = 0.0;
        final double DESCONTO_DEZ = 0.1;
        final double DESCONTO_VINTE = 0.2;
        double porcentagem;

        int faixa = (int) (valorCompra/100);

        switch (faixa) {
            case 0: //faixa 0 - 100.00
                porcentagem = DESCONTO_ZERO;
                break;

            case 1: // faixa 101 - 200.00
            case 2: // faixa 201 - 299.00
                porcentagem = DESCONTO_DEZ;
                break;

            default:
                porcentagem = DESCONTO_VINTE;
                break;
        }
        return porcentagem;
    }

    public void imprimir(double valorCompra, double poupado, double montante){
        System.out.println(
                "Valor Original: " + valorCompra +
                "\nValor Poupado: " + poupado +
                "\nMontante Final:  " + montante
        );
    }
}

public class CaixaLoja2 {

    public static void main(String[] args) {

        double poupado;
        double montante;
        double valorCompra;
        double desconto;
        String valorCompraStr;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da compra?");
        valorCompraStr = sc.nextLine();
        valorCompra = Double.parseDouble(valorCompraStr);

        //COMENTANDO PARA USAR SWITCH-CASE
        Calculo c = new Calculo();

        poupado = valorCompra * c.Desconto(valorCompra);
        montante = valorCompra - poupado;
        c.imprimir(valorCompra, poupado, montante);
    }
}
