import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre= null;
        int edad = 0;
        String profesion = null;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        nombre = entrada.nextLine(); // lee una linea de texto
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();// lee un numero entero
        entrada.nextLine();
        System.out.println("Ingresa tu carrera actual");
        profesion = entrada.nextLine(); // lee una linea de texto
        entrada.close();

        System.out.println("--- Datos ingresados ---");
        System.out.println("Datos: "+nombre+" Edad: "+edad+" Profesión: "+profesion);

    }
}