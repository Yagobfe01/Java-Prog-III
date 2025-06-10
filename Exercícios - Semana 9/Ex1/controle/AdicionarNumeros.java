package controle;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String resposta;

        do {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            numeros.add(num);
            System.out.print("Deseja inserir outro número? (s/n): ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("Números digitados:");
        for (Integer n : numeros) {
            System.out.println(n);
        }

        sc.close();
    }
}