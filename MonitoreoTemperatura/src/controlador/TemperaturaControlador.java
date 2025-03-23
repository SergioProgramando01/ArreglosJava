package controlador;

import modelo.SensorTemperatura;
import vista.TemperaturaVista;

public class TemperaturaControlador {
    private SensorTemperatura modelo;
    private TemperaturaVista vista;

    public TemperaturaControlador(SensorTemperatura modelo, TemperaturaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarTemperatura(double temp) {
        modelo.registrarTemperatura(temp);
        vista.mostrarTemperaturas(modelo);
        if (modelo.verificarTemperaturaAlta()) {
            vista.mostrarMensaje("⚠ ¡Alerta! Temperatura demasiado alta.");
        }
    }
}