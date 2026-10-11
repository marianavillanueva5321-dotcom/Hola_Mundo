import java.util.Scanner;             
public class EjercicioDeRepasoIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribir el DNI de la persona: ");
        int dni = sc.nextInt();
        System.out.print("Ingrese el tipo de servicio: ");
        String tipoServ = sc.next();
        Double Total = 0.0;

            if (tipoServ.equals("1")) {
                Total = 750 - (750 * 0.10);
            } else if (tipoServ.equals("2")) {
                Total = 930 - (930 * 0.05);
            } else if (tipoServ.equals("3")) {
                Total = 1200.00;
            }
        System.out.println(" El total de la factura del cliente" + dni + "es de" + Total);
  
        }
    }    