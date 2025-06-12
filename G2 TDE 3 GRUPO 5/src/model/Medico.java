package model;

public class Medico extends Pessoa {
    private String especialidade;

    public Medico(String nome, String cpf, String especialidade) {
        super(nome, cpf);
        if (especialidade == null || especialidade.isEmpty()) throw new IllegalArgumentException("Especialidade é obrigatória.");
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Médico: " + nome + ", CPF: " + cpf + ", Especialidade: " + especialidade);
    }
}