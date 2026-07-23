package atividades.atividade8.zoologico;

public class LoboGuara extends Animal{
    private int tamanhoDoFocinho;

    @Override
    public void comer() {
        System.out.println("O Lobo Guará está uivando no cerrado!");
    }

    @Override
    public void emitirSom() {
        System.out.println("O Lobo Guará está comendo carne!");
    }

    public void correr(){
        System.out.println("O Lobo Guará está correndo!");
    }

    public int getTamanhoDoFocinho() {
        return tamanhoDoFocinho;
    }

    public void setTamanhoDoFocinho(int tamanhoDoFocinho) {
        this.tamanhoDoFocinho = tamanhoDoFocinho;
    }
}
