// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Producto coca = new Producto(2,147852,200,"Coca-cola","Coca-cola");
        System.out.println("Prodcutos: \n" +
                "1. Pantalla \n" +
                "2. Mouse\n" +
                "3. Memorias\n" +
                "4. Celular\n" +
                "5. Laptop\n");
        System.out.println(coca.toString());
    }
}