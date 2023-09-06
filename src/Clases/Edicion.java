package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Edicion {
    private Integer id;
    private Date fecha;
    private Double precio;
    private List<Articulo> articulos;

    public Edicion(Integer id, Double precio) {
        this.id = id;
        this.fecha = new Date();
        this.precio = precio;
        this.articulos = new ArrayList<Articulo>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Edicion{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", precio=" + precio +
                ", articulos=" + articulos +
                '}';
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
        System.out.println("Se agrego el articulo " + articulo.getTitulo());
    }
}
