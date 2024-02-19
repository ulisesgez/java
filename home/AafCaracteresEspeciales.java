public class AafCaracteresEspeciales {

    public static void main(String[] args) {
        /*
         * Caracteres especiales:
         * Los caracteres especiales son aquellos que no se pueden escribir
         * directamente en una cadena de texto.
         * Para poder escribirlos, se debe anteponer una diagonal invertida (\)
         * antes del caracter especial.
         */
        var nombre = "Juan";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
