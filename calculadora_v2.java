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
            
            int dia = 0; 
            int mes = 0;
            System.out.println("*******************************************************************************************************");
            System.out.println("**                Muy bien, Seleccionaste Calcule el signo del zodiaco de una persona.               **");
            System.out.println("*******************************************************************************************************");
            System.out.println("*******************************************************************************************************");
            System.out.println("**                       Ahora ingresa el mes de tu nacimiento                                       **");
            System.out.println("*******************************************************************************************************");
            mes = sc.nextInt();

            System.out.println("*******************************************************************************************************");
            System.out.println("**                         Ahora ingresa el dia de tu nacimiento                                     **");
            System.out.println("*******************************************************************************************************");
            dia = sc.nextInt();

            if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Acuario                                          **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Piscis                                          **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Aries                                            **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Taurus                                           **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Gemini                                           **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Cancer                                           **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Leo                                              **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Virgo                                            **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Libra                                          **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Escorpio                                         **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Tu Signo Zodiacal es Sagitario                                        **");
                System.out.println("*******************************************************************************************************");
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                           Tu Signo Zodiacal es Capricornio                                        **");
                System.out.println("*******************************************************************************************************");
            } else {
                System.out.println("*******************************************************************************************************");
                System.out.println("**                               Valores incorrectos :\\                                             **"); 
                System.out.println("*******************************************************************************************************");                
            }
                break;
            default:
                System.out.println("datos incorrectos");
                break;
        }

    }
}