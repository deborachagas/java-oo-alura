import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DesafioCompras {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        CartaoDeCredito cc;
        int opcao = 1;

        System.out.println("***********************");
        System.out.println("Digite o limite do cartão: ");
        cc = new CartaoDeCredito(leitura.nextDouble());
        System.out.println("***********************");

        while (opcao != 0) {
            Compra compra = new Compra();
            System.out.println("Digite a descrição da compra");
            compra.setDescricao(leitura.next());

            System.out.println("Digite o valor da compra");
            compra.setValor(leitura.nextDouble());

            System.out.println(cc.addCompra(compra));

            System.out.println("novo saldo: " + cc.getSaldo());

            Collections.sort(cc.getCompras());
            for(Compra c: cc.getCompras()) {
                System.out.println(c.getDescricao() + ": "+ c.getValor());
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            opcao = leitura.nextInt();

            while(opcao != 0 && opcao != 1) {
                System.out.println("Opção inválida");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = leitura.nextInt();
            }
        }

    }
}

