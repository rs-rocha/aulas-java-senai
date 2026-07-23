package atividades.atividade8.zoologico;

public class Animal {
    private String nome;
    private double peso;
    private String setorNoZoo;

    public void emitirSom(){
        System.out.println("O animal está emitindo som...");
    }

    public void comer(){
        System.out.println("O animal está comendo...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSetorNoZoo() {
        return setorNoZoo;
    }

    public void setSetorNoZoo(String setorNoZoo) {
        this.setorNoZoo = setorNoZoo;
    }

    @Override
    public String toString() {
        return "Animal = [" +
                "nome: '" + nome + '\'' +
                ", peso: " + peso +
                ", setorNoZoo: '" + setorNoZoo + '\'' +
                ']';
    }
}
