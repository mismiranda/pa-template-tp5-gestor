# UNPA - UARG (2026)
## Asignatura: Programación de Algoritmos
### Trabajo Práctico Nº 5 - Tema: Gestor

---

### **Ejercicio 1: Gestor de Estacionamiento**
Crea un gestor de estacionamiento que administre la entrada y salida de vehículos. El objetivo es simular cómo se gestiona la ocupación de espacios en un estacionamiento.

- **Clase principal:** Crea una clase `ManejadorEstacionamiento` que tenga una capacidad máxima de vehículos.
- **Operaciones:** Definir métodos para registrar la entrada y registrar la salida de vehículos.
- **Validaciones:** Asegurarse de que no se permita la entrada de más vehículos si el estacionamiento está lleno y que no se pueda registrar una salida si el estacionamiento está vacío.

---

### **Ejercicio 2: Gestor de Biblioteca**
Crea un gestor de biblioteca que se encargue de administrar la prestación y devolución de libros.

- **Clase principal:** Implementa una clase `GestorLibreria` que contenga un listado de libros.
- **Operaciones:** Define métodos para prestar y devolver libros, asegurando que no se pueda prestar un libro que ya ha sido prestado.
- **Listado:** Implementa un método que liste los libros disponibles.


# Ejercicio 3: Gestor de Playlist en Streaming (`GestorSpotifyPlaylist`)

## Enunciado
Se requiere desarrollar un sistema para gestionar la cola de reproducción colaborativa de un DJ en un festival usando la arquitectura del **Patrón Gestor**. 

### Requerimientos:
1. **Clase de dominio `Cancion`**:
   - Atributos: `titulo` (String), `artista` (String), `duracionSegundos` (int), `esTrending` (boolean).
   - Métodos: Constructor, getters y un método `toString()`.

2. **Clase gestora `GestorSpotifyPlaylist`**:
   - Atributos: `colaReproduccion` (arreglo de `Cancion`), `capacidadMaxima` (int), `cantidadCanciones` (int).
   - Métodos:
     - `agregarACola(Cancion nueva)`: Añade una canción si hay espacio y si no está duplicada por título.
     - `reproducirSiguiente()`: Devuelve y desencola la primera canción del arreglo, desplazando los elementos restantes a la izquierda.
     - `mostrarSoloHitsTrending()`: Muestra en consola únicamente las canciones que tienen `esTrending == true`.
