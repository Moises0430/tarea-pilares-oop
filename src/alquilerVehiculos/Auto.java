package alquilerVehiculos;

public class Auto extends Vehiculo {

    private static final double RECARGO_SEGURO = 10.0;

    public Auto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (getTarifaBase() + RECARGO_SEGURO) * dias;
    }

    @Override
    public String getmostrar() {
        return "Tipo: Auto Marca: " + getMarca() + " Modelo: " + getModelo() + " Tarifa base: $" + getTarifaBase() + "/dia" + " Seguro: $" + RECARGO_SEGURO + "/dia";
    }
}
