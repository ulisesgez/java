public class AacDataTypes {
    public static void main(String[] args) {
        /*
        Data types:
        Primitivos:
            byte: 8 bits
            short: 16 bits
            int: 32 bits
            long: 64 bits
            float: 32 bits
            double: 64 bits
            char: 16 bits
            boolean: 1 bit
        Referencia(Tipo Objeto):
            Clases
            Interfaces
            Arreglos
         */
        int edad = 20;
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Hola, " + nombreCompleto + "!");
        System.out.println("Tienes " + edad + " años.");
    }
}
