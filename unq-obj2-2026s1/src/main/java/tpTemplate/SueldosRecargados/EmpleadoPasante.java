package tpTemplate.SueldosRecargados;

public class EmpleadoPasante extends Empleado {
    int horasTrabajadas;
    public EmpleadoPasante(int horasTrabajadas) {
        this.horasTrabajadas=horasTrabajadas;
    }

    @Override
    double salarioFamiliar() {
        return 0;
    }

    @Override
    double sueldoBasico() {
        return 0;
    }

    @Override
    double salarioPorHora() {
        return horasTrabajadas * 40;
    }
}
