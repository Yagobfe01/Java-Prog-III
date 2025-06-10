package controle;

import dominio.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();

                    if (tipo == 1) {
                        System.out.print("Qtd de portas: ");
                        int portas = scanner.nextInt();
                        veiculos.add(new Carro(placa, modelo, ano, portas));
                    } else if (tipo == 2) {
                        System.out.print("Cilindrada: ");
                        int cilindrada = scanner.nextInt();
                        veiculos.add(new Moto(placa, modelo, ano, cilindrada));
                    } else if (tipo == 3) {
                        System.out.print("Capacidade de carga (toneladas): ");
                        double carga = scanner.nextDouble();
                        veiculos.add(new Caminhao(placa, modelo, ano, carga));
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Veículos Cadastrados ---");
                    for (Veiculo v : veiculos) {
                        v.exibirDados();
                    }
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
