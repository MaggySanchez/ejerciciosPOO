package Clases;

import Interfaces.Ponedor;

public class Ornitorrinco extends Mamifero implements Ponedor {
    public Ornitorrinco(String nombre, int edad, String cantidadCrias) {
        super(nombre, edad, cantidadCrias);
    }

    @Override
    public String toString() {
        return super.toString() + "Ornitorrinco{}";
    }

    @Override
    public void amamantar() {

    }

    @Override
    public void parir() {

    }

    @Override
    public void ponerHuevos() {

    }

    @Override
    public void romperCascaron() {
    }
}
