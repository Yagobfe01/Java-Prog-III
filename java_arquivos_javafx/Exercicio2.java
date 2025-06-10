import java.io.*;

public class Exercicio2 {
    public static void main(String[] args) {
        int contadorPalavras = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] palavras = linha.trim().split("\\s+");
                contadorPalavras += palavras.length;
            }
            System.out.println("Total de palavras: " + contadorPalavras);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
