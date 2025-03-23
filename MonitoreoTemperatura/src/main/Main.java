package main;

import modelo.SensorTemperatura;
import vista.TemperaturaVista;
import controlador.TemperaturaControlador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura modelo = new SensorTemperatura();
        TemperaturaVista vista = new TemperaturaVista();
        TemperaturaControlador controlador = new TemperaturaControlador(modelo, vista);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una temperatura (°C): ");
        double temp = scanner.nextDouble();
        
        controlador.agregarTemperatura(temp);
        scanner.close();
    }
}