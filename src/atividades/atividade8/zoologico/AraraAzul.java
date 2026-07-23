package atividades.atividade8.zoologico;

public class AraraAzul extends Animal{
    private static final String especie = "Arara Azul";
    private String tipoDeBico;

    public AraraAzul(String nome, double peso, String setorNoZoo, String tipoDeBico){
        super.setNome(nome);
        super.setPeso(peso);
        super.setSetorNoZoo(setorNoZoo);
        this.tipoDeBico = tipoDeBico;
    }

    @Override
    public void comer() {
        System.out.println("A Arara Azul " + getNome() + " está comendo sementes!");
    }

    @Override
    public void emitirSom() {
        System.out.println("A Arara Azul " + getNome() + " está grasnando!");
    }

    public void voar(){
        System.out.println("A Arara Azul " + getNome() + " está voando!");
    }

    public String getTipoDeBico() {
        return tipoDeBico;
    }

    public void setTipoDeBico(String tipoDeBico) {
        this.tipoDeBico = tipoDeBico;
    }

    @Override
    public String toString() {
        return "Animal = [" +
                "especie='" + especie + '\'' +
                ", nome: " + this.getNome() +
                ", peso: " + this.getPeso() +
                ", setor no Zoo: " + this.getSetorNoZoo() +
                ']';
    }
}