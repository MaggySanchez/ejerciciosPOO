package Clases;

public class Simple extends Paquete{
    private Boolean descuento;

    public Simple(int id, Guia guiaAsociado, String titulo, String descripcion, Double precioBase, Double valorAdicional, int cantDias, String tipoTransporte, Boolean descuento) {
        super(id, guiaAsociado, titulo, descripcion, precioBase, valorAdicional, cantDias, tipoTransporte);
        this.descuento = descuento;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "descuento=" + descuento +
                '}';
    }

    @Override
    public void calcularValorTotal(int excursionesContratadas) {
        double precioPorExcursion = getPrecioBase()*0.15;
        double valorFinal = getPrecioBase() + (getExcursiones().size()*precioPorExcursion);
        if (descuento) {
            valorFinal -= valorFinal*0.25;
        }
        System.out.println("EL valor final del paquete es: "+valorFinal);
    }
}
