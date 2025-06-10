package controle;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4Controle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros.add(sc.nextInt());
        }

        System.out.print("Digite um número para contar as ocorrências: ");
        int numeroProcurado = sc.nextInt();

        int contador = 0;
        for (int n : numeros) {
            if (n == numeroProcurado) {
                contador++;
            }
        }

        System.out.println("O número " + numeroProcurado + " apareceu " + contador + " vez(es).");

        sc.close();
    }
}