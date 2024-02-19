public class AaeConcatenacion {
    public static void main(String[] args) {
        /*
         * Concatenación:
         * La concatenación es la unión de dos o más cadenas de texto.
         */
        var nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Hola, " + nombreCompleto + "!");

        var edad = 10;
        var adulto = 18;
        var faltantes = adulto - edad;

        //Evalua de izquierda a derecha:
        System.out.println(faltantes + edad + nombre);// 18Juan
        System.out.println(nombre + faltantes + edad);// Juan810
        System.out.println(nombre + (faltantes + edad));// Juan18
    }
}