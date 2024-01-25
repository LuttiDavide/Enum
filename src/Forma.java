public abstract class Forma {

    private TipoForma tipoForma;

    public Forma(TipoForma tipoForma) {
        this.tipoForma = tipoForma;
    }

    public abstract double calcolaArea();

    public TipoForma getTipoForma() {
        return tipoForma;
    }
}
