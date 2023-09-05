import Clases.Dueño;
import Clases.Mascota;
import Clases.Veterinario;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Dueño dueño1 = new Dueño("Marcos Silva", "Av. Independecia 504",43056895);
        System.out.println(dueño1);
        Mascota mascota1 = new Mascota("Pepe", 5,"Loro",0.500);
        System.out.println(mascota1);
        Veterinario veterinario1 = new Veterinario("Luis Espinoza", 58964,"Mamiferos");
        System.out.println(veterinario1);
        dueño1.nuevaMascota(mascota1);
        dueño1.listarMascotas();
        dueño1.citaVeterinario(veterinario1,"07/10/2023 09:00:00");
        veterinario1.realizarExamen(mascota1,5,0.505);
        System.out.println(mascota1);
    }
}