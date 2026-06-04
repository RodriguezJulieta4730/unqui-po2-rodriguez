package tp3;

public class Multiplos{
    public int getNumeroMasAltoEntre0y1000(int x, int y){
        for (int i=1000; i >= 0; i--) {

            if (i % x == 0 && i % y == 0) {
                return i; // Si lo encuentra, termina la función aquí
            }
        }
        return -1; // Si recorretodo y no encuentra nada
    }
}
