package org.example.celularegisterlogin;

public class HU023C3JVJacobo {
    public static void main(String[] args) {

// Datos registrados (simulados): deben estar en el scope de la clase
        private static final String EMAIL_REGISTRADO    = "usuario@ejemplo.com";
        private static final String PASSWORD_REGISTRADA = "miContraseña123";

        // Solicitar correo
        System.out.print("Correo: ");
        String email = scanner.nextLine().trim();

        // Solicitar contraseña
        System.out.print("Contraseña: ");
        String password = scanner.nextLine().trim();

        // Debug opcional (comentan estas líneas si ya funciona)
        System.out.println("DEBUG -> ingresado: [" + email + "] / registrado: [" + EMAIL_REGISTRADO + "]");
        System.out.println("DEBUG -> ingresado: [" + password + "] / registrado: [" + PASSWORD_REGISTRADA + "]");

        // Validar credenciales
        if (validarCredenciales(email, password)) {
            System.out.println("✔️ Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            System.out.println("❌ Error: correo o contraseña incorrectos.");
        }

        scanner.close();
    }

    private static boolean validarCredenciales(String email, String password) {
        // Validación exacta
        return EMAIL_REGISTRADO.equals(email) && PASSWORD_REGISTRADA.equals(password);
    }
}

