package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dueño {
    private String nombre;
    private String direccion;
    private int telefono;
    private List<Mascota> mascotas;

    private List<Veterinario> veterinarios;

    public Dueño(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mascotas = new ArrayList<Mascota>();
        this.veterinarios = new ArrayList<Veterinario>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public List<Veterinario> getVeterinarios() {return veterinarios;};

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public void setVeterinarios(List<Veterinario> veterinarios) {this.veterinarios = veterinarios;};

    @Override
    public String toString() {
        return "Duenio{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", mascotas=" + mascotas +
                '}';
    }

    public void nuevaMascota(Mascota nuevaMAscota) {
        mascotas.add(nuevaMAscota);
        System.out.println("Se agrego a "+ nuevaMAscota.getNombre());
    }

    public void citaVeterinario(Veterinario veterinario, String fecha) throws ParseException {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaCita = formatoFecha.parse(fecha);
        System.out.println("Tiene una cita con " + veterinario.getNombre() + " en la hora y fecha: " + fechaCita.toString());
    }

    public void listarMascotas() {
        for (int i = 0; i < mascotas.size(); i++) {
            System.out.println(mascotas.get(i));
        }
    }
}
