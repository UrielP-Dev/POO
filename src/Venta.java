public class Venta {

    private double precio, total, subtotal;
    private int unidades;


    public Venta(double precio, double total, double subtotal, int unidades) {
        this.precio = precio;
        this.total = total;
        this.subtotal = subtotal;
        this.unidades = unidades;
    }
    public Double subtotal(){
        this.subtotal = precio*unidades;

        return this.subtotal;}


    public Double total(){


    return this.total;}
}
