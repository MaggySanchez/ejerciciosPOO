package Clases;

import java.util.ArrayList;

public abstract class Paquete implements Comparable<Paquete>{
    private int id;
    private Guia guiaAsociado;
    private String titulo;
    private String descripcion;
    private Double precioBase;
    private Double valorAdicional;
    private int cantDias;
    private String tipoTransporte;
    private ArrayList<String> excursiones;

    public Paquete(int id, Guia guiaAsociado, String titulo, String descripcion, Double precioBase, Double valorAdicional, int cantDias, String tipoTransporte) {
        this.id = id;
        this.guiaAsociado = guiaAsociado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.cantDias = cantDias;
        this.tipoTransporte = tipoTransporte;
        this.excursiones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Guia getGuiaAsociado() {
        return guiaAsociado;
    }

    public void setGuiaAsociado(Guia guiaAsociado) {
        this.guiaAsociado = guiaAsociado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public ArrayList<String> getExcursiones() {
        return excursiones;
    }

    public void setExcursiones(ArrayList<String> excursiones) {
        this.excursiones = excursiones;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "id=" + id +
                ", guiaAsociado=" + guiaAsociado +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", cantDias=" + cantDias +
                ", tipoTransporte='" + tipoTransporte + '\'' +
                ", excursiones=" + excursiones +
                '}';
    }

    public void incorporarExcursion(String nombreExcursion) {
        if(!excursiones.contains(nombreExcursion)) {
            excursiones.add(nombreExcursion);
        } else {
            System.out.println("La excursion ya esta incluida en el paquete.");
        }
    }

    public void eliminarExcursion(String nombreExcursion) {
        if(excursiones.contains(nombreExcursion)) {
            excursiones.remove(nombreExcursion);
        } else {
            System.out.println("La excursion no existe en el paquete.");
        }
    }

    public void buscarExcursion(String nombreExcursion) {
        if(excursiones.contains(nombreExcursion)) {
            System.out.println("la excursion "+nombreExcursion+ " se encuentra en la posicion " + excursiones.lastIndexOf(nombreExcursion));;
        } else {
            System.out.println("La excursion no existe en el paquete.");
        }
    }

    public abstract void calcularValorTotal(int excursionesContratadas);

    @Override
    public int hashCode() {
        int hash=17;
        return hash*31*titulo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Paquete)obj).id;
    }

    @Override
    public int compareTo(Paquete paqueteAComparar) {
        if ((paqueteAComparar.cantDias>this.cantDias) && (paqueteAComparar.excursiones.size() > this.excursiones.size())) {
            return -1;
        } else if ((paqueteAComparar.cantDias<this.cantDias) && (paqueteAComparar.excursiones.size()<this.excursiones.size())) {
            return 1;
        } else {
            return 0;
        }



    }
}
