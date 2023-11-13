package Clases;

import Exeptions.ExeptionInvalidProduct;
import Exeptions.ExeptionMaximunSize;
import Factory.ProductoFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String apellido;
    private String mail;
    private Integer edad;
    private ArrayList<Producto> productos;

    public Cliente(String nombre, String apellido, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
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

    public String mostrarNombreCompleto() {
        String nombreCompleto = this.apellido +", "+this.nombre+".";
        System.out.println(nombreCompleto);
        return nombreCompleto;
    }

    public ArrayList<String> nombreYPrecioProductos() {
        ArrayList <String> nombresYPrecios = null;
        for (Producto producto: productos) {
            String nombreyPrecio = producto.getNombre()+": "+producto.getPrecio();
            nombresYPrecios.add(nombreyPrecio);
            System.out.println(nombreyPrecio);
        }
        return nombresYPrecios;
    }

    public void ingresarProducto() throws ExeptionInvalidProduct, ExeptionMaximunSize {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            if (productos.size()<4) {
                System.out.print("Ingrese el codigo del producto ");
                String codigo = scanner.nextLine();
                Producto producto = (Producto)ProductoFactory.getInstance().crearProducto(codigo);
                productos.add(producto);
            } else {
                throw new ExeptionMaximunSize();
            }
            System.out.print("¿Desea agregar otro producto?");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
    }

    public Boolean esMayor() {
        return this.edad>18;
    }

}
