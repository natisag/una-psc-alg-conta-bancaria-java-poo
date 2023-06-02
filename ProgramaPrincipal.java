package ContaBancaria;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dados dados = new Dados();

        System.out.print("Digite o seu nome: ");
        dados.setNomeDaPessoa(scanner.next());

        System.out.print("Digite seu número da conta: ");
        dados.setNumeroDaConta(scanner.nextInt());

        System.out.print("Digite seu saldo inicial: ");
        dados.setSaldoInicial(scanner.nextInt());

        System.out.println("Conta bancária criada com sucesso.");
        System.out.println("----------------------------");

        while (true) {
            System.out.println("Selecione a opção desejada:\n1 - Depositar valor.\n2 - Sacar valor \n3 - Obter saldo disponível.\n4 - Sair.");
            scanner.nextLine();
            System.out.println("----------------------------");
            dados.setOpcaoDesejada(scanner.nextLine());
            System.out.println("----------------------------");

            switch (dados.getOpcaoDesejada()) {

                case "1":
                    System.out.print("Digite o valor que deseja depositar: ");
                    dados.setValorDeposito(scanner.nextInt());
                    scanner.nextLine();
                    dados.calcularSaldoAtual();
                    System.out.println("Depósito de " + dados.getValorDeposito() + " realizado com sucesso.");
                    System.out.println("----------------------------");
                    break;

                case "2":
                    System.out.print("Qual o valor do saque que deseja: ");
                    dados.setValorSaque(scanner.nextInt());
                    scanner.nextLine();
                    dados.calcularSaldoAtual();
                    if (dados.realizarSaque()) {
                        System.out.println("Saque de " + dados.getValorSaque() + " realizado com sucesso.");
                    }
                    System.out.println("----------------------------");
                    break;

                case "3":
                    System.out.println("Saldo disponível: " + dados.getSaldoAtual());
                    break;

                case "4":
                    System.out.println("Você saiu do programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Comando inválido.");
                    break;
            }
        }
    }
}
