package vista;

import modelo.Inventario;

public class InventarioVista {
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarInventario(Inventario inventario) {
        System.out.println("\nInventario actual:");
        String[] productos = inventario.getProductos();
        int[] cantidades = inventario.getCantidades();
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": " + cantidades[i]);
        }
    }
}