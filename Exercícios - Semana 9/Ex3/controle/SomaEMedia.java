package controle;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double num;

        System.out.println("Digite números para calcular soma e média (-1 para parar):");
        while (true) {
            System.out.print("Número: ");
            num = sc.nextDouble();
            if (num == -1) break;
            numeros.add(num);
        }

        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }

        if (numeros.size() > 0) {
            double media = soma / numeros.size();
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }

        sc.close();
    }
}