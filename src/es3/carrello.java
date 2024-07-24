package es3;

import java.util.Arrays;

public class carrello {
    private final cliente clienteAssociato;
    private final articolo[] articoli;
    private final double totCosto;

    public carrello(articolo[] articoli, cliente clienteAssociato) {
        this.articoli = articoli;
        this.clienteAssociato = clienteAssociato;
        this.totCosto = calcolaTotCosto();
    }

    public cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public articolo[] getArticoli() {
        return articoli;
    }

    public double getTotCosto() {
        return totCosto;
    }

    private double calcolaTotCosto() {
        double tot = 0.0;
        for (articolo art : articoli) {
            tot += art.getPrezzo();
        }
        return tot;
    }

    @Override
    public String toString() {
        return "-------- CARRELLO: ----------" +
                "\nclienteAssociato: " + clienteAssociato +
                "\narticoli: " + Arrays.toString(articoli) +
                "\ntotCosto: " + totCosto + "€" +
                "\n-------------------------------\n";
    }
}
