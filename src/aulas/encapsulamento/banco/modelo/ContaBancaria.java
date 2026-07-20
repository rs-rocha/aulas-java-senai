package aulas.encapsulamento.banco.modelo;

public class ContaBancaria {
    //Atributos dessa classe
    private String titular;
    private int numeroDaConta;
    private double saldo;

    //Construtor dessa classe
    public ContaBancaria(String titular, int numeroDaConta){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.00;
    }

    //metodos getters e setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
