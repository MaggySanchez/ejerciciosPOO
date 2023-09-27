package Clases;

import Interfaces.Ponedor;

public abstract class Oviparo extends AnimalVirtual implements Ponedor {
    public Oviparo(String nombre, int edad) {
        super(nombre, edad);
    }
}
