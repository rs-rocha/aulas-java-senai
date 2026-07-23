package atividades.atividade8.zoologico;

public class AraraAzul extends Animal{
    private String tipoDeBico;

    @Override
    public void comer() {
        System.out.println("A Arara Azul está comendo sementes!");
    }

    @Override
    public void emitirSom() {
        System.out.println("A Arara Azul está grasnando!");
    }

    public void voar(){
        System.out.println("A Arara Azul está voando!");
    }

    public String getTipoDeBico() {
        return tipoDeBico;
    }

    public void setTipoDeBico(String tipoDeBico) {
        this.tipoDeBico = tipoDeBico;
    }
}
