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
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        long variableLong = 10;
        System.out.println("variable de tipo long = " + variableLong);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        float variableFloat = 10.5f;
        System.out.println("variable de tipo float = " + variableFloat);
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        String variableString = "Hola";
        System.out.println("variable de tipo String = " + variableString);        
    }
}