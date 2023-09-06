package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Revista {
    private String nombre;
    private Integer id;
    private String tipo;
    private List<Edicion> ediciones;
    private List<Suscriptor> suscriptores;

    public Revista(String nombre, Integer id, String tipo) {
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
        this.ediciones = new ArrayList<Edicion>();
        this.suscriptores = new ArrayList<Suscriptor>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Edicion> getEdiciones() {
        return ediciones;
    }

    public void setEdiciones(List<Edicion> ediciones) {
        this.ediciones = ediciones;
    }

    public List<Suscriptor> getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(List<Suscriptor> suscriptores) {
        this.suscriptores = suscriptores;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", tipo='" + tipo + '\'' +
                ", ediciones=" + ediciones +
                ", suscriptores=" + suscriptores +
                '}';
    }

    public void agregarSuscriptor(Suscriptor suscriptor) {
        suscriptores.add(suscriptor);
        System.out.println("Se agrego a " + suscriptor.getNombre() + " como suscriptor.");
    }

    public void darDeBajaSuscriptor(Suscriptor suscriptor) {
        suscriptores.remove(suscriptor);
        System.out.println("Se dio de baja a " + suscriptor.getNombre() + "como suscriptor.");
    }

    public void publicarEdicion(Edicion edicion) {
        Date fecha = new Date();
        edicion.setFecha(fecha);
        ediciones.add(edicion);
        System.out.println("Se publico la edición " + edicion.getId());
    }

    public boolean existeSuscriptor(String nombre) {
        for (Suscriptor suscriptor :
                suscriptores) {
            if (suscriptor.getNombre().equals(nombre)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
