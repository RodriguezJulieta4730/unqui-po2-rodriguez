package tpComposite;

public class Parcela implements Cultivo {
    private Cultivo cultivo1;
    private Cultivo cultivo2;
    private Cultivo cultivo3;
    private Cultivo cultivo4;

    public Parcela(Cultivo unCultivo1, Cultivo unCultivo2, Cultivo unCultivo3, Cultivo unCultivo4) {
        this.cultivo1 = unCultivo1;
        this.cultivo2 = unCultivo2;
        this.cultivo3 = unCultivo3;
        this.cultivo4 = unCultivo4;
    }

    @Override
    public int ganancias() {
        return (cultivo1.ganancias() + cultivo2.ganancias() + cultivo3.ganancias() + cultivo4.ganancias()) / 4;
    }
}
