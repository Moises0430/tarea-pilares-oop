package alquilerVehiculos;

public class Moto extends Vehiculo {

    private static final double RECARGO_CASCO = 5.0;

    public Moto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (getTarifaBase() * dias) + RECARGO_CASCO;
    }

    @Override
    public String getmostrar() {
        return "Tipo: Moto | Marca: " + getMarca() + " | Modelo: " + getModelo()+ " | Tarifa base: $" + getTarifaBase() + " | Casco: $" + RECARGO_CASCO + " fijo";
    }
}
