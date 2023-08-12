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
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                ", nombre_producto='" + nombre_producto + '\'' +
                '}';
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
}
