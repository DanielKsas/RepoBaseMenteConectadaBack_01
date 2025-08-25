package org.example.celularegisterlogin.smith;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HU024C3JVSmith {

    private Map<String, String> especialista;

    public HU024C3JVSmith() {
        especialista = new HashMap<>();
    }

    public void pedirDatosIniciales() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        especialista.put("nombre", nombre);

        System.out.print("Ingrese su correo: ");
        String correo = scanner.nextLine();
        especialista.put("correo", correo);

        System.out.print("Ingrese su especialidad: ");
        String especialidad = scanner.nextLine();
        especialista.put("especialidad", especialidad);
    }

    public void imprimirDatos() {
        System.out.println("\nDatos del especialista:");
        for (Map.Entry<String, String> entry : especialista.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void modificarEspecialidad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese la nueva especialidad: ");
        String nuevaEspecialidad = scanner.nextLine();
        especialista.put("especialidad", nuevaEspecialidad);
        System.out.println("Especialidad modificada con éxito.");
    }

    public void ejecutarFlujo() {
        pedirDatosIniciales();
        imprimirDatos();
        modificarEspecialidad();
        imprimirDatos();
    }

    public static void main(String[] args) {
        HU024C3JVSmith flujo = new HU024C3JVSmith();
        flujo.ejecutarFlujo();
    }
}
