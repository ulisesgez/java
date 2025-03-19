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
        String name = "Ulises";
        int age = 26;
        long id = 1000000000008L;
        double averageGrade = 8.5;
        boolean isEnrolled = true;
        char gradeLevel = 'A';
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Grade Level: " + gradeLevel);
        /*
        String no es considerado un tipo de dato primitivo si no que es una clase.
         */
    }
}