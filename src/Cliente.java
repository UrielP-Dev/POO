import java.util.Date;

public class Cliente {
    private int Documento, movil;
    private Date fecha;
    private String nombre, apellido1, apellido2, email, direccion;

    public Cliente(int documento, int movil, Date fecha, String nombre, String apellido1, String apellido2, String email, String direccion) {
        Documento = documento;
        this.movil = movil;
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Documento=" + Documento +
                ", movil=" + movil +
                ", fecha=" + fecha +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
