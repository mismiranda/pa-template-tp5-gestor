package gestion_estacionamiento;

public class ManejadorEstacionamiento {
    private Vehiculo[] vehiculos;
    private int capacidadMaxima;
    private int cantidadActual;

    public ManejadorEstacionamiento(int capacidadMaxima) {
        // --- TU CÓDIGO AQUÍ ---
        // (Inicializar capacidad, arreglo y contador)
    }

    public boolean registrarEntrada(Vehiculo vehiculo) {
        // --- TU CÓDIGO AQUÍ ---
        // 1. Validar que no superó la capacidad máxima
        // 2. Agregar el vehículo al arreglo
        // 3. Incrementar el contador de vehículos
        return false;
    }

    public boolean registrarSalida(String patente) {
        // --- TU CÓDIGO AQUÍ ---
        // 1. Validar que el estacionamiento no esté vacío
        // 2. Buscar la posición de la patente dada
        // 3. Desplazar los elementos a la izquierda para no dejar huecos
        // 4. Decrementar la cantidad actual
        return false;
    }

    public int getCantidadActual() {
        // --- TU CÓDIGO AQUÍ ---
        return 0;
    }

    public int getCapacidadMaxima() {
        // --- TU CÓDIGO AQUÍ ---
        return 0;
    }
}
