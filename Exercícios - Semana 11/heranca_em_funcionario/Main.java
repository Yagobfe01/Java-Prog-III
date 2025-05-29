package teste;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 2000);
        Gerente gerente = new Gerente("Amanda", 5000);
        Estagiario estagiario = new Estagiario("João", 1500);

        funcionario.exibirSalario();
        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}
