package es3;

import java.util.Random;

public class articolo {
    private final int id;
    private String descrizione;
    private double prezzo;
    private int quantiDisponibili;

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setQuantiDisponibili(int quantiDisponibili) {
        this.quantiDisponibili = quantiDisponibili;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public articolo(String descrizione, double prezzo, int quantiDisponibili) {
        Random rand = new Random();
        this.id = rand.nextInt(10001);
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantiDisponibili = quantiDisponibili;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantiDisponibili() {
        return quantiDisponibili;
    }

    @Override
    public String toString() {
        return "articolo{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", quantiDisponibili=" + quantiDisponibili +
                '}';
    }
}
