package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ConsultaController {
    private List<Consulta> consultas = new ArrayList<>();

    public void agendarConsulta(Paciente paciente, Medico medico, String data) throws CampoObrigatorioException {
        if (data == null || data.isEmpty()) throw new CampoObrigatorioException("Data da consulta é obrigatória.");
        consultas.add(new Consulta(paciente, medico, data));
    }

    public List<Consulta> listarConsultas() {
        return consultas;
    }

    public Consulta buscarConsultaPorNome(String nomePaciente) throws ConsultaNaoEncontradaException {
        return consultas.stream()
                .filter(c -> c.getPaciente().getNome().equalsIgnoreCase(nomePaciente))
                .findFirst()
                .orElseThrow(() -> new ConsultaNaoEncontradaException("Consulta não encontrada para o paciente: " + nomePaciente));
    }

    public void cancelarConsulta(String nomePaciente) throws ConsultaNaoEncontradaException {
        Consulta consulta = buscarConsultaPorNome(nomePaciente);
        consultas.remove(consulta);
    }
}