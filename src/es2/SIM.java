package es2;

public class SIM {
    private String nTel;
    private double credito;
    private chiamata[] last5;

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
        this.credito = 0.0;
        this.last5 = new chiamata[0];
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public chiamata[] getLast5() {
        return last5;
    }

    public void setLast5(chiamata[] last5) {
        this.last5 = last5;
    }

    public SIM(String nTel) {
        this.nTel = nTel;
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + this.getnTel());
        System.out.println("Credito: " + this.getCredito());
        chiamata[] last5Chiamate = this.getLast5();

        if (last5Chiamate == null || last5Chiamate.length == 0) {
            System.out.println("Nessuna chiamata recente.");
        } else {
            System.out.println("Ultime 5 chiamate:");
            for (chiamata c : last5Chiamate) {

                System.out.println(c); //uso il toSting() di chiamata
            }
        }
    }
}
