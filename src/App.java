import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("\n--- EXPLORA COLOMBIA ---");
            System.out.println("1. Buscar actividades");
            System.out.println("2. Ingresar como administrador");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> buscarActividades();
                case "2" -> ingresarAdmin();
                case "3" -> {
                    System.out.println("Gracias por usar la aplicación.");
                    ejecutando = false;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void buscarActividades() {
        System.out.println("\n--- BUSCAR ACTIVIDADES ---");

        String[] ciudades = {
                "Todas", "Bogotá", "Medellín", "Cali", "Barranquilla", "Cartagena",
                "Santa Marta", "Villa de Leyva", "Salento", "Leticia", "Pasto",
                "Popayán", "Tunja", "Bucaramanga", "Cúcuta", "Montería", "Sincelejo"
        };

        System.out.println("Seleccione una ciudad:");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println((i + 1) + ". " + ciudades[i]);
        }
        System.out.print("Opción: ");
        int opcionCiudad = Integer.parseInt(scanner.nextLine());
        String ciudad = opcionCiudad == 1 ? "" : ciudades[opcionCiudad - 1];

        String[] tipos = {
                "Todos", "Naturaleza", "Historia", "Espiritualidad", "Cultura",
                "Aventura", "Gastronomía", "Ciencia"
        };

        System.out.println("Seleccione el tipo de actividad:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + ". " + tipos[i]);
        }
        System.out.print("Opción: ");
        int opcionTipo = Integer.parseInt(scanner.nextLine());
        String tipo = opcionTipo == 1 ? "" : tipos[opcionTipo - 1];

        List<Actividad> resultados = BaseDatos.filtrar(ciudad, tipo);

        if (resultados.isEmpty()) {
            System.out.println("No se encontraron actividades.");
        } else {
            System.out.println("\nActividades encontradas:\n");

            System.out.printf("%-20s %-40s %-20s\n",
                    Colores.AZUL + "Ciudad",
                    "Lugar",
                    "Tipo" + Colores.RESET);
            System.out.println("=".repeat(80));

            for (Actividad act : resultados) {
                String colorTipo = obtenerColorTipo(act.getTipo());
                System.out.printf("%-20s %-40s %-20s\n",
                        Colores.ROJO + act.getCiudad() + Colores.RESET,
                        act.getNombre(),
                        colorTipo + act.getTipo() + Colores.RESET);
            }
        }
    }

    private static String obtenerColorTipo(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "naturaleza" -> Colores.VERDE;
            case "historia" -> Colores.AMARILLO;
            case "espiritualidad" -> Colores.MORADO;
            case "cultura" -> Colores.CIAN;
            case "aventura" -> Colores.AZUL;
            case "gastronomía" -> Colores.ROJO;
            case "ciencia" -> Colores.BLANCO;
            default -> Colores.RESET;
        };
    }

    private static void ingresarAdmin() {
        System.out.print("\nIngrese la contraseña de administrador: ");
        String contraseña = scanner.nextLine();

        if ("admin123".equals(contraseña)) {
            System.out.println("Acceso concedido.");
            agregarActividad();
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }

    private static void agregarActividad() {
        System.out.println("\n--- AGREGAR NUEVA ACTIVIDAD ---");
        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine().trim();

        System.out.print("Nombre del lugar: ");
        String nombre = scanner.nextLine().trim();

        System.out.print("Tipo de actividad (Naturaleza, Historia, Espiritualidad, Cultura, Aventura, Gastronomía, Ciencia): ");
        String tipo = scanner.nextLine().trim();

        BaseDatos.agregarActividad(new Actividad(ciudad, nombre, tipo));
        System.out.println("Actividad agregada exitosamente.");
    }
}