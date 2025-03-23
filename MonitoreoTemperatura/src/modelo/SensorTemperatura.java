package modelo;

import java.util.ArrayList;

public class SensorTemperatura {
    private ArrayList<Double> temperaturas = new ArrayList<>();
    private final double LIMITE_MAXIMO = 30.0;

    public void registrarTemperatura(double temp) {
        temperaturas.add(temp);
    }

    public ArrayList<Double> getTemperaturas() {
        return temperaturas;
    }

    public boolean verificarTemperaturaAlta() {
        for (double temp : temperaturas) {
            if (temp > LIMITE_MAXIMO) {
                return true;
            }
        }
        return false;
    }
}