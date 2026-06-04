package tpTemplate.SueldosRecargados;

public class EmpleadoPlanta extends Empleado {
    int cantHijos;
    public EmpleadoPlanta(int cantHijos) {
        this.cantHijos=cantHijos;
    }

    @Override
    double salarioFamiliar() {
        return 150*cantHijos;
    }

    @Override
    double sueldoBasico() {
        return 3000;
    }

    @Override
    double salarioPorHora() {
        return 0;
    }
}
