package Clases;

import Exceptions.NotaValidaException;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList <Double> calificaciones;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", calificaciones=" + calificaciones +
                '}';
    }

    public void agregarCalificacion(Double notaIngresada) throws NotaValidaException {
        if (notaIngresada < 0 || notaIngresada > 10) {
            throw new NotaValidaException();
        } else {
            calificaciones.add(notaIngresada);
        }
    }

    public void sacarPromedio() {
        Double sumatoria = 0.0;
        for (Double calificacion:calificaciones) {
            sumatoria += calificacion;
        }
        System.out.println(sumatoria/calificaciones.size());
    }
}
