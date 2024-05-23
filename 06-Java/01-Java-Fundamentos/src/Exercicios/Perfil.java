package Exercicios;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println(String.format("Olá, %s!", nome));
        sc.close();
    }
}
