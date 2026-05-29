import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        System.out.println("Datos "+nombre+" "+edad+" "+profesion);

    }
}