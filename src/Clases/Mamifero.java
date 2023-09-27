package Clases;

public abstract class Mamifero extends AnimalVirtual{
    private String cantidadCrias;

    public Mamifero(String nombre, int edad, String cantidadCrias) {
        super(nombre, edad);
        this.cantidadCrias = cantidadCrias;
    }

    public String getCantidadCrias() {
        return cantidadCrias;
    }

    public void setCantidadCrias(String cantidadCrias) {
        this.cantidadCrias = cantidadCrias;
    }

    @Override
    public String toString() {
        return super.toString() + "Mamifero{" +
                "cantidadCrias='" + cantidadCrias + '\'' +
                '}';
    }

    public abstract void amamantar();
    public abstract void parir();

}
