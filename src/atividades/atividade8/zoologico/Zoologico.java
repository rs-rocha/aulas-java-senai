package atividades.atividade8.zoologico;

public class Zoologico {
    public static void main(String[] args) {
        LoboGuara lobo1 = new LoboGuara("Dendê", 23.5, "Caverna Branca", 12.5);
        System.out.println(lobo1);

        AraraAzul arara1 = new AraraAzul("Jade", 1.1, "Area das Araras", "curvado");
        System.out.println(arara1);

        arara1.voar();
        arara1.comer();
        arara1.emitirSom();

        lobo1.comer();
        lobo1.correr();
        lobo1.emitirSom();

        System.out.println(arara1.getNome() + " está pesando " + arara1.getPeso() + " neste mês de julho!" );
        System.out.println(lobo1.getNome() + " está pesando " + lobo1.getPeso() + " neste mês de julho!" );

    }
}
