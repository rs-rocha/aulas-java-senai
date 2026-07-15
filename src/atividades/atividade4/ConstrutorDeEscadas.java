package atividades.atividade4;

public class ConstrutorDeEscadas {
    public static void main(String[] args) {

        char simbolo = '*';
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++) {
                System.out.printf("%s", simbolo);
            }
            System.out.printf("%s\n", simbolo);
        }

    }
}
