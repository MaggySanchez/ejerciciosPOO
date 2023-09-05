package Clases;

public class Mascota {
    private String nombre;
    private Integer edad;
    private String especie;
    private Double peso;
    public Mascota(String nombre, Integer edad, String especie, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public Double getPeso() {
        return peso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso() {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                '}';
    }

    public void actualizarInfo(Integer edad, Double peso) {
        this.edad = edad;
        this.peso = peso;
    }
}
