package es1;

public class rettangolo {
    private double base;
    private double altezza;

    public rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void stampaRettangolo(rettangolo r) {
        System.out.println("base: " + r.getBase() + " | altezza: " + r.getAltezza());
    }

    public static void stampaDueRettangoli(rettangolo r1, rettangolo r2) {
        double p1 = (r1.getAltezza() + r1.getBase()) * 2;
        double p2 = (r2.getAltezza() + r2.getBase()) * 2;
        double a1 = r1.getBase() * r1.getAltezza();
        double a2 = r2.getBase() * r2.getAltezza();
        double psum = p1 + p2;
        double asum = a1 + a2;

        System.out.println("perimetro rettangolo 1: " + p1 + ", area rettangolo 1: " + a1);
        System.out.println("perimetro rettangolo 2: " + p2 + ", altezza rettangolo 2: " + a2);
        System.out.println("somma perimetri: " + psum + ", somma aree: " + asum);
    }

}
