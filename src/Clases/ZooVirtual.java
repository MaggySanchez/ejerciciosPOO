package Clases;

import java.util.ArrayList;

public class ZooVirtual {
    private ArrayList<AnimalVirtual> listaAnimales;

    public ArrayList<AnimalVirtual> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<AnimalVirtual> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    @Override
    public String toString() {
        return "ZooVirtual{" +
                "listaAnimales=" + listaAnimales +
                '}';
    }

    public ZooVirtual(ArrayList<AnimalVirtual> listarAnimales) {
        for (AnimalVirtual animal:listarAnimales
             ) {
            System.out.println(animal);
        }
    }
}
