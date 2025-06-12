package model;

public abstract class Pessoa implements Exibivel {
    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf) {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException("Nome é obrigatório.");
        if (cpf == null || cpf.isEmpty()) throw new IllegalArgumentException("CPF é obrigatório.");
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}