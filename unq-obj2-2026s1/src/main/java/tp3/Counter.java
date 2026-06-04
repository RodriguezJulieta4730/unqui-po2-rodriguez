package tp3;


import java.util.ArrayList;

public class Counter {
    private final ArrayList<Integer> lista = new ArrayList<>(); //crea una lista vacia
// es privada porque las variables son privadas
    public int getCantidadDePares() {
        int cantidad = 0; // contador de pares inicializa en cero
        for (int n : lista) { // por cada numero en la lista
            if (n % 2 == 0) { // si el resto de dividirlo por dos da cero
                cantidad++;   // se le suma uno al contador
            }
        }
        return cantidad;      // retorna el contador de pares
    }

    public int getCantidadDeImpares() {
        int cantidad = 0;
        for (int n : lista) {
            if (n % 2 != 0) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int getCantidadDeMultiplos(int n) {
        int cantidad = 0 ;
        for (int m : lista) {
            if (m % n == 0) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public void addNumber(int i) {
        lista.add(i);
    }
}