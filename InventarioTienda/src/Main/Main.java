package main;

import modelo.Inventario;
import vista.InventarioVista;
import controlador.InventarioControlador;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Inventario modelo = new Inventario();
        InventarioVista vista = new InventarioVista();
        InventarioControlador controlador = new InventarioControlador(modelo, vista);

        Scanner scanner = new Scanner(System.in);
        vista.mostrarInventario(modelo);

        System.out.print("\nSeleccione producto (0: Camisetas, 1: Pantalones, 2: Zapatos): ");
        int producto = scanner.nextInt();
        System.out.print("Cantidad a comprar: ");
        int cantidad = scanner.nextInt();
        
        controlador.comprarProducto(producto, cantidad);
        scanner.close();
    }
}