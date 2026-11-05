package gestion_estacionamiento;

import java.util.Scanner;

public class MainEstacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad máxima del estacionamiento: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine();

        ManejadorEstacionamiento estacionamiento = new ManejadorEstacionamiento(capacidad);
        int opcion = 0;

        do {
            System.out.println("\n==========================================");
            System.out.println("   ■ MENÚ GESTIÓN DE ESTACIONAMIENTO");
            System.out.println("==========================================");
            System.out.println("1. Registrar entrada de vehículo");
            System.out.println("2. Registrar salida de vehículo");
            System.out.println("3. Ver cantidad de vehículos estacionados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la patente del vehículo: ");
                    String patenteEntrada = scanner.nextLine();
                    boolean ingresoOk = estacionamiento.registrarEntrada(new Vehiculo(patenteEntrada));
                    if (ingresoOk) {
                        System.out.println("✔ Vehículo registrado correctamente.");
                    } else {
                        System.out.println("❌ No se pudo registrar (Estacionamiento lleno).");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la patente a retirar: ");
                    String patenteSalida = scanner.nextLine();
                    boolean salidaOk = estacionamiento.registrarSalida(patenteSalida);
                    if (salidaOk) {
                        System.out.println("✔ Vehículo retirado con éxito.");
                    } else {
                        System.out.println("❌ No se encontró el vehículo o el estacionamiento está vacío.");
                    }
                    break;
                case 3:
                    System.out.println("Vehículos actuales: " + estacionamiento.getCantidadActual() + " / " + estacionamiento.getCapacidadMaxima());
                    break;
                case 4:
                    System.out.println("■ Sistema de estacionamiento finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
