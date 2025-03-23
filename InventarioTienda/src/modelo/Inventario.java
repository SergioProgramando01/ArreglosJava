package modelo;

public class Inventario{
    private String[] productos = {"Camisetas", "Pantalones", "Zapatos"};
    private int[] cantidades = {10, 5, 3};

    public String[] getProductos() {
        return productos;
    }

    public int[] getCantidades() {
        return cantidades;
    }

    public boolean verificarStock(int indice, int cantidad) {
        return cantidades[indice] >= cantidad;
    }

    public void actualizarStock(int indice, int cantidad) {
        cantidades[indice] -= cantidad;
    }
}