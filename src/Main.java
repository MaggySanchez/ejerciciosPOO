import Clases.EmpLavavajillas;
import Clases.EmpLimpGral;

public class Main {
    public static void main(String[] args) {
        EmpLimpGral.setValorHsExtras(3000.0);
        EmpLimpGral empleado1 = new EmpLimpGral("Alan","Gomez",25697411,"Olavarria 785", 4596321,180000.0,"Tarde");
        empleado1.mostrarInformacion();
        EmpLavavajillas empleado2= new EmpLavavajillas("Lucio","Camargo",8965321,"Lamadrid 789",8596321,150000.0,"Mañana");
        empleado1.realizarHsExtras(8);
        empleado1.cobrar();
        empleado1.mostrarInformacion();
        empleado2.agragrVajillaRota(5);
        empleado2.cobrar();
        empleado2.mostrarInformacion();

    }
}