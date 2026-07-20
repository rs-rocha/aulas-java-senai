package atividades.atividade6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Criar um arquivo novo, numa pasta de Atividade6 e ele deve conter as seguintes
 * melhorias de código:
 *
 *     Ordenação de tarefas em ordem alfabetica/tadas
 *     Metodo para remover tarefas espefícicas
 *     > removerTarefas pelo metodo FIFO
 *     > removerTarefas pelo metodo FEFO
 *     > removerTarefas pelo metodo LIFO
 *
 * (Opicional) Adicionar um metodo que registre
 * as tarefas que foram concluídas
 */

public class MelhoriaDeTarefas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        Tarefas t = new Tarefas();


        while (true) {
            System.out.println(
                    "*********** - Menu - ***********" +
                    "\n1 - Cadastrar Tarefas" +
                    "\n2 - Visualizar Tarefas" +
                    "\n3 - Ordenar Tarefas" +
                    "\n4 - Retirar Tarefas" +
                    "\n5 - Registrar Tarefas Feitas" +
                    "\n0 - Para encerrar." +
                    "\n*********** - **** - ***********"
                );
            System.out.println("Digite uma opção e aperte enter: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    String incluirTarefa;
                    while(true){
                        System.out.println("**** Cadastrar Tarefas ****");
                        System.out.print("Nova tarefa: ");
                        tarefas.add(scanner.nextLine());

                        System.out.println("Quer adicionar mais alguma tarefa? (digite 'fim' para " +
                                "finalizar o programa)");
                        incluirTarefa = scanner.nextLine();

                        if (incluirTarefa.equals("fim")){
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("**** Visualizar Tarefas ****");
                    System.out.println("Tarefas salvas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println("Tarefa nº"+(i+1)+" "+tarefas.get(i));
                    }
                    break;

                case 3:
                    System.out.println("**** Ordenar Tarefas ****");
                    t.ordenar(tarefas);
                    break;

                case 4:
                    System.out.println("**** Retirar Tarefas ****");
                    t.retirarTarefa(tarefas);
                    break;

                case 5:
                    System.out.println("**** Registrar Tarefas Feitas ****");
                    t.registrar(tarefas);
                    break;

                case 0:
                    System.out.println("--Saindo do Sistema--");
                    return;
            }
        }
    }
}

class Tarefas{

    public void ordenar(ArrayList<String> myLista){
        System.out.println("Lista ordenada");
        System.out.println(myLista.sort());
    }
    public void retirarTarefa(ArrayList<String> myLista) {
        System.out.println(
                "**** Retirando tarefa ****" +
                "\n1.Metodo Fifo" +
                "\n2.Metodo Fefo" +
                "\n3.Metodo Lifo"
                );
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um metodo: ");
        int opcao = Integer.parseInt(sc.nextLine());
        switch (opcao){
            case 1:
                System.out.println("Vc escolheu metodo Fifo");
                metodoFifo(myLista);

                break;
            case 2:
                System.out.println("Vc escolheu metodo Fefo");
                metodoFefo(myLista);
                break;
            case 3:
                System.out.println("Vc escolheu metodo Lifo");
                metodoLifo(myLista);
                break;
            default:
                System.out.println("Saindo dos Metodos");
                break;
        }
    }
    public void metodoFifo(ArrayList<String> myLista){
        System.out.println("Dentro do Metodo Fifo");
    }
    public void metodoFefo(ArrayList<String> myLista){
        System.out.println("Dentro do Metodo Fefo");
    }
    public void metodoLifo(ArrayList<String> myLista){
        System.out.println("Dentro do Metodo Lifo");
    }
    public void registrar(ArrayList<String> myLista){
        System.out.println("Dentro do método Registrar");
    }
}