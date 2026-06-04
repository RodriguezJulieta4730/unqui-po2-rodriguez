package tpComposite.ShapeShifter;

import java.util.List;

public class Pelotita implements IShapeShifter {
    private int valor;
    public Pelotita(int valor) {
        this.valor=valor;
    }

    @Override
    public IShapeShifter compose(IShapeShifter shape) {
        IShapeShifter cajita = new Cajita(this,shape);
        return cajita;
    }

    @Override
    public int deepest() {
        return 0;
    }

    @Override
    public IShapeShifter flat() {
        return this;
    }

    @Override
    public List<Integer> values() {
        return List.of(valor);
    }
}
