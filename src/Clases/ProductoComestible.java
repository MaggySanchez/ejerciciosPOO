package Clases;

import java.util.Date;

public class ProductoComestible extends Producto {
    private Date vencimiento;

    public ProductoComestible(int id, String nombre, Double precio, String descripcion, Date vencimiento) {
        super(id, nombre, precio, descripcion);
        this.vencimiento = vencimiento;
    }
    public ProductoComestible () {}

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString() {
        return "ProductoComestible{" +
                "vencimiento=" + vencimiento +
                '}';
    }
}
