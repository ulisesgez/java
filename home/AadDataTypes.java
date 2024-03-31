public class AadDataTypes {
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
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        short variableShort = 10;
        System.out.println("variable de tipo short = " + variableShort);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        int variableInt = 10;
        System.out.println("variable de tipo entero = " + variableInt);
        String variableString = "Hola";
        System.out.println("variable de tipo String = " + variableString);
    }
}