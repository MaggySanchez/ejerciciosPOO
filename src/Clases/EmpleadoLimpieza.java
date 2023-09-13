package Clases;

public class EmpleadoLimpieza extends Empleado {
    private String turno;
    private Double sueldoNeto;

    public EmpleadoLimpieza(String nombre, String apellido, int dni, String direccion, int telefono, Double sueldo, String turno) {
        super(nombre, apellido, dni, direccion, telefono, sueldo);
        this.turno = turno;
        this.sueldoNeto = sueldoNeto;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(Double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public void trabajar() {
        System.out.println("Trabajo en el turno " + this.turno);
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoLimpieza{" +
                "turno='" + turno + '\'' +
                ", sueldoNeto=" + sueldoNeto +
                '}';
    }


    public void mostrarSueldo() {
        System.out.println(this.sueldoNeto);
    }

}
