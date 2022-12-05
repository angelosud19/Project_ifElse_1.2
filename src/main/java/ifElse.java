import java.util.Locale;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("NUMERO FORA DE INTERVALO");
        }
        else if ( numero > 75 && numero < 100 ) {
            System.out.println("INTERVALO ENTRA 75 e 100");
        }
        else if ( numero > 50 && numero < 75 ) {
            System.out.println("INTERVALO ENTRA 50 e 75");
        }
        else if ( numero > 25 && numero < 50 ) {
            System.out.println("INTERVALO ENTRA 25 e 50");
        }
        else if ( numero > 0 && numero < 25 ) {
            System.out.println("INTERVALO ENTRA 0 e 25");
        }
    }
}

//