package atividades.atividade8.zoologico;

public class LoboGuara extends Animal{
    private static final String especie = "Lobo Guara";
    private double tamanhoDoFocinho;

    public LoboGuara(String nome, double peso, String setorNoZoo, double tamanhoDoFocinho){
        super.setNome(nome);
        super.setPeso(peso);
        super.setSetorNoZoo(setorNoZoo);
        this.tamanhoDoFocinho = tamanhoDoFocinho;
    }

    @Override
    public void comer() {
        System.out.println("O Lobo Guará " + getNome()+ " está uivando no cerrado!");
    }

    @Override
    public void emitirSom() {
        System.out.println("O Lobo Guará " + getNome()+ " está comendo carne!");
    }

    public void correr(){
        System.out.println("O Lobo Guará " + getNome()+ " está correndo!");
    }

    public double getTamanhoDoFocinho() {
        return tamanhoDoFocinho;
    }

    public void setTamanhoDoFocinho(double tamanhoDoFocinho) {
        this.tamanhoDoFocinho = tamanhoDoFocinho;
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