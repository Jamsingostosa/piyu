import java.util.Scanner;

public class filme {
    //atributos da classe
    String nome;
    String classificacao;
    String genero;
    boolean incluidoNoPlano;
    int duracaoEmMinutos;

    public void imprimirDados() {
        System.out.println("Filme: " + nome);
        System.out.println("classificação: " + classificacao);
        System.out.println("duração: " + duracaoEmMinutos + "minutos");
        System.out.println("genero: " + genero);
        System.out.println("incluie no plano: " + incluidoNoPlano);
    }

    public void lerDados() {
        Scanner ler = new Scanner(System.in);
        System.out.println("------------------\n");
        System.out.println("digite o novo nome do filme");
        nome = ler.nextLine();
        System.out.println("digite o genero ");
        genero = ler.nextLine();
        System.out.println("digite a classificação");
        classificacao = ler.nextLine();
        System.out.println("filme incluso no plano? (true ou false");
        incluidoNoPlano = ler.nextBoolean();
        System.out.println("digite a duração");
        duracaoEmMinutos = ler.nextInt();


    }
}