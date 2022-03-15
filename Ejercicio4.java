public class Ejercicio4 {
    public static void main(String[] args) {
        String salida = "";
        int vector[] = new int[20];//vector  de 10 enteros
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100 + 1);
            System.out.print(vector[i] + "|");
            if (isPrime(vector[i])) {
                salida += vector[i]+"|";
            }
        }//fin for
        System.out.println();
        System.out.println("Los Primos son: ");
        System.out.println(salida);
    }

    static boolean isPrime(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }//end for
        return true;
    }
}// end class
