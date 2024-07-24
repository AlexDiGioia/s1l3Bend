package es2;

public class chiamata {
    private int dur;
    private String nChiamato;

    public chiamata(int dur, String nChiamato) {
        this.dur = dur;
        this.nChiamato = nChiamato;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public String getnChiamato() {
        return nChiamato;
    }

    @Override
    public String toString() {
        return "chiamata{" +
                "dur=" + dur +
                ", nChiamato='" + nChiamato + '\'' +
                '}';
    }

    public void setnChiamato(String nChiamato) {
        this.nChiamato = nChiamato;
    }
}
