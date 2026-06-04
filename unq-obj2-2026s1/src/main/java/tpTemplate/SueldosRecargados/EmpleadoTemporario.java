package tpTemplate.SueldosRecargados;

public class EmpleadoTemporario extends Empleado {
    int horasTrabajadas;
    int cantHijos;
    boolean estaCasado;
    public EmpleadoTemporario(int horasTrabajadas, int cantHijos, boolean estaCasado) {
       this.horasTrabajadas=horasTrabajadas;
       this.cantHijos=cantHijos;
       this.estaCasado=estaCasado;
    }

    @Override
    double salarioFamiliar() {
        return cantHijos>0 || estaCasado ? 100 : 0; // booleanos ? respuestas
    }

    @Override
    double sueldoBasico() {
        return 1000;
    }

    @Override
    double salarioPorHora() {
        return horasTrabajadas*5;
    }
}
