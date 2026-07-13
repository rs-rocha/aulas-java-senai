package aulas;

public class TerceiraAula {

    public static int somaDeVariaveis(int x, int y){
        int resultado = x + y;
        return resultado;
    }

    public static void imprimirSoma(){
        System.out.println("= METODO DE IMPRESSAO =");
        System.out.println(somaDeVariaveis(10,10));
        System.out.println("= FIM DO METODO DE IMPRESSAO =");
    }

    public static boolean metodoComparacao(int resultado){
        if(resultado == 1)
            return true;
         else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("=== METODO MAIN ===");
        imprimirSoma();
        metodoComparacao(1);
        System.out.println("=== FIM DO METODO MAIN ===");
    }
}
