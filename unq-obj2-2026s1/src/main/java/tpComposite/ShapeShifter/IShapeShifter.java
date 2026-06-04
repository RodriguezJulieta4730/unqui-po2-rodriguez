package tpComposite.ShapeShifter;

import java.util.List;

public interface IShapeShifter {
    IShapeShifter compose (IShapeShifter shape);
    int deepest();
    IShapeShifter flat();
    List<Integer> values();
}
