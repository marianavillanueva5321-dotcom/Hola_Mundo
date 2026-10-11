import java.util.Scanner;             
public class Calculadora {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el primer número: ");
    double num1 = sc.nextDouble();
    System.out.print( "Ingresa el segundo número: ");
    double num2 = sc.nextDouble();


    sc.nextLine();

    System.out.print("Ingresa la operación (+, -, *, /): ");
    String operacion = sc.nextLine();
    double resultado;

    switch (operacion) {
        case "+": resultado = num1 + num2; break;
  
        case "-":  resultado = num1 - num2;
            break;
        case "*": resultado = num1 * num2; break;

        case "/": resultado = num1 / num2; break;

        default: resultado = 0; break;
        
    }
   
    System.out.println("El resultado es: " + resultado);

    sc.close();

    }

}




