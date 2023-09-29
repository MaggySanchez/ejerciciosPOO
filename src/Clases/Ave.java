package Clases;

import Interfaces.Ponedor;

public abstract class Ave extends Oviparo {
    public Ave(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String toString() {
        return super.toString() + "Ave{}";
    }

    @Override
    public void ponerHuevos() {

    }

    @Override
    public void romperCascaron() {

    }

    public abstract void volar();


}
