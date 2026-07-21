package aulas.encapsulamento.banco.modelo;


public class ContaBancaria {
    //Atributos dessa classe
    private static int i;
    private String titular;
    private int numeroDaConta;
    private double saldo;

    //Construtor dessa classe
    public ContaBancaria(String titular){
        this.titular = titular;
        this.numeroDaConta = gerarNumeroDaConta();
        this.saldo = 0.00;
    }
    private int gerarNumeroDaConta(){
        return i++;
    }

    //metodos getters e setters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(valor>0) {
            this.saldo += valor;
            System.out.println(valor + " depositado com sucesso");
        } else {
            System.out.println("Valor nao pode ser negativo ou zero. Deposito recusado!");
        }
    }
    public void sacar(double valor){
        if (this.saldo >= valor){
           this.saldo -= valor;
            System.out.println(valor + "sacado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria = [" +
                "titular: '" + titular + '\'' +
                ", numeroDaConta: " + numeroDaConta +
                ", saldo: " + saldo +
                ']';
    }
}
