package Clases;

public class EmpLavavajillas extends EmpleadoLimpieza {
    private int vajillaRota;
    private static Double precioVajilla = 300.0;

    public EmpLavavajillas(String nombre, String apellido, int dni, String direccion, int telefono, Double sueldo, String turno) {
        super(nombre, apellido, dni, direccion, telefono, sueldo, turno);
    }

    public int getVajillaRota() {
        return vajillaRota;
    }

    public void setVajillaRota(int vajillaRota) {
        this.vajillaRota = vajillaRota;
    }

    public static Double getPrecioVajilla() {
        return precioVajilla;
    }

    public static void setPrecioVajilla(Double precioVajilla) {
        EmpLavavajillas.precioVajilla = precioVajilla;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpLavavajillas{" +
                "vajillaRota=" + vajillaRota +
                '}';
    }

    public void agragrVajillaRota(int vajillaRota) {
        this.vajillaRota += vajillaRota;
    }

    @Override
    public void cobrar() {
        if (this.vajillaRota>=2){
            this.setSueldoNeto(this.getSueldo()-(this.vajillaRota*precioVajilla));
        } else {
            this.setSueldoNeto(this.getSueldo());
        }
    }
}
