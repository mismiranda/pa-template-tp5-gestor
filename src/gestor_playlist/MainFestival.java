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
            System.out.println("   ■ MENÚ DJ FESTIVAL STREAMING");
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
                    String titulo = scanner.nextLine();
                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();
                    System.out.print("Duración en segundos: ");
                    int duracion = scanner.nextInt();
                    System.out.print("¿Es tendencia/viral? (true/false): ");
                    boolean esTrending = scanner.nextBoolean();
                    scanner.nextLine();
                    djSession.agregarACola(new Cancion(titulo, artista, duracion, esTrending));
                    break;
                case 2:
                    djSession.reproducirSiguiente();
                    break;
                case 3:
                    djSession.mostrarSoloHitsTrending();
                    break;
                case 4:
                    System.out.println("■ ¡Sesión de DJ finalizada!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}
