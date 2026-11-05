package ejercicio_playlist;

import java.util.Scanner;

public class MainFestival {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad de la cola de reproducción del DJ: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine();

        GestorSpotifyPlaylist djSession = new GestorSpotifyPlaylist(capacidad);
        int opcion = 0;

        do {
            System.out.println("\n==========================================");
            System.out.println("   MENÚ DJ FESTIVAL STREAMING");
            System.out.println("==========================================");
            System.out.println("1. Agregar canción a la cola");
            System.out.println("2. Reproducir siguiente tema");
            System.out.println("3. Ver canciones Trending en la cola");
            System.out.println("4. Salir de la sesión");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título del tema: ");
                   // --- TU CÓDIGO AQUÍ ---
                    System.out.print("Artista: ");
                    // --- TU CÓDIGO AQUÍ ---
                    System.out.print("Duración en segundos: ");
                    // --- TU CÓDIGO AQUÍ ---
                    System.out.print("¿Es tendencia/viral? (true/false): ");
                   // --- TU CÓDIGO AQUÍ ---                   
                    break;
                case 2:
                    // --- TU CÓDIGO AQUÍ ---
                    break;
                case 3:
                    // --- TU CÓDIGO AQUÍ ---
                    break;
                case 4:
                    System.out.println(" ¡Sesión de DJ finalizada!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}
