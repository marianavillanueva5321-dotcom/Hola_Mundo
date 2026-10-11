import java.util.Scanner;
public class CalificacionFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cual es tu nombre? ");
        String nombre = scanner.nextLine();
        System.out.print("Cual es tu Cal1? ");
        double cal1 = scanner.nextDouble();
        System.out.print("Cual es tu Cal2? ");
        double cal2 = scanner.nextDouble();
        double promedio = (cal1 + cal2) / 2;
        System.out.println("Tu nombre es: " + nombre + " y tu promedio es: " + promedio);
        scanner.close();
    }
       
       
    }

