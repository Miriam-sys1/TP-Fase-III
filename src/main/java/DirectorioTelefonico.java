import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DirectorioTelefonico {
    private Map<String, String> contactos;

    public DirectorioTelefonico() {
        this.contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        contactos.put(nombre, telefono);
    }

    public String buscarContacto(String nombre) {
        return contactos.getOrDefault(nombre, "Contacto no encontrado");
    }

    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        Scanner scanner = new Scanner(System.in);

        // Ejemplo: Agregar contactos al directorio
        directorio.agregarContacto("Juan Pérez", "123-456-7890");
        directorio.agregarContacto("María González", "987-654-3210");

        // Ejemplo: Buscar contactos
        System.out.println("Ingrese el nombre del contacto que desea buscar:");
        String nombreBusqueda = scanner.nextLine();

        String resultadoBusqueda = directorio.buscarContacto(nombreBusqueda);
        System.out.println("Resultado de la búsqueda: " + resultadoBusqueda);
    }
}
