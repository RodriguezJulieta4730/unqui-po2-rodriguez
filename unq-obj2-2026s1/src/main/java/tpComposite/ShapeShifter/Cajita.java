package tpComposite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class Cajita implements IShapeShifter {
    private final List<IShapeShifter> shapes = new ArrayList<>();
    public Cajita(IShapeShifter unShape, IShapeShifter otroShape) {
        shapes.add(unShape);
        shapes.add(otroShape);
    }

    public Cajita(List<IShapeShifter> shapes) {
        this.shapes.addAll(shapes);
    }

    @Override
    public IShapeShifter compose(IShapeShifter shape) {
        return new Cajita(this,shape);
    }

    @Override
    public int deepest() {
        int maxDeep= 0;
        for(IShapeShifter s: shapes){
            maxDeep= max(maxDeep,s.deepest());
        }
        return maxDeep + 1;
    }

    @Override
    public IShapeShifter flat() {
        List<IShapeShifter> shapes= new ArrayList<>();
        for (int i: values()){
            IShapeShifter pelotitaNueva = new Pelotita(i);
            shapes.add(pelotitaNueva);
        }
        return new Cajita(shapes);
    }

    @Override
    public List<Integer> values() {
        List<Integer> listaDeValores= new ArrayList<>();
        for(IShapeShifter s: shapes){
            listaDeValores.addAll(s.values());
        }
        return listaDeValores;
    }
}
