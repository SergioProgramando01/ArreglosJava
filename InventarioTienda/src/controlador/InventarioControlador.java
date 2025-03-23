package controlador;

import modelo.Inventario;
import vista.InventarioVista;

public class InventarioControlador {
    private Inventario modelo;
    private InventarioVista vista;

    public InventarioControlador(Inventario modelo, InventarioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void comprarProducto(int indice, int cantidad) {
        if (modelo.verificarStock(indice, cantidad)) {
            modelo.actualizarStock(indice, cantidad);
            vista.mostrarMensaje("✅ Compra realizada con éxito.");
        } else {
            vista.mostrarMensaje("❌ Stock insuficiente.");
        }
        vista.mostrarInventario(modelo);
    }
}