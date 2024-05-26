package br.com.alura.scrennmatch.exercicios;

public class AnimalTeste {
    public static void main(String[] args) {

        /*
         * AnimalCachorro cachorro1 = new AnimalCachorro("Totó");
         * cachorro1.raca = "Vira-lata";
         * Animal animal = (Animal) cachorro1;
         * System.out.println("Nome: " + animal.nome);
         * System.out.println("Raça: " + animal.raca);
         */

         Animal animal = new AnimalCachorro("Totó");
         if (animal instanceof AnimalCachorro) {
            AnimalCachorro cachorro1 = (AnimalCachorro) animal;
            System.out.println("Objeto definido corretamente: \n" + cachorro1);
         } else {
            System.out.println("Objeto não é Tipo AnimalCachorro!");
         }
    }
}
