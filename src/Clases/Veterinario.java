package Clases;

public class Veterinario {
    private String nombre;
    private int matricula;
    private String especialidad;

    public Veterinario(String nombre, int matricula, String especialidad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", matricula=" + matricula +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public void realizarExamen(Mascota mascota, Integer nuevaEdad, Double nuevoPeso) {
        mascota.actualizarInfo(nuevaEdad,nuevoPeso);
        System.out.println(mascota.getNombre() + " fue atendida.");
    }
}
