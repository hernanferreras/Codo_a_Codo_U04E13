package u04e13;

import java.util.Scanner;
public class U04E13 {

    public static void main(String[] args) {
       int mes;
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese el numero de mes: ");
       mes = entrada.nextInt();
       switch (mes){
            case 1:
               System.out.print("ENERO"); break;
            case 2:
               System.out.print("FEBRERO"); break;
            case 3:
               System.out.print("MARZO"); break;
            case 4:
               System.out.print("ABRIL"); break;
            case 5:
               System.out.print("MAYO"); break;
            case 6:
               System.out.print("JUNIO"); break;
            case 7:
               System.out.print("JULIO"); break;
            case 8:
               System.out.print("AGOSTO"); break;
            case 9:
               System.out.print("SEPTIEMBRE"); break;
            case 10:
               System.out.print("OCTUBRE"); break;
            case 11:
               System.out.print("NOVIEMBRE"); break;
            case 12:
               System.out.print("DICIEMBRE"); break;
               default:
               System.out.print("El nro. ingresado no corresponde a un mes");
       }
    }
}