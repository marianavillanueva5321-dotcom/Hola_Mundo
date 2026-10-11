import java.util.Scanner;             
public class CapturaYProcesamientoDeDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                            
        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();                    

        System.out.print("Minutos de estudio: ");
        int minutosEstudiados = sc.nextInt();                  

        int horas = minutosEstudiados/60;                 
        int sobrantes = minutosEstudiados % 60;              
        double horasExactas = minutosEstudiados / 60.00;         

        System.out.println("Tiempo de estudio de " + nombre);
        System.out.println(horas + " horas y " + sobrantes + " minutos");   
        System.out.println("En horas: " + horasExactas);

        sc.close();
    }
}