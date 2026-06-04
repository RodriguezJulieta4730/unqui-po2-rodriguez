package tpTemplate.SueldosRecargados;

public abstract class Empleado {
    public double salario() {
        double salario= 0;
        salario+= salarioPorHora();
        salario+= sueldoBasico();
        salario+= salarioFamiliar();
        salario-= aporteYObraSocial(salario);
        return salario;
    }

    private double aporteYObraSocial(double unSalario) {
        return unSalario*0.13;
    }

    abstract double salarioFamiliar();
    abstract double sueldoBasico();
    abstract double salarioPorHora();

}
