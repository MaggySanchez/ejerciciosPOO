package Clases;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private int telefono;
    private Double sueldo;

    public Empleado(String nombre, String apellido, int dni, String direccion, int telefono, Double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", sueldo=" + sueldo +
                '}';
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    public void cobrar() {
        System.out.println("El empleado cobro el sueldo.");
    }

    public void mostrarInformacion() {
        System.out.println(this.toString());
    }

}