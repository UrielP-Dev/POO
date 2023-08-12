public class Venta {

    private double precio, total, subtotal=0;
    private int unidades;


    public Venta() {

    }
    public double subtotal(double precio, int unidades){


        this.subtotal += precio*unidades;

        return this.subtotal;}


    public double total(double total){
       total = total +(total*.16);


    return total;}

    public boolean stock(int stock, int cantidad){
        cantidad = stock - cantidad;
        if (stock == 0){
            return false;}

    return true;}
}
