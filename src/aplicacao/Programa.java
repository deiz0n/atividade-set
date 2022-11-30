package aplicacao;

import entidades.Estudantes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Estudantes> estudantes = new HashSet<>();

        System.out.print("Quantos estudantes participam do curso A: ");
        int a = sc.nextInt();

        for (int i = 0; i<a; i++) {
            int x = sc.nextInt();
            estudantes.add(new Estudantes(x));
        }

        System.out.print("Quantos estudantes participam do curso B: ");
        int b = sc.nextInt();

        for (int i = 0; i<b; i++) {
            int x = sc.nextInt();
            estudantes.add(new Estudantes(x));
        }

        System.out.print("Quantos estudantes participam do curso C: ");
        int c = sc.nextInt();

        for (int i = 0; i<c; i++) {
            int x = sc.nextInt();
            estudantes.add(new Estudantes(x));
        }

        System.out.println("Total de estudantes: " + estudantes.size());

        sc.close();


    }

}
