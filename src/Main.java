import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 10;

        filme meuFilme = new filme();
        System.out.println("********************\n");
        System.out.println("*** Dados do filme ***");
        meuFilme.lerDados();
        meuFilme.imprimirDados();

    }
}