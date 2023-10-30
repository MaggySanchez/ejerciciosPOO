package Clases;

import Exeptions.ExeptionInvalidProduct;
import Exeptions.ExeptionMaximunSize;
import Factory.ProductoFactory;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String mail;
    private Integer edad;
    private ArrayList<Producto> productos;

    public Cliente(String nombre, String apellido, String mail, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.edad = edad;
        this.productos = new ArrayList<Producto>();
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        if (edad < 0) {
            throw new IllegalArgumentException();
        } else {
            this.edad = edad;
        }
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", edad=" + edad +
                ", productos=" + productos +
                '}';
    }

    public void mostrarNombreCompleto() {
        System.out.println(this.apellido +", "+this.nombre+".");
    }

    public void nombreYPrecioProductos() {
        for (Producto producto: productos) {
            System.out.println(producto.getNombre()+": "+producto.getPrecio());
        }
    }

    public void ingresarProducto(String codigo) throws ExeptionInvalidProduct, ExeptionMaximunSize {
        if (productos.size()>=4) {
            Producto producto = (Producto)ProductoFactory.getInstance().crearProducto(codigo);
            productos.add(producto);
        } else {
            throw new ExeptionMaximunSize();
        }
    }

}
