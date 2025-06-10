package controle;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2Controle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i+1) + ": ");
            nomes.add(sc.nextLine());
        }

        System.out.print("Digite um nome para remover: ");
        String nomeRemover = sc.nextLine();

        if (nomes.remove(nomeRemover)) {
            System.out.println("Nome removido. Lista atual:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        } else {
            System.out.println("Nome não encontrado na lista.");
        }

        sc.close();
    }
}