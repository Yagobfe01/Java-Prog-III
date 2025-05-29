package teste2;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Yamaha", "MT-03", 2023, 321);

        System.out.println("=== Dados do Carro ===");
        carro.exibirDados();

        System.out.println("\n=== Dados da Moto ===");
        moto.exibirDados();
    }
}
