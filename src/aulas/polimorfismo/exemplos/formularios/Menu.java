package aulas.polimorfismo.exemplos.formularios;

import aulas.polimorfismo.exemplos.formularios.Cadastro;

public class Menu {

    void menuPrincipal(){
        System.out.println(
                "\n************ MENU **************" +
                "\n1.Cadastrar" +
                "\n2.Completar Dados" +
                "\n3." +
                "\n4.Sair"
        );
    }
    void digiteUmaOpcao(){
        System.out.println("Digite uma opcao: ");
    }
    void menuCadastro(){
        System.out.println(
                "\n************ MENU **************" +
                "\n1.Cadastrar nome" +
                "\n2.Cadastrar idade" +
                "\n3.Cadastrar cargo" +
                "\n4.Sair"
        );
    }
    void completarCadastro(){
        System.out.println(

        );

    }
    void selecionarOpcao(int opcao){
        switch(opcao){
            case 1:
                menuCadastro();
                break;

            case 2:
                break;

            case 3:
                break;
            case 4:
                return;
        }
    }
}
