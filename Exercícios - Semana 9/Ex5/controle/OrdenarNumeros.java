package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String resposta;

        do {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
            System.out.print("Deseja inserir outro número? (s/n): ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("s"));

        Collections.sort(numeros);

        System.out.println("Números ordenados:");
        for (int n : numeros) {
            System.out.println(n);
        }

        sc.close();
    }
}