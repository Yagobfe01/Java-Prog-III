import java.io.*;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto para salvar no arquivo:");
        String texto = scanner.nextLine();

        // Gravar no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("texto.txt"))) {
            writer.write(texto);
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }

        // Ler do arquivo
        System.out.println("\nConteúdo lido do arquivo:");
        try (BufferedReader reader = new BufferedReader(new FileReader("texto.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
