    import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double vueltas = 0.5;

        System.out.print("Dame tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Vueltas: ");
        int Vueltas = scanner.nextInt();
        System.out.print("minutos: ");
        double minutos = scanner.nextDouble();
        double Distancia = Vueltas * minutos;
        double ritmo = minutos / Distancia;
        boolean llegoA5 = Distancia >= 5;
        boolean tiempo = ritmo < 6;
        System.out.println("Tu nombre es: " + nombre + " y corriste " + Distancia);
        System.out.println("Ritmo" + ritmo );
        System.out.println("Llego a 5km: " + llegoA5);
        System.out.println("Bajo a 6 min:" + tiempo);

    }
}
  
