package Exercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Soma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número inteiro:");
            int n1 = sc.nextInt();
            System.out.println("Digite outro número inteiro:");
            int n2 = sc.nextInt();
            int soma = n1 + n2;
            System.out.println("O resultado da soma entre "+ n1 + " e "+ n2 +" é: "+ soma);
        } catch (InputMismatchException e) {
            System.out.println("Erro! Por favor digite um número válido");
            sc.nextLine();
        } finally {
            sc.close();
        } 
    }  
}