public class Triangolo extends Forma {

    private double base;
    private double altezza;

    public Triangolo(TipoForma tipoForma, double base, double altezza) {
        super(tipoForma);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

}
