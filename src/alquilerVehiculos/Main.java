package alquilerVehiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final int DIAS_ALQUILER = 5;

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Toyota", "Corolla", 50.0));
        vehiculos.add(new Moto("Honda", "CB125", 30.0));
        
        System.out.println("SISTEMA DE ALQUILER DE VEHICULOS");
        System.out.println("Duracion del alquiler: " + DIAS_ALQUILER + " dias\n");

        for (Vehiculo v : vehiculos) {
            double costo = v.calcularCostoAlquiler(DIAS_ALQUILER);
            System.out.println("Vehiculo");
            System.out.println(v.getmostrar());
            System.out.println("Costo total por " + DIAS_ALQUILER + " dias: $" + costo);
            System.out.println();
        }
    }
}
