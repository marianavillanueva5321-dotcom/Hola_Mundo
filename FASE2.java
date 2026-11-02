import java.util.Scanner;
public class FASE2 {
static Scanner sc = new Scanner(System.in);
static String nombreCliente = "";
static String fechaCita = "";
static double subtotal = 0;
static double descuento = 0;
static double iva = 0;
static double totalPagar = 0;
static int cantidadCortes = 0;
static int cantidadShampoos = 0;
static int cantidadTintes = 0;
static int cantidadPeinados = 0;
static String cupon = "";
static int opcionPago = 0;
static String formaPago = "";

static void Calculos() {
        if (subtotal == 0) {
            System.out.println("Primero debes elegir al menos un servicio");
        } else {
            System.out.println("¿Tiene cupón? (si/no)");
            if (cupon.equalsIgnoreCase("si")) {
                descuento = 90;
            } else {
                descuento = 0;
            }

            iva = (subtotal - descuento) * 0.16;
            totalPagar = subtotal - descuento + iva;

            do {
                System.out.println("===== FORMA DE PAGO =====");
                System.out.println("1.- Tarjeta");
                System.out.println("2.- Efectivo");
                System.out.print("Seleccione forma de pago: ");
                opcionPago = sc.nextInt();

                switch (opcionPago) {
                    case 1:
                        formaPago = "Tarjeta";
                        System.out.println("Pago con tarjeta seleccionado.");
                        break;
                    case 2:
                        formaPago = "Efectivo";
                        System.out.println("Pago en efectivo seleccionado.");
                        break;
                    default:
                        System.out.println("Opción no válida, elige 1 o 2.");
                        break;
                }
            } while (opcionPago != 1 && opcionPago != 2);

            System.out.println("Pago registrado. Total a pagar: $" + totalPagar );
        }
    }