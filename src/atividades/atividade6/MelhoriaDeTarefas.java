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
                    "\nfim - Para encerrar." +
                    "\n*********** - **** - ***********"
                );
            System.out.println("Digite uma opção e aperte enter: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("**** Cadastrar Tarefas ****");
                    break;

                case 2:
                    System.out.println("**** Visualizar Tarefas ****");
                    break;

                case 3:
                    System.out.println("**** Ordenar Tarefas ****");
                    break;

                case 4:
                    System.out.println("**** Retirar Tarefas ****");

                    break;

                case 5:
                    System.out.println("**** Registrar Tarefas Feitas ****");
                    break;

                default:
                    break;
            }
            /*
            System.out.print("Nova tarefa: ");
            tarefas.add(scanner.nextLine());

            System.out.println("Quer adicionar mais alguma tarefa? (digite 'fim' para " +
                    "finalizar o programa)");
            String opcao = scanner.nextLine();

            if (opcao.equals("fim")){
                break;
            }


        }
        System.out.println("Tarefas salvas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("Tarefa nº"+(i+1)+" "+tarefas.get(i));
        }
        t.ordenar(tarefas);
        */
        }
    }
}

class Tarefas{
    public void ordenar(ArrayList<String> tarefas){
        System.out.println("Lista ordenada");
    }
    public void metodoFifo(ArrayList<String> tarefas){
        System.out.println("Metodo Fifo");
    }
    public void metodoFefo(ArrayList<String> tarefas){
        System.out.println("Metodo Fefo");
    }
    public void metodoLifo(ArrayList<String> tarefas){
        System.out.println("Metodo Lifo");
    }
    public void registrar(ArrayList<String> tarefas){
        System.out.println("Registrar");
    }
}