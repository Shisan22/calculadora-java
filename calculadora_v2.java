import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculadora_v2
 */
public class Calculadora_v2 {

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
        System.out.println("**                         1. Calcular el signo del zodiaco de una persona.                          **");
        System.out.println("**                         2. Calcular la cantidad de dias vividos por una personas.                 **");
        System.out.println("**                         3. Calcular la edad de una persona en edad  de perro.                     **");
        System.out.println("**                         4. Calcular el numero segun la numerologia.                               **");
        System.out.println("**                         5. Autores (Admins supremos)                                              **");
        System.out.println("**                                                                                                   **");
        System.out.println("*******************************************************************************************************");
        System.out.println("*******************************************************************************************************");
        System.out.println("");
        System.out.println("*******************************************************************************************************");
        System.out.print("**                                     Ingresa el valor de tu opcion: ");
        opcion_menu = sc.nextInt();
        System.out.println("*******************************************************************************************************");

        switch (opcion_menu) {
            case 1:
            
            int dia = 0; 
            int mes = 0;
            
            System.out.println("*******************************************************************************************************");
            System.out.println("**                Muy bien, Seleccionaste Calcular el signo del zodiaco de una persona.              **");
            System.out.println("*******************************************************************************************************");
            System.out.println("*******************************************************************************************************");
            System.out.println("**                       Ahora ingresa el mes de tu nacimiento                                       **");
            mes = sc.nextInt();            
            System.out.println("*******************************************************************************************************");


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


            case 2:
                
                int edad = 0 , meses = 0 , dias = 0 , horas = 0;

                System.out.println("*******************************************************************************************************");
                System.out.println("**          Muy bien, Seleccionaste Calcular la cantidad de dias vividos por una personas.           **");
                System.out.println("*******************************************************************************************************");
                System.out.println("*******************************************************************************************************");
                System.out.print("**                                      Ahora ingresa tu edad: ");
                edad = sc.nextInt();
                System.out.println("*******************************************************************************************************");
                
                meses = edad * 12;
                dias = edad * 365;
                horas = dias * 24;
                
                System.out.println("*******************************************************************************************************");
                System.out.println("**                                Has vivido aproximadamente " + meses + " meses                               **");
                System.out.println("*******************************************************************************************************");
                System.out.println("*******************************************************************************************************");
                System.out.println("**                              Has vivido aproximadamente " + dias + " dias                                **");
                System.out.println("*******************************************************************************************************");
                System.out.println("*******************************************************************************************************");
                System.out.println("**                             Has vivido aproximadamente " + horas + " horas                               **");
                System.out.println("*******************************************************************************************************");

                break;


            case 3: 
                
                double edad_perro_in = 0;
                double edad_perro_out = 0;
                DecimalFormat formato = new DecimalFormat("#.##");

                System.out.println("*******************************************************************************************************");
                System.out.println("**           Muy bien, Seleccionaste Calcular la edad de una persona en edad de perro.               **");
                System.out.println("*******************************************************************************************************");
                System.out.println("*******************************************************************************************************");
                System.out.print("**                                    Ahora ingresa tu edad: ");
                edad_perro_in = sc.nextDouble();
                System.out.println("*******************************************************************************************************");

                edad_perro_out = edad_perro_in / 7;
                // en la siguiente linea se usa una secuencia de escape para oder imprimir la letra ñ
                System.out.println("*******************************************************************************************************");
                System.out.println("**                Tu edad en a\u00f1os de perro es aproximandamente " + formato.format(edad_perro_out) + " a\u00f1os de perro                  **");
                System.out.println("*******************************************************************************************************");
            break;



            case 4:
                
                Scanner in = new Scanner(System.in);
                int NumUno = 0, NumDos = 0, Resultado = 0, SumaDigitos = 0;
                System.out.println("*******************************************************************************************************");
                System.out.println("**           Muy bien, Seleccionaste Calcular el numero segun la numerologia.                        **");
                System.out.println("*******************************************************************************************************");
                
                System.out.println("*******************************************************************************************************");
                System.out.print("**           Ahora ingresa el primer numero del dia en que naciste: ");
                NumUno = in.nextInt();
                System.out.println("*******************************************************************************************************");
                
                System.out.println("*******************************************************************************************************");
                System.out.print("**           Ahora ingresa el segundo numero de tu dia de nacimiento: ");
                NumDos = in.nextInt();
                System.out.println("*******************************************************************************************************");
                
                Resultado = NumUno + NumDos ;
                int Temp = Resultado;
                //La variable temp pasa a valer el resultado de sumar el valor de temp al resultado de sacar el 
                //residuo del número entre 10 (con esta operación, por ejemplo, si tenemos 456 al aplicar el residuo entre 10 el resto 
                //valdrá 6 que es el último dígito del número)
                //Después el número se divide entre 10 para repetir el proceso en el bucle y dividir todos los dígitos mientras 
                //se almacena el valor en la variable resultado
                while(Temp > 0) {
                    SumaDigitos = SumaDigitos + Temp % 10;
                            Temp = Temp / 10;
                }
                System.out.println("*******************************************************************************************************");                
                System.out.println("**                             la suma de los digito es: " + Resultado + "                                           **");
                System.out.println("**                          tu numerologia segun tu dia de nacimiento es: " + SumaDigitos + "                         **");
                System.out.println("*******************************************************************************************************");

            break;

        case 5 :
                System.out.println("              _.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._");
                System.out.println("           .-'---      - ---     --     ---   -----   - --       ----  ----   -     ---`-.");
                System.out.println("            )                                                                           (");
                System.out.println("           (                                                                             )");
                System.out.println("            )                                                                           (");
                System.out.println("           (                                  Shisan22                                   )");
                System.out.println("            )                         https://github.com/Shisan22                       (");
                System.out.println("           (                                                                             )");
                System.out.println("            )                                                                           (");
                System.out.println("           (                                Nekstoreo450                                 )");
                System.out.println("            )                       https://github.com/Nekstoreo450                     (");
                System.out.println("           (                                                                             )");
                System.out.println("            )                                                                           (");
                System.out.println("           (                            (Profe ponganos 5.0)                             )");
                System.out.println("            )                                                                           (");
                System.out.println("           (___       _       _       _       _       _       _       _       _       ___)");
                System.out.println("               (__  _) ( __ _) (__  _) (__ _ ) `-._.-' ( _ __) (_  __) (_ __ ) (_  __)");
                System.out.println("               ( _ __) (_  __) (__ __) `-._.-'         `-._.-' (__ __) (__  _) (__ _ )");
                System.out.println("               (__  _) (_ _ _) `-._.-'                         `-._.-' (_ _ _) (_  __)");
                System.out.println("               (_ ___) `-._.-'                                         `-._.-' (___ _)");
                System.out.println("               `-._.-'                                                         `-._.-'");




            break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

    }
}