package atividades.atividade6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ordenação de tarefas em ordem alfabetica/tadas
 * Metodo para remover tarefas espefícicas
 *  > Tarefas pelo metodo FIFO
 *  > Tarefas pelo metodo FEFO
 *  > Tarefas pelo metodo LIFO
 * (Opicional) Adicionar um metodo que registre
 * as tarefas que foram concluídas
 */

public class MelhoriaDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.println("Digite suas tarefas:");
        while (true){
            System.out.print("Nova tarefa: ");
            tarefas.add(scanner.nextLine());

            System.out.println("Quer adicionar mais alguma tarefa? (digite 'fim' para finalizar o programa)");
            String opcao = scanner.nextLine();

            if (opcao.equals("fim")){
                break;
            }
        }
        System.out.println("Tarefas salvas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("Tarefa nº"+(i+1)+" "+tarefas.get(i));
        }
    }
}
