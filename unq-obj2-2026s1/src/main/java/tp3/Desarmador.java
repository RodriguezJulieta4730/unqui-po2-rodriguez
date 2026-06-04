package tp3;

import java.util.ArrayList;

public class Desarmador {
    public int getNumeroConMasDigitosPares(ArrayList<Integer> lista){
        int numeroConMasDigitosPares = lista.getFirst(); // obtiene el primer elemento de la lista
        for(int n : lista) {
            if ( getCantidadDeDigitosPares(n)> getCantidadDeDigitosPares(numeroConMasDigitosPares)) {
                numeroConMasDigitosPares = n;
            }
        }
        return numeroConMasDigitosPares;
    }

    public int getCantidadDeDigitosPares (int n) {
        int cantidadDePares = 0;
        while (n !=0) {
            if (n % 2 == 0) {
                cantidadDePares ++ ;
            }
            n = n / 10;
        }
        return cantidadDePares ;
    }

}
