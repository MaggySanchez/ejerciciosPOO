package Clases;

import java.util.List;

public class Suscriptor {
    private String nombre;
    private int telefono;
    private String direccion;

    public Suscriptor(String nombre, int telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Suscriptor{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public void suscribirse(Revista revista) {
        for (int i = 0; i < revista.getSuscriptores().size(); i++) {

        }
    }
}
