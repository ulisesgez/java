import java.util.Scanner;

public class AagScanner {
    public static void main(String[] args) {
        var usuarioUno = "Carlos";
        System.out.println("Hola " + usuarioUno);
        System.out.println("Bienvenido, escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuarioDos = consola.nextLine();
        System.out.println("Hola " + usuarioDos);
        System.out.println("Bienvenido, escribe tu nombre: ");
        var usuarioTres = consola.nextLine();
        System.out.println("Hola " + usuarioTres);
    }
}
