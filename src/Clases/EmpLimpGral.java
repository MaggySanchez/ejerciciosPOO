package Clases;

public class EmpLimpGral extends EmpleadoLimpieza {
    private int horasExtras;
    private static Double valorHsExtras = 3500.0;

    public EmpLimpGral(String nombre, String apellido, int dni, String direccion, int telefono, Double sueldo, String turno) {
        super(nombre, apellido, dni, direccion, telefono, sueldo, turno);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public static Double getValorHsExtras() {
        return valorHsExtras;
    }

    public static void setValorHsExtras(Double valorHsExtras) {
        EmpLimpGral.valorHsExtras = valorHsExtras;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpLimpGral{" +
                "horasExtras=" + horasExtras +
                '}';
    }

    public void realizarHsExtras(int horas) {
        this.horasExtras += horas;
    }

    @Override
    public void cobrar() {
        this.setSueldoNeto(this.getSueldo() + (this.horasExtras*valorHsExtras));
    }
}
