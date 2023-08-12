// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp=0,cm=0,cmm=0,cc=0,cl=0;
        double tv = 0;
        boolean flag= true;
        double st = 0;
        Producto pantalla = new Producto(250, 147852, 150, "Samsung", "Pantalla 32");
        Producto mouse = new Producto(30, 258963, 300, "Logitech", "Mouse G203");
        Producto memoria = new Producto(80, 369852, 100, "Samsung", "Memoria 32GB");
        Producto celular = new Producto(180, 456789, 50, "Xiaomi", "Redmi Note 9");
        Producto laptop = new Producto(800, 987654, 30, "Acer", "Nitro 5");
        Venta venta = new Venta();


        System.out.print("Ingrese número de documento: ");
        int documento = sc.nextInt();

        System.out.print("Ingrese número de teléfono móvil: ");
        int movil = sc.nextInt();

        // Aquí puedes utilizar clases como SimpleDateFormat para manejar la fecha
        // Por simplicidad, aquí asumiré que 'fecha' es de tipo Date
        Date fecha = new Date();

        sc.nextLine(); // Limpia el buffer después de leer enteros

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese primer apellido: ");
        String apellido1 = sc.nextLine();

        System.out.print("Ingrese segundo apellido: ");
        String apellido2 = sc.nextLine();

        System.out.print("Ingrese correo electrónico: ");
        String email = sc.nextLine();

        System.out.print("Ingrese dirección: ");
        String direccion = sc.nextLine();

        Cliente nuevoCliente = new Cliente(documento, movil, fecha, nombre, apellido1, apellido2, email, direccion);
        while (flag==true) {


            System.out.println("1. Comprar \n" +
                    "2. Terminar compra \n" +
                    "3.Salir ");
            int op = sc.nextInt();



            switch (op){
                case 1:
                    System.out.println("Productos: \n" +
                            "1. Pantalla \n" +
                            "2. Mouse\n" +
                            "3. Memorias\n" +
                            "4. Celular\n" +
                            "5. Laptop\n");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1:

                            if (venta.stock(pantalla.getStock(), cp)){

                                System.out.println(pantalla.toString());
                                System.out.println("Cantidad?");
                                int cantidad = sc.nextInt();
                                cp = cantidad;
                                pantalla.stock -= cp;
                                st = venta.subtotal(pantalla.getPrecio(), cp);
                                System.out.println("Subtotal pantalla: "+st);
                                tv = st;

                            }else {
                                System.out.println("Pantallas agotadas");
                            }

                            break;

                        case 2:

                            if (venta.stock(mouse.getStock(),cm)){

                                System.out.println(mouse.toString());
                                System.out.println("Cantidad?");
                                cm = sc.nextInt();


                                mouse.stock -= cm;
                                st = venta.subtotal(mouse.getPrecio(), cm);
                                System.out.println("Subtotal mouse: "+st);
                                tv = st;

                            }else {
                                System.out.println("mouses agotados");
                            }
                            break;
                        case 3:
                            if (venta.stock(memoria.getStock(),cmm)){

                                System.out.println(memoria.toString());
                                System.out.println("Cantidad?");
                                cmm = sc.nextInt();
                                memoria.stock -= cmm;
                                st = venta.subtotal(memoria.getPrecio(), cmm);
                                System.out.println("Subtotal memoria: "+st);
                                tv = st;
                            } else {
                                System.out.println("memorias agotadas");
                            }

                            break;
                        case 4:
                            if (venta.stock(celular.getStock(),cc)){

                                System.out.println(celular.toString());
                                System.out.println("Cantidad?");
                                cc = sc.nextInt();
                                celular.stock -= cc;
                                st = venta.subtotal(celular.getPrecio(), cc);
                                System.out.println("Subtotal celular: "+st);
                                tv = st;

                            } else {
                                System.out.println("celulares agotados");
                            }

                            break;
                        case 5:

                            if (venta.stock(laptop.getStock(),cl)){

                                System.out.println(laptop.toString());
                                System.out.println("Cantidad?");
                                cl = sc.nextInt();
                                laptop.stock -= cl;
                                st = venta.subtotal(laptop.getPrecio(), cl);
                                System.out.println("Subtotal laptop: "+st);
                                tv = st;

                            } else {
                                System.out.println("laptop agotadas");
                            }

                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, elige una opción válida.");
                            break;
                    }



                    break;
                case  2:
                    System.out.println("----------Factura--------");
                    System.out.println(nuevoCliente.toString());
                    System.out.println("Subtotal: "+ tv);
                    System.out.println("El total es: "+ venta.total(tv));
                case 3:
                    flag= false;
            }

        }
    }
}