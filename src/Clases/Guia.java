package Clases;

import java.util.Scanner;

public class Guia {
    private String nombre;
    private String apellido;
    private int dni;
    private int matricula;
    private Integer calificacion;

    public Guia(String nombre, String apellido, int dni, int matricula, Integer calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.matricula = matricula;
        this.calificacion = calificacion;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", matricula=" + matricula +
                ", calificacion=" + calificacion +
                '}';
    }

    public void cambiarCalificacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nueva calificacion.");
        this.calificacion = scanner.nextInt();
    }

}
