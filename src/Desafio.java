import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String nome = "Jacqueline Oliveira";
        String tipoConta = "corrente";
        float saldo = 2500;
        int opcao = 0;
        float valor = 0;

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: Jacqueline Oliveira");
        System.out.println("Tipo conta: Corrente");
        System.out.println("Saldo inicial: R$ 2500,00 ");
        System.out.println("***********************");

        while (opcao != 4) {
            System.out.println("Operações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber:");
                    valor = leitura.nextFloat();
                    if (valor < 0) {
                        System.out.println("Valor inválido");
                    } else {
                        saldo = saldo + valor;
                        System.out.println("O novo saldo é: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir:");
                    valor = leitura.nextFloat();
                    if (valor < 0 || valor > saldo) {
                        System.out.println("Valor inválido");
                    } else {
                        saldo = saldo - valor;
                        System.out.println("O novo saldo é: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println(saldo);
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }

    }
}
