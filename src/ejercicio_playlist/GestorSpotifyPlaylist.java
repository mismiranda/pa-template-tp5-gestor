package ejercicio_playlist;

public class GestorSpotifyPlaylist {
    private Cancion[] colaReproduccion;
    private int capacidadMaxima;
    private int cantidadCanciones;

    public GestorSpotifyPlaylist(int capacidadMaxima) {
        // --- TU CÓDIGO AQUÍ ---
        // (Inicializar capacidad, arreglo y contador)
    }

    public boolean agregarACola(Cancion nueva) {
        // --- TU CÓDIGO AQUÍ ---
        // 1. Verificar que no se supere la capacidad máxima
        // 2. Validar que no exista un tema duplicado por título
        // 3. Insertar la canción e incrementar el contador
        return false;
    }

    public Cancion reproducirSiguiente() {
        // --- TU CÓDIGO AQUÍ ---
        // 1. Validar que la cola no esté vacía
        // 2. Obtener la primera canción (índice 0)
        // 3. Desplazar todos los elementos restantes a la izquierda
        // 4. Decrementar cantidadCanciones y retornar la canción
        return null;
    }

    public void mostrarSoloHitsTrending() {
        // --- TU CÓDIGO AQUÍ ---
        // Recorrer la cola e imprimir únicamente las canciones con esTrending == true
    }
}
