public class AacVariablesConstantes {
    public static void main(String[] args) {
        /*
         * Variable:
         * Espacio de memoria que se reservan para almacenar datos.
         *
         * Constante:
         * Valores que se mantienen siempre de igual manera y que no dependen
         * de una asignacion para obtener e mismo.
         */
        int edad = 20;
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Hola, " + nombreCompleto + "!");
        System.out.println("Tienes " + edad + " años.");
    }
}