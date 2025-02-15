import java.util.Scanner;

public class MainPotencia {

    public static void main(String[] args) {
        // aquí es donde hacemos las llamadas a los métodos

        System.out.println(calcularPotencia(pedirNumero(), pedirNumero()));

        // otro ejemplo
        System.out.println(calcularPotencia(3,5 ));

    }

    //public static = lo puedo invocar desde cualquier otra clase escribiendo Main.pedirNumero()

    /**
     * Método que pide un número por teclado
     * @return el número que el usuario introduce
     */
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        return scanner.nextInt();
    }

    /**
     * Método que calcula una potencia
     * @param base de la potencia a calcular
     * @param exponente al que elevamos la base
     * @return la base elevada al exponente
     */
    public static double calcularPotencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
