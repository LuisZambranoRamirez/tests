package proyectofinal.modelo;

/**
 *
 * @author L
 */
public class Usuario {
    
    private static Usuario instancia;

    private String nombre;
    private String correo;

    private Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // Método para inicializar el usuario por primera vez
    public static void iniciarSesion(String nombre, String correo) {
        if (instancia == null) {
            instancia = new Usuario(nombre, correo);
        }
    }

    // Obtener la instancia actual
    public static Usuario getInstancia() {
        if (instancia == null) {
            throw new IllegalStateException("El usuario aún no ha iniciado sesión.");
        }
        return instancia;
    }

    public static void cerrarSesion() {
        instancia = null;
    }

}
