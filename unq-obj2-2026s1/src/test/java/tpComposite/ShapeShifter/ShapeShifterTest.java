package tpComposite.ShapeShifter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeShifterTest {
    @Test
    void test001_compose(){
        IShapeShifter pelotita1 = new Pelotita(1);
        IShapeShifter pelotita2 = new Pelotita(2);
        IShapeShifter cajita1 = pelotita1.compose(pelotita2);

        assertEquals(1, cajita1.deepest());
    }

    @Test
    void test02() {
        IShapeShifter p1 = new Pelotita(1);
        IShapeShifter p2 = new Pelotita(2);
        IShapeShifter p3 = new Pelotita(3);
        IShapeShifter p4 = new Pelotita(4);
        IShapeShifter p5 = new Pelotita(5);

        IShapeShifter p6 = p1.compose(p2); // [1,2]
        IShapeShifter p7 = p3.compose(p6); // [3,[1,2]]
        IShapeShifter p8 = p4.compose(p5); // [4,5]
        IShapeShifter p9 = p7.compose(p8); // [[3,[1,2]], [4,5]]

        assertEquals(3, p9.deepest());
    }

    @Test
    void test03_valueP(){
        IShapeShifter p1 = new Pelotita(1);
        assertTrue(p1.values().contains(1));
    }

    @Test
    void test04_valueC(){
        IShapeShifter p1 = new Pelotita(1);
        IShapeShifter p2 = new Pelotita(2);
        IShapeShifter p3 = new Pelotita(3);
        IShapeShifter p4 = new Pelotita(4);
        IShapeShifter p5 = new Pelotita(5);

        IShapeShifter p6 = p1.compose(p2); // [1,2]
        IShapeShifter p7 = p3.compose(p6); // [3,[1,2]]
        IShapeShifter p8 = p4.compose(p5); // [4,5]
        IShapeShifter p9 = p7.compose(p8); // [[3,[1,2]], [4,5]]
        assertTrue(p9.values().containsAll(List.of(1,2,3,4,5)));
    }
    @Test
    void test05_flatP(){
        IShapeShifter p1 = new Pelotita(1);
        assertEquals(0, p1.flat().deepest());
        assertTrue(p1.flat().values().contains(1));

    }

    @Test
    void test06_flatC(){
        IShapeShifter p1 = new Pelotita(1);
        IShapeShifter p2 = new Pelotita(2);
        IShapeShifter p3 = new Pelotita(3);
        IShapeShifter p4 = new Pelotita(4);
        IShapeShifter p5 = new Pelotita(5);

        IShapeShifter p6 = p1.compose(p2); // [1,2]
        IShapeShifter p7 = p3.compose(p6); // [3,[1,2]]
        IShapeShifter p8 = p4.compose(p5); // [4,5]
        IShapeShifter p9 = p7.compose(p8); // [[3,[1,2]], [4,5]]
        assertEquals(1, p9.flat().deepest());
        assertTrue(p9.flat().values().containsAll(List.of(1,2,3,4,5)));
    }
}
