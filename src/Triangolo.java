public class Triangolo extends Forma{
    private int base;
    private int altezza;

    public Triangolo(String nome, int base, int altezza) {
        super(nome); //chiamata al supercostruttore
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public void stampaArea() {
        super.stampaArea();
        System.out.print(getNome() + " = " + (base * altezza) / 2);
    }

}
