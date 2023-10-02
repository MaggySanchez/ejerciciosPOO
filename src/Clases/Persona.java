package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    private List<Cuenta> cuentasAsociadas;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuentasAsociadas = new ArrayList<>();
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Cuenta> getCuentasAsociadas() {
        return cuentasAsociadas;
    }

    public void setCuentasAsociadas(List<Cuenta> cuentasAsociadas) {
        this.cuentasAsociadas = cuentasAsociadas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", cuentas=" + cuentasAsociadas +
                '}';
    }

    public String getNombreCompleto() {
        return getNombre() + " " + getApellido();
    }

    public boolean esMayorDeEdad() {
        return edad>60;
    }

    //El método getSaldoTotal() debe traer la suma de todos los saldos de todas las cuentas que posea la persona.
    public Double getSaldoTotal() {
        Double saldoTotal = 0.00;
        for (Cuenta cuenta: cuentasAsociadas) {
            saldoTotal += cuenta.getSaldo();
        }
        return saldoTotal;
    }
    
    //El método mostrarCuentas() debe mostrar por consulta el saldo de cada cuenta en forma ordenada por número de cuenta.
    public void mostrarCuentas() {
        Iterator<Cuenta> iterator = cuentasAsociadas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void agregarCuenta(Cuenta cuenta) {
        if (!cuentasAsociadas.contains(cuenta)) {
            cuentasAsociadas.add(cuenta);
        } else {
            System.out.println("La cuenta "+ cuenta.getNroCuenta() + " ya se encuentra asociada.");
        }
    }

}

