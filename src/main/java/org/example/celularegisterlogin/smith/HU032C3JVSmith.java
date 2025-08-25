package org.example.celularegisterlogin.smith;

import java.util.ArrayList;
import java.util.Scanner;

public class HU032C3JVSmith {

    // Clase Usuario para almacenar nombre y rol
    static class Usuario {
        String nombre;
        String rol;

        Usuario(String nombre, String rol) {
            this.nombre = nombre;
            this.rol = rol;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista donde se guardan los usuarios registrados
        ArrayList<Usuario> usuarios = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            String nombre;
            String correo;
            String contrasena;
            String rol;

            boolean datosValidos = false;

            // === Registro de Usuario con validaciones ===
            while (!datosValidos) {
                System.out.println("\n=== Registro de Usuario ===");

                // Pedir nombre
                System.out.print("Ingresa tu nombre: ");
                nombre = scanner.nextLine();

                // Pedir correo
                System.out.print("Ingresa tu correo: ");
                correo = scanner.nextLine();

                // Pedir contraseña
                System.out.print("Ingresa tu contraseña: ");
                contrasena = scanner.nextLine();

                // Pedir rol
                System.out.print("Ingresa tu rol (Ej: Administrador, Servidor Público, Ciudadano): ");
                rol = scanner.nextLine();

                // Validaciones
                boolean nombreValido = !nombre.trim().isEmpty();
                boolean correoValido = correo.contains("@") && correo.contains(".");
                boolean contrasenaValida = contrasena.length() >= 6;
                boolean rolValido = !rol.trim().isEmpty();

                if (nombreValido && correoValido && contrasenaValida && rolValido) {
                    datosValidos = true;
                    usuarios.add(new Usuario(nombre, rol));
                    System.out.println("\n✅ Registro válido. ¡Bienvenido, " + nombre + "!");
                } else {
                    System.out.println("\n❌ Datos inválidos. Por favor inténtalo de nuevo.");
                    if (!nombreValido) {
                        System.out.println("- El nombre no puede estar vacío.");
                    }
                    if (!correoValido) {
                        System.out.println("- El correo debe tener un formato válido (ejemplo@dominio.com).");
                    }
                    if (!contrasenaValida) {
                        System.out.println("- La contraseña debe tener al menos 6 caracteres.");
                    }
                    if (!rolValido) {
                        System.out.println("- El rol no puede estar vacío.");
                    }
                }
            }

            // Preguntar si desea registrar otro usuario
            System.out.print("\n¿Quieres registrar otro usuario? (s/n): ");
            String opcion = scanner.nextLine().trim().toLowerCase();
            if (!opcion.equals("s")) {
                continuar = false;
            }
        }

        // === Mostrar lista de usuarios registrados desde consola ===
        System.out.println("\n=== Lista de usuarios registrados ===");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + ". Nombre: " + usuarios.get(i).nombre + " | Rol: " + usuarios.get(i).rol);
        }

        scanner.close();
    }
}
