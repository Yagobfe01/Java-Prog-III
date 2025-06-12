package view;

import controller.ConsultaController;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultaController controller = new ConsultaController();

        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Sistema de Consultas Médicas ---");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Cadastrar Médico");
            System.out.println("3. Agendar Consulta");
            System.out.println("4. Listar Consultas");
            System.out.println("5. Buscar Consulta por Nome");
            System.out.println("6. Cancelar Consulta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();  

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Nome do paciente: ");
                        String nomeP = sc.nextLine();
                        System.out.print("CPF do paciente: ");
                        String cpfP = sc.nextLine();
                        Paciente paciente = new Paciente(nomeP, cpfP);
                        pacientes.add(paciente);  
                        paciente.exibirInformacoes();
                        break;

                    case 2:
                        System.out.print("Nome do médico: ");
                        String nomeM = sc.nextLine();
                        System.out.print("CPF do médico: ");
                        String cpfM = sc.nextLine();
                        System.out.print("Especialidade: ");
                        String esp = sc.nextLine();
                        Medico medico = new Medico(nomeM, cpfM, esp);
                        medicos.add(medico); 
                        medico.exibirInformacoes();
                        break;

                    case 3:
                        System.out.println("Escolha um paciente para agendar a consulta:");
                        for (int i = 0; i < pacientes.size(); i++) {
                            System.out.println((i + 1) + ". " + pacientes.get(i).getNome());
                        }
                        System.out.print("Digite o número do paciente: ");
                        int pacienteIndex = sc.nextInt() - 1;
                        sc.nextLine();  
                        if (pacienteIndex < 0 || pacienteIndex >= pacientes.size()) {
                            System.out.println("Paciente inválido.");
                            break;
                        }
                        paciente = pacientes.get(pacienteIndex);  

                        System.out.println("Escolha um médico para agendar a consulta:");
                        for (int i = 0; i < medicos.size(); i++) {
                            System.out.println((i + 1) + ". " + medicos.get(i).getNome());
                        }
                        System.out.print("Digite o número do médico: ");
                        int medicoIndex = sc.nextInt() - 1;
                        sc.nextLine(); 
                        if (medicoIndex < 0 || medicoIndex >= medicos.size()) {
                            System.out.println("Médico inválido.");
                            break;
                        }
                        medico = medicos.get(medicoIndex);  

                        System.out.print("Data da consulta: ");
                        String data = sc.nextLine();

                        controller.agendarConsulta(paciente, medico, data);
                        System.out.println("Consulta agendada com sucesso.");
                        break;

                    case 4:
                        for (Consulta c : controller.listarConsultas()) {
                            c.exibirConsulta();
                        }
                        break;

                    case 5:
                        System.out.print("Nome do paciente: ");
                        String nomeBusca = sc.nextLine();
                        Consulta consulta = controller.buscarConsultaPorNome(nomeBusca);
                        if (consulta != null) {
                            consulta.exibirConsulta();
                        } else {
                            System.out.println("Consulta não encontrada.");
                        }
                        break;

                    case 6:
                        System.out.print("Nome do paciente: ");
                        String nomeCancela = sc.nextLine();
                        controller.cancelarConsulta(nomeCancela);
                        System.out.println("Consulta cancelada.");
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        return;

                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
