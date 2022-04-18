import java.io.PrintStream;
import java.util.Scanner;

/**
 * calculadora_v2
 */
public class calculadora_v2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion_menu = 0;
        System.out.println("                ___   _   _    ___ _   _ _      _   ___   ___  ___    _     ___ ___  ___   __               ");
        System.out.println("       / __| /_\\ | |  / __| | | | |    /_\\ |   \\ / _ \\| _ \\  /_\\   | _ \\ _ \\/ _ \\  \\ \\ / /_  )   ");
        System.out.println("      | (__ / _ \\| |_| (__| |_| | |__ / _ \\| |) | (_) |   / / _ \\  |  _/   / (_) |  \\ V / / /           ");
        System.out.println("       \\___/_/ \\_\\____\\___|\\___/|____/_/ \\_\\___/ \\___/|_|_\\/_/ \\_\\ |_| |_|_\\\\___/    \\_/ /___|");
        System.out.println("*******************************************************************************************************");
        System.out.println("*******************************************************************************************************");
        System.out.println("**                                                                                                   **");
        System.out.println("**                         1. Calcule el signo del zodiaco de una persona.                           **");
        System.out.println("**                         2. Calcule la cantidad de dias vividos por una personas.                  **");
        System.out.println("**                         3. Calcular la edad de una persona en años de perro.                     **");
        System.out.println("**                         4. Calcular el numero según la numerologia.                              **");
        System.out.println("**                         5. Hacer una donacion a los Creadores.                                    **");
        System.out.println("**                                                                                                   **");
        System.out.println("*******************************************************************************************************");
        System.out.println("*******************************************************************************************************");
        System.out.println("");
        System.out.println("Ingresa el valor de tu opcion: ");
        opcion_menu = sc.nextInt();

        switch (opcion_menu) {
            case 1:
            
            int fecha_zodiaco[] = new int [2]; 

            System.out.println("*******************************************************************************************************");
            System.out.println("**                Muy bien, Seleccionaste Calcule el signo del zodiaco de una persona.               **");
            System.out.println("*******************************************************************************************************");
            System.out.println("*******************************************************************************************************");
            System.out.println("**                       Ahora ingresa el mes de tu nacimiento                                       **");
            System.out.println("*******************************************************************************************************");
            fecha_zodiaco[0] = sc.nextInt();

            System.out.println("*******************************************************************************************************");
            System.out.println("**                         Ahora ingresa el dia de tu nacimiento                                     **");
            System.out.println("*******************************************************************************************************");
            fecha_zodiaco[1] = sc.nextInt();

            if (fecha_zodiaco[0] >= 1 && fecha_zodiaco[0] <= 2 && fecha_zodiaco[1] >= 21 && fecha_zodiaco[1] <= 19) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Acuario                                          **");
                System.out.println("*******************************************************************************************************");
                }
            } else if (fecha_zodiaco[0] >= 1 && fecha_zodiaco[0] <= 2 && fecha_zodiaco[1] >= 21 && fecha_zodiaco[1] <= 19){
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Piscis                                          **");
                System.out.println("*******************************************************************************************************");
            }

                break;
            case 2:
                
                break;
            
            case 3:
                
                break;
            
            case 4:
                
                break;
            
            case 5:
                
                break;

            default:
                break;
        }

    }
}