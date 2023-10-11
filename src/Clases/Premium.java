package Clases;

import java.util.ArrayList;

public class Premium extends Paquete{
    private Double puntosAcumulados;
    private ArrayList<Integer> descuentos;
    private int puntosPorExcursion;

    public Premium(int id, Guia guiaAsociado, String titulo, String descripcion, Double precioBase, Double valorAdicional, int cantDias, String tipoTransporte, ArrayList<Integer> descuentos, int puntosPorExcursion) {
        super(id, guiaAsociado, titulo, descripcion, precioBase, valorAdicional, cantDias, tipoTransporte);
        this.puntosAcumulados = 0.0;
        this.descuentos = descuentos;
        this.puntosPorExcursion = puntosPorExcursion;
    }

    public Double getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(Double puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public ArrayList<Integer> getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(ArrayList<Integer> descuentos) {
        this.descuentos = descuentos;
    }

    public int getPuntosPorExcursion() {
        return puntosPorExcursion;
    }

    public void setPuntosPorExcursion(int puntosPorExcursion) {
        this.puntosPorExcursion = puntosPorExcursion;
    }

    @Override
    public String toString() {
        return "Premium{" +
                "puntosAcumulados=" + puntosAcumulados +
                ", descuentos=" + descuentos +
                ", puntosPorExcursion=" + puntosPorExcursion +
                '}';
    }

    @Override
    public void calcularValorTotal(int excursionesContratadas) {
        double precioPorExcursion = getPrecioBase()*0.15;
        double valorFinal = getPrecioBase() + (getExcursiones().size()*precioPorExcursion);
        System.out.println("EL valor final del paquete es: "+valorFinal);
    }

    @Override
    public void incorporarExcursion(String nombreExcursion) {
        if(!getExcursiones().contains(nombreExcursion)) {
            getExcursiones().add(nombreExcursion);
            this.puntosAcumulados += puntosPorExcursion;
        } else {
            System.out.println("La excursion ya esta incluida en el paquete.");
        }
    }

    @Override
    public void eliminarExcursion(String nombreExcursion) {
        if(getExcursiones().contains(nombreExcursion)) {
            getExcursiones().remove(nombreExcursion);
            this.puntosAcumulados -= puntosPorExcursion;
        } else {
            System.out.println("La excursion no existe en el paquete.");
        }
    }
}
