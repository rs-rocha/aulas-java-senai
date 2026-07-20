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

        System.out.println("Digite suas tarefas:");
        while (true){
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

    }
}
class Tarefas{
    public void ordenar(ArrayList<String> tarefas){

    }
    public void metodoFifo(ArrayList<String> tarefas){

    }
    public void metodoFefo(ArrayList<String> tarefas){

    }
    public void metodoLifo(ArrayList<String> tarefas){

    }
    metodo void registrar(ArrayList<String> tarefas){

    }
}