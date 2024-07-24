package es3;

import java.util.Random;

public class cliente {
    private final int id;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    public cliente(String nomeCognome, String email, String dataIscrizione) {
        Random rand = new Random();
        this.id = rand.nextInt(10001);
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    @Override
    public String toString() {
        return "cliente: " +
                "id: " + id +
                ", \nNome e cognome='" + nomeCognome + '\'' +
                ", \nEmail: '" + email + '\'' +
                ", \nData d'iscrizione: '" + dataIscrizione + '\''
                ;
    }
}
