public class Producto {
    private double precio;
    private int codigo, stock;
    private String marca, nombre_producto;

    public Producto(double precio, int codigo, int stock, String marca, String nombre_producto) {
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock;
        this.marca = marca;
        this.nombre_producto = nombre_producto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre_producto='" + nombre_producto + '\'' +
                '}';
    }
}
