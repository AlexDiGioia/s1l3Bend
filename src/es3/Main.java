package es3;

public class Main {
    public static void main(String[] args) {
        articolo articoloLaptop = new articolo("Laptop", 1000.00, 5);
        articolo articolo2 = new articolo("Smartphone", 700.00, 10);

        cliente cliente1 = new cliente("Mario Rossi", "mario.rossi@example.com", "2024-07-24");

        articolo[] articoliNelCarrello = {articoloLaptop, articolo2};

        carrello carrello1 = new carrello(articoliNelCarrello, cliente1);

        System.out.println("----------CLIENTE-----------\n" + cliente1);

        System.out.println("\n" + carrello1);

    }
}