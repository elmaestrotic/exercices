public class Ejercicio5 {
    public static void main(String[] args) {
        int tempo = 0;
        int i = 0;
        int vector[] = new int[10];//vector  de 10 enteros
        while (i < 10) {
            tempo = (int) (Math.random() * 100 + 1);
            if (isPrime(tempo)) {
                vector[i] = tempo;
                System.out.print(vector[i] + "|");
                i++;
            }
        }//fin while
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
