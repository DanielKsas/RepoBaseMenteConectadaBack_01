package org.example.celularegisterlogin.smith;

public class HU025C3JVSmith {

    // Clase Usuario para guardar nombre y rol
    static class Usuario {
        String nombre;
        String rol;

        Usuario(String nombre, String rol) {
            this.nombre = nombre;
            this.rol = rol;
        }
    }

    public static void main(String[] args) {
        // Lista simulada de usuarios registrados
        Usuario[] usuarios = {
                new Usuario("Ana Pérez", "Administrador"),
                new Usuario("Carlos López", "Servidor Público"),
                new Usuario("María Gómez", "Ciudadano"),
                new Usuario("Juan Torres", "Servidor Público")
        };

        System.out.println("=== Lista de usuarios registrados ===");

        // Recorremos el arreglo con un ciclo for
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println((i + 1) + ". Nombre: " + usuarios[i].nombre + " | Rol: " + usuarios[i].rol);
        }
    }
}
