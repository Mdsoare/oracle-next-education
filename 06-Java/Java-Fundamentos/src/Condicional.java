public class Condicional {
    public static void main(String[] args) {
        short anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if ( anoDeLancamento >= 2022 ) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if ( incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}