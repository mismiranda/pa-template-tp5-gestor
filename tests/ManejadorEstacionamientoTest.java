package gestion_estacionamiento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManejadorEstacionamientoTest {

    private ManejadorEstacionamiento estacionamiento;
    private Vehiculo v1;
    private Vehiculo v2;

    @BeforeEach
    public void setUp() {
        // Inicializamos un estacionamiento con capacidad para 3 vehículos
        estacionamiento = new ManejadorEstacionamiento(3);
        v1 = new Vehiculo("AA123BB");
        v2 = new Vehiculo("CC456DD");
    }

    @Test
    public void testRegistrarEntradaExitoso() {
        boolean entradaRegistrada = estacionamiento.registrarEntrada(v1);
        assertTrue(entradaRegistrada, "El vehículo debería registrarse exitosamente.");
        assertEquals(1, estacionamiento.getCantidadActual(), "La cantidad actual debe ser 1.");
    }

    @Test
    public void testRegistrarEntradaCapacidadLlena() {
        estacionamiento.registrarEntrada(v1);
        estacionamiento.registrarEntrada(v2);
        estacionamiento.registrarEntrada(new Vehiculo("EE789FF"));

        // Intentar ingresar un cuarto vehículo superando la capacidad de 3
        boolean entradaSuperada = estacionamiento.registrarEntrada(new Vehiculo("GG000HH"));
        assertFalse(entradaSuperada, "No debería permitir ingresar vehículos cuando el estacionamiento está lleno.");
        assertEquals(3, estacionamiento.getCantidadActual(), "La cantidad actual no debe superar la capacidad máxima de 3.");
    }

    @Test
    public void testRegistrarSalidaExitoso() {
        estacionamiento.registrarEntrada(v1);
        estacionamiento.registrarEntrada(v2);

        boolean salidaRegistrada = estacionamiento.registrarSalida("AA123BB");
        assertTrue(salidaRegistrada, "Debería registrar la salida del vehículo existente.");
        assertEquals(1, estacionamiento.getCantidadActual(), "La cantidad de vehículos debe decrementarse a 1.");
    }

    @Test
    public void testRegistrarSalidaVehiculoInexistente() {
        estacionamiento.registrarEntrada(v1);

        boolean salidaInexistente = estacionamiento.registrarSalida("ZZ999ZZ");
        assertFalse(salidaInexistente, "No debería registrar salida de una patente que no está en el estacionamiento.");
        assertEquals(1, estacionamiento.getCantidadActual(), "La cantidad de vehículos debe mantenerse sin cambios.");
    }

    @Test
    public void testGetPatenteVehiculo() {
        assertEquals("AA123BB", v1.getPatente(), "El método getPatente debe retornar la patente asignada.");
    }
}
