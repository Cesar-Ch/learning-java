// package Day-05-methods;

public class Main {
    public static void main(String[] args) {
        saludar();
        System.out.println(sumar(5, 10));
        System.out.println(factorial(5));
    }

    public static void saludar() {
        System.out.println("¡Hola! Bienvenido al mundo de los métodos.");
    }

    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado; // Devuelve el resultado de la suma
    }

    // recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
