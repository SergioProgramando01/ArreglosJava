package vista;

import modelo.SensorTemperatura;

public class TemperaturaVista {
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarTemperaturas(SensorTemperatura sensor) {
        System.out.println("\nTemperaturas registradas: " + sensor.getTemperaturas());
    }
}