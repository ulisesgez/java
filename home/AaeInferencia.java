public class AaeInferencia {

    public static void main(String[] args) {
        /*
         * Inferencia de tipos:
         * La inferencia de tipos es una característica que se introdujo en Java 10.
         * Esta característica permite que el compilador infiera el tipo de dato de una
         * variable.
         */
        var nombre = "Juan";
        var apellido = "Perez";
        var edad = 10;
        System.out.println(nombre + " " + apellido + " " + edad);
        var variableByte = 10;
        System.out.println("variable de tipo byte = " + variableByte);
        var variableShort = 10;
        System.out.println("variable de tipo short = " + variableShort);
        var variableInt = 10;
        System.out.println("variable de tipo entero = " + variableInt);
        var variableLong = 10;
        System.out.println("variable de tipo long = " + variableLong);
        var variableFloat = 10.5f;
        System.out.println("variable de tipo float = " + variableFloat);
        var variableDouble = 10.5;
        System.out.println("variable de tipo double = " + variableDouble);
        var variableString = "Hola";
        System.out.println("variable de tipo String = " + variableString);
        var variableChar = '\u0041';
        System.out.println("variable de tipo char = " + variableChar);
    }
}