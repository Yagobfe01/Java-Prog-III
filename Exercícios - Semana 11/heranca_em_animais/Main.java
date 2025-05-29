package teste3;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Mimi", 3);

        System.out.println("=== Cachorro ===");
        cachorro.exibirDados();
        cachorro.emitirSom();

        System.out.println("\n=== Gato ===");
        gato.exibirDados();
        gato.emitirSom();
    }
}
