import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Escolha a operação: ");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Verificar saldo");
            System.out.println("0. Encerrar programa");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite a quantidade a ser retirada: ");
                    double valorRetirada = scanner.nextDouble();
                    if (valorRetirada > saldo) {
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    saldo -= valorRetirada;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                    System.out.println("O saldo da conta é: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

}
