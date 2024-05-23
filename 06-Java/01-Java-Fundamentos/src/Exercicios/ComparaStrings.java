package Exercicios;

public class ComparaStrings {
    public static void main(String[] args) {
        String senha = "12345";
        
        /*  == : é usado para comparações, mas não é indicado para comparar strings;
            equals() : é usado para comparar o conteúdo de string;
            equalsIgnoreCase() : é semelhante ao equals, porém é case-insensitive.
        */
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}