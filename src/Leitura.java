import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite");
        String filme = leitura.nextLine();
        System.out.println("Ano");
        int ano = leitura.nextInt();
        System.out.println("Avaliação");
        double avaliacao = leitura.nextDouble();
        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);
    }
}
